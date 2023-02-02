import exceptions.AmountException;

public class Main {
    public static void main(String[] args) throws AmountException {
//       Plastic plastic = new Plastic("Organ Wells", 353037, "2082001", 300);
//        try {
//            plastic.addPlastics("Organ Wells", 1);
//        } catch (AmountException e) {
//            throw new RuntimeException(e);
//        }

        Media media = new Media("hyase", 90101, "17804", 50);
        media.addMedia("hyase", 1);

    }


}