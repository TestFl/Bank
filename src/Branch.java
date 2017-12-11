import java.util.ArrayList;

public class Branch {
    private String city;
    private ArrayList<Client> clients;

    public Branch(String city) {
        this.city = city;
        this.clients = new ArrayList<Client>();
    }

    public String getCity() {
        return city;
    }

    public boolean newClient(String firstName, String lastname, int idNumber, double initialAmmount){
    if(findIdNumber(idNumber) == null ){
        this.clients.add(new Client(firstName, lastname, idNumber, initialAmmount);
        return true;
    }
    return false;
    }

    public boolean addClientTransaction(int idNumber, double amount){
        Client existingClient = findIdNumber(idNumber);

        if(existingClient != null){
            existingClient.addTransaction(amount);
            return true;
        }
        return false;
    }

    private  Client findIdNumber(int idNumber){
        for(int i=0; i<this.clients.size(); i++){
            Client checkedIdNumber = this.clients.get(i);
            if(checkedIdNumber.getIdNumber() == (idNumber)) {
                return checkedIdNumber;
            }
        }
        return null;
    }

}
