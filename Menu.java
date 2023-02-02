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

//        private static Plastic authenticatePlastic (Plastic name){
//            Plastic plastic = Datasource.getPlastic(name);
//            if (plastic == null) {
//                System.out.println("This item does NOT exist in the Plastics Inventory");
//            }
//            return plastic;
//        }
//        private static Media authenticateMedia(Media name){
//            Media media = Datasource.getMedia(name);
//            if (media == null) {
//                System.out.println("This item does NOT exist in the Media Inventory");
//            }
//            return media;
//        }
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
                int amount;
                String name = null;

                switch (selection) {
                    case 1: //adding plastic
                        System.out.println("what plastic would you like to add?");
                        name = scanner.next();
                        System.out.println("how much would you like to add?");
                        amount = scanner.nextInt();
                        //addPlastics(name, amount); //this method is supposed to take in the name and amount of item to add
                        break;
                    case 2: //remove Plastic
                        break;
                    case 3: //show plastic inventory
                        break;
                    case 4: //adding Media
                        System.out.println("what Media would you like to add?");
                        name = scanner.next();
                        System.out.println("how much would you like to add?");
                        amount = scanner.nextInt();
                        //addMedia(name, amount);
                        break;
                    case 5: //remove Media
                        break;
                    case 6: //show Media inventory
                        break;
                    case 7: //exit menu
                        break;
                    default:
                        System.out.println("Invalid selection; please selection between: 1-7.");
                        break;
                }
            }
        }
//        private void showMediaMenu(Media name){
//            int selection = 0;
//
//            while (selection != 4) {
//                System.out.println("===========================================");
//                System.out.println("Please select from the following options: "
//                        + "\n 1: Add a Media to Inventory"
//                        + "\n 2: Remove a Media from Inventory"
//                        + "\n 3: Show Media Inventory"
//                        + "\n 4. Exit Menu");
//                System.out.println("=============================================");
//
//                selection = scanner.nextInt();
//                int amount;
//
//                switch (selection) {
//                    case 1: //adding Media
//                        System.out.println("what Media would you like to add?");
//                        name = scanner.next();
//                        System.out.println("how much would you like to add?");
//                        amount = scanner.nextInt();
//                        break;
//                    case 2: //remove Media
//                        break;
//                    case 3: //show Media inventory
//                        break;
//                    case 4: //exit menu
//                        break;
//                    default:
//                        System.out.println("Invalid selection; please selection between: 1-4.");
//                        break;
//                }
//            }
//        }
    }

