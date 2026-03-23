import java.util.*;
import java.io.*;

public class Bank implements HasMenu(){
  Admin admin = new Admin();
  ArrayList<String> Customers = new ArrayList<String>();

  public Bank(){
    //this.loadSampleCustomers();
    //this.saveCustomers();
    this.loadCustomers();
    this.start();
    this.saveCustomers();
  } // end constructor

  

