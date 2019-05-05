package com.bnb.binh.kimtinnsng.admin;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bnb.binh.kimtinnsng.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private ProgressDialog Loading;
    private DatabaseReference RootRef;
    private Button LoginButton;
    private EditText UserEmail,UserPassword;
    private TextView NeedNewAccountLink,ForgetPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        FirebaseApp.initializeApp(LoginActivity.this);
        mAuth = FirebaseAuth.getInstance();
        RootRef= FirebaseDatabase.getInstance().getReference();

        InitializeFielads();

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                AllowUserToLogin();

            }


        });

    }
    private void AllowUserToLogin()
    {
        String email = UserEmail.getText().toString();
        String password = UserPassword.getText().toString();
        if (TextUtils.isEmpty(email))
        {
            Toast.makeText(this,"Please enter email...",Toast.LENGTH_SHORT).show();
        }
        if (TextUtils.isEmpty(password))
        {
            Toast.makeText(this,"Please enter password...",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Loading.setTitle("Sign In");
            Loading.setMessage("Please wait.........");
            Loading.setCanceledOnTouchOutside(true);
            Loading.show();
            mAuth.signInWithEmailAndPassword(email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task)
                        {
                            if (task.isSuccessful())
                            {
                                String curentUserID = mAuth.getCurrentUser().getUid();
                                RootRef.child("Users").child(curentUserID).setValue("");

                                SendUserToMainActivity();
                                Toast.makeText(LoginActivity.this,"Chào Admin!",Toast.LENGTH_SHORT).show();
                                Loading.dismiss();
                            }
                            else
                            {
                                String message = task.getException().toString();
                                Toast.makeText(LoginActivity.this,"Xin Lỗi! Bạn không phải Admin! ",Toast.LENGTH_SHORT).show();
                                Loading.dismiss();
                            }

                        }
                    });

        }

    }

    private void InitializeFielads()
    {
        LoginButton = (Button) findViewById(R.id.login_buttons);
        UserEmail = (EditText) findViewById(R.id.login_email);
        UserPassword = (EditText) findViewById(R.id.login_key);

        Loading = new ProgressDialog(this);
    }





    private void SendUserToMainActivity()
    {
        Intent MainInten = new Intent(LoginActivity.this,AdminB.class);
        MainInten.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(MainInten);
        fileList();
    }
    private void SendUserToRegisterActivity()
    {
        Intent RegisterIntent = new Intent(LoginActivity.this,RegisterActivity.class);
        startActivity(RegisterIntent);
    }

}
