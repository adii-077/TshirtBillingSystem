import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {

        double price = 0;
        int check = 0;
        int check1 = 0;
        int quitInItemValue = 0;
        int quitInVAT = 0;
        int priceInt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the T-shirt Store Billing System!");
        System.out.println("You can exit by entering 'quit'.");
        System.out.println("Please enter user ID:");

        while (true) {  //checking credentials
            String userID = sc.nextLine();
            if (userID.equalsIgnoreCase("adi")) {
                System.out.println("Please enter password:");

                while (true) {
                    String password = sc.nextLine();
                    if (password.equalsIgnoreCase("123")) {
                        System.out.println("Log in successful!");

                        System.out.println("Enter number of items: ");
                        String numberOfItems = sc.nextLine();
                        if (numberOfItems.equalsIgnoreCase("quit")) {
                            System.out.println("Please visit again. Thank You!");
                            break; //here program terminates
                        } else if (!numberOfItems.equalsIgnoreCase("quit")) {
                            int numberOfItems1 = Integer.parseInt(numberOfItems);
                            double[] items = new double[numberOfItems1]; //Array creation
                            System.out.println("Now enter the prices of " + numberOfItems1 + " T-shirts:");
                            for (int i = 0; i < numberOfItems1; i++) {
                                String itemValue = sc.nextLine();
                                if (itemValue.equalsIgnoreCase("quit")) {
                                    System.out.println("Please visit again. Thank You!");
                                    quitInItemValue = 1;
                                    break;
                                } else if (!itemValue.equalsIgnoreCase("quit")) {
                                    double price1 = Double.parseDouble(itemValue);
                                    items[i] = price1;
                                    price = price + items[i];
                                } else {
                                    System.out.println("Invalid Input!");
                                }
                            }
                        } else {
                            System.out.println("Invalid Input!");
                        }

                        if (price != 0) {
                            System.out.println(price + " is the original total price.");
                        }


                        if (quitInItemValue != 1) {
                            System.out.println("Do you want to apply VAT (13%) (yes/no) ? :");
                        }
                        while (true) {
                            if (quitInItemValue == 1) {
                                break;
                            } else {
                                String answerForVAT = sc.nextLine();
                                if (answerForVAT.equalsIgnoreCase("quit")) {
                                    quitInVAT = 1;
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


                        if (quitInItemValue == 1 || quitInVAT == 1) {
                            break;
                        } else {
                            System.out.println("Do you want to apply some discount? (yes/no):");
                        }
                        while (true) {
                            if (quitInItemValue == 1 || quitInVAT == 1) {
                                break;
                            } else {

                                String answer2 = sc.nextLine();
                                if (answer2.equalsIgnoreCase("quit")) {
                                    System.out.println("Please visit again. Thank You!");
                                    break;
                                } else if (answer2.equalsIgnoreCase("yes")) {
                                    System.out.println("Enter discount percentage: ");
                                    double discountPercentage = sc.nextFloat();
                                    price = price - discountPercentage * 0.01 * price;
                                    priceInt = (int) price;
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


                        priceInt = (int) price;
                        if (priceInt != 0) {
                            System.out.println("The final price is: " + price);
                            System.out.println("price in Integer is: " + priceInt);
                            System.out.println("Enter the amount you want to pay:");
                            int amountStr = sc.nextInt();
//                            String amountInString = sc.nextLine();
//                            if (amountInString.equalsIgnoreCase("quit")) {
//                                System.out.println("Please visit again. Thank You!");
//                                break;
//                            } else if (!amountInString.equalsIgnoreCase("quit")) {
//                                    int amountEntered = Integer.parseInt(amountInString);
                            int amount = amountStr - priceInt;
                            //                                amount = amountStr - priceInt;
                            int[] notes = {1000, 500, 100, 50, 20, 10, 5, 1};

                            System.out.println("The change should be given in the following manner:");

                            int count = amount / notes[0];
                            if (count > 0) {
                                System.out.println(notes[0] + " x " + count);
                            }
                            amount = amount % notes[0];

                            int count1 = amount / notes[1];
                            if (count1 > 0) {
                                System.out.println(notes[1] + " x " + count1);
                            }
                            amount = amount % notes[1];

                            int count2 = amount / notes[2];
                            if (count2 > 0) {
                                System.out.println(notes[2] + " x " + count2);
                            }
                            amount = amount % notes[2];

                            int count3 = amount / notes[3];
                            if (count3 > 0) {
                                System.out.println(notes[3] + " x " + count3);
                            }
                            amount = amount % notes[3];

                            int count4 = amount / notes[4];
                            if (count4 > 0) {
                                System.out.println(notes[4] + " x " + count4);
                            }
                            amount = amount % notes[4];

                            int count5 = amount / notes[5];
                            if (count5 > 0) {
                                System.out.println(notes[5] + " x " + count5);
                            }
                            amount = amount % notes[5];

                            int count6 = amount / notes[6];
                            if (count6 > 0) {
                                System.out.println(notes[6] + " x " + count6);
                            }
                            amount = amount % notes[6];

                            int count7 = amount / notes[7];
                            if (count7 > 0) {
                                System.out.println(notes[7] + " x " + count7);
                            }

//                            } else {
//                                System.out.println("Invalid Input!");
//                            }

                        }

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