import java.util.ArrayList;

public class Client {
    private String firstName;
    private String lastName;
    int idNumber;
    private ArrayList<Double> transactions;



    public Client(String firstName, String lastName,int idNumber, double initialAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
