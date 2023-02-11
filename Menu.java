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
                Media media = null;
                String name;
                int amount = 0;
                int referenceNumber;
                String lotNumber;
                int currentBalance;

                switch (selection) {
                    case 1: //adding plastic
                           // addPlastics(name, amount); //this method is supposed to take in the name and amount of item to add
                        System.out.println("What is the name of the plastic you would like to add?");
                        name = scanner.next();
                        System.out.println("Please enter the reference number.");
                        referenceNumber = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("please enter the lot number");
                        lotNumber = scanner.next();
                        System.out.println("Please enter the current balance.");
                        currentBalance = scanner.nextInt();
                        System.out.println("How much would you like like to add?");
                        amount = scanner.nextInt();
                        Plastic plastic = null;
                        plastic = new Plastic(name, referenceNumber, lotNumber, currentBalance);
                        try{
                             plastic.addPlastics(name, amount);

                        }catch(AmountException e){
                            e.getMessage();
                            System.out.println("Please try again");
                        }
                        break;
                    case 2:
                        System.out.println("What is the name of the plastic you would like to remove?");
                        name = scanner.next();
                        System.out.println("Please enter the reference number.");
                        referenceNumber = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("please enter the lot number");
                        lotNumber = scanner.next();
                        System.out.println("Please enter the current balance.");
                        currentBalance = scanner.nextInt();
                        System.out.println("How much would you like like to remove?");
                        amount = scanner.nextInt();
                        plastic = new Plastic(name, referenceNumber, lotNumber, currentBalance);
                        try{
                            plastic.removePlastics(name, amount);
                        }catch(AmountException e){
                            e.getMessage();
                            System.out.println("Please try again");
                        }
                        break;
                    case 3:
                        Datasource.printPlasticInventory();
                        break;
                    case 4: //adding Media
                        //addMedia(name, amount);
                        System.out.println("What is the name of the Media you would like to add?");
                        name = scanner.next();
                        System.out.println("Please enter the reference number.");
                        referenceNumber = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("please enter the lot number");
                        lotNumber = scanner.next();
                        System.out.println("Please enter the current balance.");
                        currentBalance = scanner.nextInt();
                        System.out.println("How much would you like like to add?");
                        amount = scanner.nextInt();
                        media = new Media(name, referenceNumber, lotNumber, currentBalance);
                        try{
                            media.addMedia(name, amount);
                        }catch(AmountException e){
                            e.getMessage();
                            System.out.println("Please try again");
                        }
                        break;
                    case 5: //remove Media
                        System.out.println("What is the name of the media you would like to remove?");
                        name = scanner.next();
                        System.out.println("Please enter the reference number.");
                        referenceNumber = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("please enter the lot number");
                        lotNumber = scanner.next();
                        System.out.println("Please enter the current balance.");
                        currentBalance = scanner.nextInt();
                        System.out.println("How much would you like like to remove?");
                        amount = scanner.nextInt();
                        media = new Media(name, referenceNumber, lotNumber, currentBalance);
                        try{
                            media.removeMedia(name, amount);
                        }catch(AmountException e){
                            e.getMessage();
                            System.out.println("Please try again");
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

