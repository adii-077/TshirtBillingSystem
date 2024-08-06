import java.util.ArrayList;
import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the T-shirt Store Billing System!");
        System.out.println("You can exit by entering 'quit'.");
        System.out.println("Please enter user ID:");

        while(true){  //checking credentials
            String userID = sc.nextLine();
            if (userID.equalsIgnoreCase("adi")){
                System.out.println("Please enter password:");

                while(true){
                    String password = sc.nextLine();
                    if (password.equalsIgnoreCase("123")){
                        System.out.println("Log in successful!");

                        System.out.println("Enter number of items: ");
                        int numberOfItems = sc.nextInt();
                        int[] items = new int[numberOfItems];
                        System.out.println("Now enter the prices of " + numberOfItems + " T-shirts:");
                        double price = 0;
                        for (int i = 0; i < numberOfItems; i++) {
                            items[i] = sc.nextInt();
                            price = price + items[i];
                        }
                        System.out.println(price + " is the original total price.");

                        System.out.println("Do you want to apply VAT (13%)? :");
                        System.out.println("Enter yes or no: ");
                        String answerForVAT = sc.nextLine();
                        if (answerForVAT.equalsIgnoreCase("yes")){
                            double PriceWithVAT = price + 0.13 * price ;
                            System.out.println(PriceWithVAT + " is the price including 13% VAT.");
                            price = PriceWithVAT;
                        } else if (answerForVAT.equalsIgnoreCase("no")){
                            System.out.println("Then no need to apply VAT.");
                        } else {
                            System.out.println("Invalid input for VAT.");
                        }

                        System.out.println("Do you want to apply some discount (0-100)? (yes/no):");
                        String answer2 = sc.nextLine();
                        int discountPercentage = sc.nextInt();
                        if (answer2.equalsIgnoreCase("yes")){
                            System.out.println("Enter discount percentage: ");
                            price = price - discountPercentage * price ;
                        } else if (answer2.equalsIgnoreCase("no")){
                            System.out.println("Then no need to apply discount.");
                        } else {
                            System.out.println("Invalid input.");
                        }



                        break;
                    } else if (password.equalsIgnoreCase("quit")) {
                        break;
                    } else {
                        System.out.println("Wrong password!");
                    }
                }
                break;
            } else if (userID.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.println("wrong user ID!");
            }
        }   //checking credentials



    }
}