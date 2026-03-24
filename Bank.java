import java.util.*;
import java.io.*;

public class Bank implements HasMenu {
  Admin admin = new Admin();
  CustomerList customers = new CustomerList();

  public static void main(String[] args){
    new Bank();
  } // end main

  public Bank(){
    this.start();
  } // end constructor

  public String menu(){
    Scanner input = new Scanner(System.in);
    System.out.println("Bank Menu");
    System.out.println();
    System.out.println("0) Exit");
    System.out.println("1) Login as admin");
    System.out.println("2) Login as customer");
    System.out.println();
    System.out.print("Action: ");
    String response = input.nextLine();
    return response;
  } // end menu

  public void start(){
    boolean keepGoing = true;
    while (keepGoing){
      String response = menu();
      if (response.equals("0")){
        keepGoing = false;
      } else if (response.equals("1")){
          System.out.println("Admin login");
        } else if (response.equals("2")){
            System.out.println("Customer login");
          } else {
              System.out.println("Please enter 0, 1, or 2");
            } // end if
    } // end while
  } // end start

} // end Bank

class CustomerList extends ArrayList<Customer> {};
