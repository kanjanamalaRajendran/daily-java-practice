class AccountDetail{
  private int Accountno;
  private String  Name;
  private int AccBalance;
  private int AccMobileNo;
  private final String BankName = "indian oversis bank";
  private int ifscno;
  
  public int getAccountno(){
      return Accountno;
  }
  public void setAccountno(int Accountno){
      this.Accountno = Accountno;
  }
  public String getName(){
      return Name;
  }
  public void setName(String Name){
      this.Name=Name;
  }
  public int getAccBalance(){
      return AccBalance;
  }
  public void setAccBalance(int AccBalance){
      this.AccBalance=AccBalance;
  }
  public int getAccMobileNo(){
      return AccMobileNo;
  }
  public void setAccMobileNo(int AccMobileNo){
      this.AccMobileNo=AccMobileNo;
  }
  public int getifsno(){
      return ifscno;
  }
  public void setifscno(int ifscno){
      this.ifscno=ifscno;
    }
  @Override
  public String toString(){
      return Accountno+","+Name+","+AccBalance+","+AccMobileNo+","+ifscno;
  }
  public static void main(String [] args){
      AccountDetail obj = new AccountDetail();
      obj.setAccountno(12345);
      obj.setName("kana");
      obj.setAccBalance(50000);
      obj.setAccMobileNo(234568);
      obj.setifscno(563464);
      System.out.println(obj.toString());
        }
  
}
