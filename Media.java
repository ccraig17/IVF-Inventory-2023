import exceptions.AmountException;

public class Media {
    private String name;
    private int reference_number;
    private String lot_number;
    private int balance;

    public Media(String name, int reference_number, String lot_number, int balance){
        setName(name);
        setReference_number(reference_number);
        setLot_number(lot_number);
        setBalance(balance);
    }
    public int addMedia(String name, int amount) throws AmountException{
        int newBalance;
        if(amount <1){
            throw new AmountException("Invalid amount; the minimum amount is 1 item to deposit.");
        }else{
            newBalance = balance + amount;
            setBalance(newBalance);
            Datasource.updateMedia(name, newBalance);
            //update Datasource, Method: update Media. this method will accept the name and newBalance
        }
        return balance;

    }
    public int removeMedia(String name,int amount) throws AmountException{
        int newBalance;
        if(amount <0){
            throw new AmountException("The amount to withdraw must greater than 0.");
        }else if(amount > balance){
            throw new AmountException("There are no more of this item; please order more.");

        }else{
            newBalance = balance - amount;
            setBalance(newBalance);
            Datasource.updateMedia(name, newBalance);
            //update Datasource, Method: update Media. this method will accept the name and newBalance
        }
        return newBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReference_number() {
        return reference_number;
    }

    public void setReference_number(int reference_number) {
        this.reference_number = reference_number;
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
