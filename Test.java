import java.util.Scanner;


public class Test{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int choose, quantity;
        double total, usermoney, change;
        String item = "";
        double price = 0.0;
       

        System.out.println("\nES Companies Portal - Cashier App 2\n======================================");
        System.out.println("1. Keyboard with price - $49.99.");
        System.out.println("2. Mouse with price - $19.99.");
        System.out.println("3. Monitor with price - $99.99.");
        System.out.println("4. Exit");
        
        System.out.println("Choose : ");
        choose = scn.nextInt();
        if(choose == 4){
            System.exit(0);
        }else{

        }
        System.out.println("Input Quantity [1..20] : ");
        quantity = scn.nextInt();

        //All product has initial stock of 20.
        if(quantity>20) {
                System.out.println("\nOut of stock!");
                System.out.println("\nThanks for using this application :D");
                System.exit(0);
        } else{
            switch (choose){
                case 1:
                    item = "Keyboard";
                    price = 49.99;
                    break;

                case 2:
                    item = "Mouse";
                    price = 19.99;
                    break;

                case 3:
                    item = "Monitor";
                    price = 99.99;
                    break;

                case 4:
                    System.out.println("\nThanks for using this application :D");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid item!");
                    System.out.println("\nThanks for using this application :D");
                    System.exit(0);
                    break;

                
            }
        }
        //Total Price = <item’s price> - <bought quantity>
        total = price * quantity;
        double rounded = Math.round(total * 100.0) / 100.0;

        System.out.println("ES Companies Portal - Invoice\n======================================");
        System.out.println("Item's name : "+item);
        System.out.println("Price : "+price);
        System.out.println("Quantity = "+quantity);
        System.out.println("\nTotal = "+rounded);
        
        System.out.println("Input your money [min " + rounded + "] : ");
        usermoney = scn.nextDouble();  
        if(usermoney < rounded){
                System.out.println("Not Enough Money!");
                System.out.println("\nThanks for using this application :D");
                System.exit(0);
        } else{
            change = usermoney - rounded;
            double rounded2 = Math.round(change * 100.0) / 100.0;
            System.out.println("Your change = "+rounded2);
            System.out.println("\nThanks for using this application :D");
        }
    }
}



    



    