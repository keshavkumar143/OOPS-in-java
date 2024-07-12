// Encapsulation -> restricts direct access to data, enforcing controlled interaction via
//  methods for data protection and integrity.

public class Encapsulation_example {
    private int bank_balance;
    private int id;

    Encapsulation_example(int bank_balance, int id) {
        this.id = id;

        if (bank_balance > 0) {
            this.bank_balance = bank_balance;
        }

        else {
            System.out.println("your bank balance is 0");
        }
    }

        public void accountBalance(){ 
            System.out.println("Your account balance is : " + bank_balance);
        }

        public void deposite(int n){
            bank_balance += n;
            System.out.println("Your bank balance is : " + bank_balance);
            
        }

        public void withdraw(int withdraw_ammount){ 
            if(bank_balance < 0){
                System.out.println("You can't withdraw");
            }

          else {
            bank_balance -= withdraw_ammount; 
            System.out.println("Now your bank balance is : " + bank_balance);
          }

        }

    public static void main(String[] args) {

        Encapsulation_example obj1 = new Encapsulation_example(100,1234); 

        obj1.accountBalance(); 
        obj1.deposite(1000); 
        obj1.withdraw(200);

        obj1.accountBalance();
    }
}
