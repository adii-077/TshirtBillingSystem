import java.util.ArrayList;
import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {

        double price = 0;
        int check = 0;
        int check1 = 0;
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
                        String numberOfItems = sc.nextLine();
                        if (numberOfItems.equalsIgnoreCase("quit")){
                            System.out.println("Please visit again. Thank You!");
                            break; //here program terminates
                        } else if (!numberOfItems.equalsIgnoreCase("quit")){
                            int numberOfItems1 = Integer.parseInt(numberOfItems);
                            double[] items = new double[numberOfItems1]; //Array creation
                            System.out.println("Now enter the prices of " + numberOfItems1 + " T-shirts:");
                            for (int i = 0; i < numberOfItems1; i++) {
                                String itemValue = sc.nextLine();
                                if (itemValue.equalsIgnoreCase("quit")){
                                    System.out.println("Please visit again. Thank You!");
                                    check = 1;
                                    break;
                                } else if (!itemValue.equalsIgnoreCase("quit")){
                                    double price1 = Double.parseDouble(itemValue);
                                    items[i] = price1;
                                    price = price + items[i];
                                } else {
                                    System.out.println("Invalid Input!");
                                }
//                            break;
                            }
                        } else {
                            System.out.println("Invalid Input!");
                        }

                        if (price!=0){
                            System.out.println(price + " is the original total price.");
                        }




                        System.out.println("Do you want to apply VAT (13%) (yes/no) ? :");
                        while(true) {
                            if (check == 1) {
                                break;
                            } else {
                                String answerForVAT = sc.nextLine();
                                if (answerForVAT.equalsIgnoreCase("quit")) {
                                    check1 = 1;
                                    System.out.println("Please visit again. Thank You!");
                                    break;
                                } else if (answerForVAT.equalsIgnoreCase("yes")) {
                                    double PriceWithVAT = price + 0.13 * price;
                                    System.out.println(PriceWithVAT + " is the price including 13% VAT.");
                                    price = PriceWithVAT;
                                    break;
                                } else if (answerForVAT.equalsIgnoreCase("no")) {
                                    System.out.println("Then no need to apply VAT.");
                                    break;
                                } else {
                                    System.out.println("Invalid Input!");
                                    System.out.println("Please try again.");
                                }
                            }
                        }



                        System.out.println("Do you want to apply some discount? (yes/no):");
                        while(true) {
                            if (check == 1 && check1 == 1) {
                                break;
                            } else {
                                String answer2 = sc.nextLine();
                                if (answer2.equalsIgnoreCase("quit")) {
                                    System.out.println("Please visit again. Thank You!");
                                    break;
                                } else if (answer2.equalsIgnoreCase("yes")) {
                                    System.out.println("Enter discount percentage: ");
                                    int discountPercentage = sc.nextInt();
                                    price = price - discountPercentage * 0.01 * price;
                                    break;
                                } else if (answer2.equalsIgnoreCase("no")) {
                                    System.out.println("Then no need to apply discount.");
                                    break;
                                } else {
                                    System.out.println("Invalid input.");
                                    System.out.println("Please try again.");
                                }
                            }
                        }


                        System.out.println("The final price is: " + price);
                        break;
                    } else if (password.equalsIgnoreCase("quit")) {
                        System.out.println("Please visit again. Thank You!");
                        break;
                    } else {
                        System.out.println("Wrong password!");
                    }
                }
                break;
            } else if (userID.equalsIgnoreCase("quit")) {
                System.out.println("Please visit again. Thank You!");
                break;
            } else {
                System.out.println("wrong user ID!");
            }
        }   //checking credentials

    }
}