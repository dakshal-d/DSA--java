
public class MethodOverriding {
    public static void main(String[] args) {
        Bank bank=new Bank();
        SBI sbi=new SBI();
        HDFC hdfc = new HDFC();
        System.out.println(bank.rateofInterest());
        System.out.println(hdfc.rateofInterest());
        System.out.println(sbi.rateofInterest());
    }
    
}

class Bank{
    int rateofInterest(){
        return 0;
    } 

}
class SBI{
    int rateofInterest(){
        return 7;
    } 

}
class HDFC{
    int rateofInterest(){
        return 9;
    } 

}
// Runtime polymorphism