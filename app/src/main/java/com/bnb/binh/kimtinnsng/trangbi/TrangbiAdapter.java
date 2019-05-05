package com.bnb.binh.kimtinnsng.trangbi;

public class TrangbiAdapter {

   private String tentrangbivatly;
   private String thuoctinhtrangbivatly;
   private int icontrangbivatly;

   public TrangbiAdapter() {
   }

   public TrangbiAdapter(String tentrangbivatly, String thuoctinhtrangbivatly, int icontrangbivatly) {
      this.tentrangbivatly = tentrangbivatly;
      this.thuoctinhtrangbivatly = thuoctinhtrangbivatly;
      this.icontrangbivatly = icontrangbivatly;
   }

   public String getTentrangbivatly() {
      return tentrangbivatly;
   }

   public void setTentrangbivatly(String tentrangbivatly) {
      this.tentrangbivatly = tentrangbivatly;
   }

   public String getThuoctinhtrangbivatly() {
      return thuoctinhtrangbivatly;
   }

   public void setThuoctinhtrangbivatly(String thuoctinhtrangbivatly) {
      this.thuoctinhtrangbivatly = thuoctinhtrangbivatly;
   }

   public int getIcontrangbivatly() {
      return icontrangbivatly;
   }

   public void setIcontrangbivatly(int icontrangbivatly) {
      this.icontrangbivatly = icontrangbivatly;
   }
}
