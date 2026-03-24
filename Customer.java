import java.util.*;
import java.io.*;

public class Customer extends User implements Serializable {
  static final long serialVersionUID = 1L;

  CheckingAccount checking = new CheckingAccount();
  SavingsAccount savings = new SavingsAccount();

  public static void main(String[] args){
    Customer cu = new Customer();
    if (cu.login()){
      System.out.println("Login was successful!");
      cu.start();
    } // end if
  } // end main

  public Customer(){
    this.userName = "Alice";
    this.PIN = "1111";
  } // end constructor

  public Customer(String userName, String PIN){
    this.userName = userName;
    this.PIN = PIN;
  } // end Customer

  public String menu(){
    Scanner input = new Scanner(System.in);
    System.out.println("0) Exit");
    System.out.println("1) Manage Checking Account");
    System.out.println("2) Manage Savings Account");
    System.out.println("3) Change PIN");
    System.out.println();
    System.out.print("Please enter 0-3: ");
    String response = input.nextLine();
    return response;
  } // end menu

  public void start(){
    boolean keepGoing = true;
    String response;

    while(keepGoing){
      response = menu();
      if (response.equals("0")){
        keepGoing = false;
      } else if (response.equals("1")){
          System.out.println("Checking Account");
          checking.start();
        } else if (response.equals("2")){
            System.out.println("Savings Account");
            savings.start();
         } else if (response.equals("3")){
              System.out.println("Changing PIN...");
              this.changePin();
           } // end if
    } // end while
  } // end start
  
  public String getReport(){
    String report = "User: " + this.getUserName();
    report += ", Checking: " + this.checking.getBalanceString();
    report += ", Savings: " + this.savings.getBalanceString();
    return report;
  } // end getReport
  
  public void changePin(){
    Scanner input = new Scanner(System.in);
    System.out.println("Current PIN: " + PIN);
    System.out.print("What do you want to change your pin to? ");
    String newPin = input.nextLine();
    String PIN = newPin;
    System.out.println("New PIN: " + newPin);
  } // end changePin

} // end Customer
