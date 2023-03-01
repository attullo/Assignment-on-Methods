/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanager;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Students
 */
public class Hotelmanager {
    //declare the menu items and their prices
    Private static ArrayList<String>menuitems=new ArrayList<String>();
    Private static ArrayList<Double>menuPrices=new ArrayList<Double>();
   
    public static void main(String[]args){
        //add Food and Drinks to the Menu
        menuitems.add("Mukimo and Meat");
        menuPrices.add(200);
        menuitems.add("Chips and Chicken");
        menuPrices.add(400);
        menuitems.add("Mukimo and Meat");
        menuPrices.add(200);
        menuitems.add("mbuzi choma");
        menuPrices.add(500);
        menuitems.add("Pizza and Coke");
        menuPrices.add(850);
        menuitems.add("Smocha and Blended Juice");
        menuPrices.add(150);
        menuitems.add("Water");
        menuPrices.add(60);
        
       System.out.println("Welcome to Jabal Restaurant");
       System.out.println("Menu:");
       for (int i=0;i<menuitems.size(); i++){
           System.out.println((i+1)+"."+menuitems.get(i)+"-Ksh"+menuPrices.get(i));
       }
       
       //Add items to a menu
       Scanner scanner = new Scanner(System.in);
       int choice=1;
       while(choice !=0){
        System.out.println("\nEnter 1 to add a new menu item or 0 to continue:");
        String newItem = scanner.next();
        System.out.println("Enter the price of "+newItem"in Ksh:");
        Double newPrice = Scanner.nextDouble();
        menuItems.add(newItem);
        menuPrices.add(newPrice);
        
    }
       
    }
    
    //Allow customer to order Food and drinks
    ArrayList<String>customerOrder = new ArrayList<String>();
    ArrayList<Double>customerPrices = new ArrayList<Double>();
    Choice = 1;
    while(choice!=0){
    System.out.println("\nEnter the number of the menu you want to order or 0 to finish");
    Chioce=scanner.nextint();
    if (choice !=0){
        customerOrder.add(menuItems.get(choice-1));
        customerOrder.add(menuPrices.get(choice-1));
    }
}
    Double total = 0.0;
    System.out.println("\Order Details");
    for(int i=0; i<customerOrder.size();i++){
    System.out.println(cuustomerOrder.get(i)+"-Ksh"+customerPrices.get(i));
    totalBill +=customerPrices.get(i);
}
    System.out.println("Total Bill: Ksh"+totatBill);
    
    //Allow users to make payments via mobile money
    System.out.println("\nEnter the mobile payment amount in Ksh:");
    Double paymentAmount=scanner.nextDouble();
    System.out.println("Enter the date of payement in YYYY-MM-DD format:");
    String paymentDate=scanner.next();
    
    //Store payment information in the database
    storePayment(paymentAmaount, paymentDate);
    
        //method to store payment information in the database
        Public static void storePayment(double amount, String date){
            System.out.println("Payment of Ksh" +amount +"on"+date+"has been approved.");
        }
}
