public class BalanceAccount{
Privet int Account_number;
Privet double Account_balance;
BalanceAccount(){
   
    Account_number=0;
    Account_balance=0;
}
 public void SetInput(int Account_number,double Account_balance)
 {
   this.Account_number= Account_number;
   this.Account_balance= Account_balance;
 }
 public void Show_Data(){
    System.out.println("Account Number :"+ Account_number);
    System.out.println("Account Balance :"+Account_balance);
 }
  public void Deposit(double Account_balance){
    if (update_value<0){
        System.out.println("Negative value shouldn't deposet");
    }
    else
    Account= Account_balance + update_value;
  }

}