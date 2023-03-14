import java.util.Scanner;
import java.lang.Math;


public class cashierApp{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("ES Companies Portal - Cashier App\n========================================");
        System.out.println("Input item's name: ");
        String itemname = scan.nextLine();
        System.out.println("Input item's price [use decimal numbers]: $ ");
        Double itemprice = scan.nextDouble();
        System.out.println("Input item's quantity [1..20]: ");
        int itemquan = scan.nextInt();
        System.out.println("Input your item's discount [0..50]: ");
        int itemdisc = scan.nextInt();
       
        //invoice
        System.out.println("\nES Companies Portal - Invoice\n========================================");
        System.out.println("Item's name: "+itemname);
        System.out.println("Item's price: "+itemprice);
        System.out.println("Item's quantity: "+itemquan);
        System.out.println("Item's discount: "+itemdisc+"%");
            //Total Price = <item’s price> * <item’s quantity> * (100 – < item’s discount>) / 100
        double totalprice = itemprice * itemquan * (100-itemdisc)/100;


        //round to at most 2 decimal places
        double rounded = Math.round(totalprice*100)/100.0;
        System.out.println("\nYou have to pay $"+rounded);


        //user input their amount of money
        System.out.println("\nInput your money [use decimal numbers]: $");
        int usermoney = scan.nextInt();
        System.out.println("\nThanks for purchasing!");
        //User change = <inputted money> - <total price>
        double userchange = usermoney - totalprice;
        //round to at most 2 decimal places
        double rounded2 = Math.round(userchange*100)/100.0;
        System.out.println("You have to pay $"+rounded2);
       
        scan.close();
        }
}