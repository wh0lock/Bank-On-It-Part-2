import java.util.*;
import java.io.*;

public class Admin extends User{
  public Admin(){
    String userName = "admin";
    String PIN = "0000";
    this.userName = userName;
    this.PIN = PIN;
  } // end constructor

  public String menu(){
    Scanner input = new Scanner(System.in);
    System.out.println("0) Exit");
    System.out.println("1) Full customer report");
    System.out.println("2) Add user");
    System.out.println("3) Apply interest to savings accounts");
    System.out.println();
    System.out.print("Action: ");
    String response = input.nextLine();
    return response;
  } // end menu

  public void start(){
    
  } // end start

  public String getReport(){
    Scanner input = new Scanner(System.in);
    System.out.println("Admin report");
    String report = input.nextLine();
    System.out.println("User: " + userName + "PIN: " + PIN);
    return report;
  } // end getReport
} // end Admin

