import java.util.Scanner;

public class Menu {
    private static Scanner scanner;

    public static void main(String[] args) {
        System.out.println("Welcome to THE IVF INVENTORY!");
        Menu menu = new Menu();
        menu.scanner = new Scanner(System.in);

        menu.showMenu();


            menu.scanner.close();
        }

        private void showMenu (){
            int selection = 0;

            while (selection != 7) {
                System.out.println("===========================================");
                System.out.println("Please select from the following options: "
                        + "\n 1: Add a Plastic to Inventory"
                        + "\n 2: Remove a Plastic from Inventory"
                        + "\n 3: Show Plastic Inventory"
                        + "\n 4: Add a Media to Inventory"
                        + "\n 5: Remove a Media from Inventory"
                        + "\n 6: Show Media Inventory"
                        + "\n 7. Exit Menu");
                System.out.println("=============================================");

                selection = scanner.nextInt();
                String name;
                int amount;
                int referenceNumber;
                String lotNumber;
                int currentBalance;

                switch (selection) {
                    case 1: //adding plastic
                           // addPlastics(name, amount); //this method is supposed to take in the name and amount of item to add
                        System.out.println("Please enter the name of the Plastic you wish to Add: ");
                        name = scanner.nextLine();
                        System.out.println("Please enter the Plastic's reference number");
                        int reference_number = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Please enter the lot number for " + name);
                        String lot_number = scanner.nextLine();
                        System.out.println("Please enter the current balance of " + name);
                        balance = scanner.nextInt();
                        System.out.println("How much would you like of " + name + " would you like to add");
                        amount = scanner.nextInt();
                        Plastic plastic = new Plastic (name, reference_number, lot_number, balance );
                        try {
                            plastic.addPlastics(name, amount);
                        } catch (AmountException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 2:
                        System.out.println("Please enter the plastic name you wish to remove");
                        name = scanner.nextLine();
                        System.out.println("Please enter the reference number of " + name);
                        reference_number = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Please enter the lot number for " + name);
                        lot_number = scanner.nextLine();
                        System.out.println("please enter the current balance for " + name);
                        balance = scanner.nextInt();
                        System.out.println("How much would you like of " + name + " would you like to remove");
                        amount = scanner.nextInt();

                        plastic = new Plastic (name, reference_number, lot_number, balance );
                        try {
                            plastic.removePlastics(name, amount);
                        } catch (AmountException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 3:
                        Datasource.printPlasticInventory();
                        break;
                    case 4: //adding Media
                        //addMedia(name, amount);
                        System.out.println("please enter the media name");
                        name = scanner.nextLine();
                        System.out.println("please enter the reference number");
                        reference_number = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("please enter the lot number for " + name);
                        lot_number = scanner.nextLine();
                        System.out.println("please enter the current balance for " + name);
                        balance = scanner.nextInt();
                        System.out.println("How much would you like of " + name + " would you like to add");
                        amount = scanner.nextInt();
                        Media media = new Media(name, reference_number, lot_number, balance);
                        try {
                            media.addMedia(name, amount);
                        } catch (AmountException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 5: //remove Media
                        System.out.println("Please enter the media name you wish to remove");
                        name = scanner.nextLine();
                        System.out.println("Please enter the reference number of " + name);
                        reference_number = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Please enter the lot number for " + name);
                        lot_number = scanner.nextLine();
                        System.out.println("please enter the current balance for " + name);
                        balance = scanner.nextInt();
                        System.out.println("How much would you like of " + name + " would you like to remove");
                        amount = scanner.nextInt();

                        media = new Media(name, reference_number, lot_number, balance);
                        try {
                            media.removeMedia(name, amount);
                        } catch (AmountException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 6:
                        Datasource.printMediaInventory();
                        break;
                    case 7:
                        System.out.println("Thank you for using 'The IVF INVENTORY!'");
                        break;
                    default:
                        System.out.println("Invalid selection; please selection between: 1-7.");
                        break;
                }
            }
        }


    }

