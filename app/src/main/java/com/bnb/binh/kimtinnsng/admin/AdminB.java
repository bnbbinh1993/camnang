package com.bnb.binh.kimtinnsng.admin;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bnb.binh.kimtinnsng.MainActivity;
import com.bnb.binh.kimtinnsng.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AdminB extends AppCompatActivity {
    private ImageView icon_tin_tuc;
    private TextView ten_tin_tuc;
    private TextView noi_dung_tin_tuc;
    private TextView ngay_dang_tin;
    private TextView nguon_tin;
    private Button dang_tin;
    private DatabaseReference RootRef;
    private FirebaseDatabase myRef;
    private FirebaseAuth mAuth;
    private FirebaseUser currentUser;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_b);

        begin();
        event();


    }



    private void event()
    {
        dang_tin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String tentintuc = ten_tin_tuc.getText().toString();
                    if(tentintuc.isEmpty()){
                        Toast.makeText(AdminB.this,"Nhập Tên Vào",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {

                       Dangtin(tentintuc);
                       Intent intent = new Intent(AdminB.this,MainActivity.class);
                       startActivity(intent);

                    }

            }
        });


    }
    private void Dangtin(final String tentintuc){
        FirebaseApp.initializeApp(this);
        mAuth = FirebaseAuth.getInstance();
        RootRef = FirebaseDatabase.getInstance().getReference();
        currentUser = mAuth.getCurrentUser();
        RootRef.child("TinTuc").child(tentintuc).setValue("Admin")
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task)
                    {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(AdminB.this,"Đăng Tin Thành Công",Toast.LENGTH_SHORT).show();
                        }
                    }
                });


    }



    private void begin()
    {
        ten_tin_tuc = (TextView)findViewById(R.id.ten_su_kien);
        noi_dung_tin_tuc = (TextView)findViewById(R.id.noi_dung);
        ngay_dang_tin = (TextView)findViewById(R.id.ngay_dang);
        nguon_tin = (TextView)findViewById(R.id.nguon);
        icon_tin_tuc = (ImageView)findViewById(R.id.icon_tin_tuc);
        dang_tin = (Button)findViewById(R.id.dang_tin);

    }

    private void RequestNewGroup()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(AdminB.this,R.style.AlertDialog);
        builder.setTitle("Enter Gruop Name :");

        final EditText gruopNameField = new EditText(AdminB.this);
        gruopNameField.setHint("Admin NB");
        builder.setView(gruopNameField);

        builder.setPositiveButton("Create", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                String groupname = gruopNameField.getText().toString();
                if (TextUtils.isEmpty(groupname))
                {
                    Toast.makeText(AdminB.this,"Vui lòng điền tên nhóm của bạn...",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    CreateNews(groupname);
                }
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i)
            {
                dialog.cancel();
            }
        });
        builder.show();

    }

    private void CreateNews(final String tintucname)
    {
        RootRef.child("TinTuc").child(tintucname).setValue("Admin")
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task)
                    {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(AdminB.this,tintucname+ " đã được tạo thành công!!!",Toast.LENGTH_SHORT).show();
                        }

                    }
                });
    }


}
