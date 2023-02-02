import exceptions.AmountException;

public class Plastic {
    private String name;
    private int reference_number;
    private String lot_number;
    private int balance;

    public Plastic(String name, int reference_number, String lot_number, int balance){
        setName(name);
        setReferenec_number(reference_number);
        setLot_number(lot_number);
        setBalance(balance);
    }

    public void addPlastics(String name, int amount) throws AmountException{
        int newBalance;
        if(amount <1){
            throw new AmountException("Invalid amount; the minimum amount is 1 item to deposit.");
        }else{
            newBalance = balance + amount;
            setBalance(newBalance);
            Datasource.updatePlastics(name,newBalance);
            //update Datasource, Method: update Plastics. this method will accept the name and newBalance
        }
    }
    public void removePlastics(String name, int amount) throws AmountException{
        int newBalance;
        if(amount <0){
            throw new AmountException("The amount to withdraw must greater than 0.");
        }else if(amount > balance){
            throw new AmountException("There are no more of this item; please order more.");

        }else{
            newBalance = balance - amount;
            setBalance(newBalance);
            Datasource.updatePlastics(name, newBalance);
            //update Datasource, Method: update Plastics. this method will accept the name and newBalance
        }


    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReferene_number() {
        return reference_number;
    }

    public void setReferenec_number(int referenec_number) {
        this.reference_number = referenec_number;
    }

    public String getLot_number() {
        return lot_number;
    }

    public void setLot_number(String lot_number) {
        this.lot_number = lot_number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
