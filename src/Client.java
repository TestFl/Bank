import java.util.ArrayList;

public class Client {
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private int bankPersonalNumber;
    private ArrayList<Double> transactions;



    public Client(String firstName, String lastName, int phoneNumber, long bankPersonalNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.bankPersonalNumber = bankPersonalNumber;
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }
     public int crateAccounNumber(){
        int newAccountNumber = 10000 +(int) Math.random()* 90000;
        if (getAccountNumber() == newAccountNumber){
            int newAccountNumber = 10000 +(int) Math.random()* 90000;
        }
        return newAccountNumber;
     }

     private int getAccountNumber(){
         return 0;
     }

}
