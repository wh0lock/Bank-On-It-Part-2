# Bank-On-It-Part-2

## Classes implemented during part 1: 
```
class CheckingAccount implements HasMenu
 ----------------
  double balance
 ----------------
  CheckingAccount()
  CheckingAccount(double balance)
  main()
  string menu()
  void start()
  double getBalance()
  string getBalanceString()
  void setBalance(double balance)
  void checkBalance()
  private double getDouble()
  void makeDeposit()
  void makeWithdrawal()
 ----------------

interface HasMenu()
 ----------------
 ----------------
  string menu()
  void start()
 ----------------

class SavingsAccount extends CheckingAccount
 ----------------
  double interestRate
 ----------------
  main()
  calcInterest()
  void setInterestRate()
  double getInterestRate()
 ----------------

abstract class User implements HasMenu, Serializable
 ----------------
  string userName
  string PIN
 ----------------
  boolean login()
  boolean login(userName, PIN)
  void setUserName(userName)
  string getUserName()
  void setPIN(PIN)
  string getPIN()
  abstract string getReport()
 ----------------

class Customer extends User
 ----------------
  CheckingAccount checking
  SavingsAccount savings
 ----------------
  void main()
  Customer()
  Customer(userName, PIN)
  void start()
  string menu()
  void changePin()
  string getReport()
 ----------------
```

## Classes implemented during part 2:
```
class Admin extends User
 ----------------
 ----------------
  Admin()
  string menu()
  void start()
  string getReport()
 ----------------

class Bank implements HasMenu
 ----------------
  Admin admin
  ArrayList customers
 ----------------
  Bank()
  void main()
  void loadSampleCustomers()
  void saveCustomers()
  void loadCustomers()
  void reportAllUsers()
  void addUser()
  void applyInterest()
  void loginAsCustomer()
  string menu()
  void start()
  void startAdmin()
 ----------------
```
Task One: Admin
  - build the Admin class
  - extends user, login functionality already written
  - constructor sets default username and pin values
  - start() method but leave blank
  - getReport() method, not used, report admin name and PIN

 Task Two: Bank Essentials
  - get basic version of Bank up and running
  - implements HasMenu, needs start() and menu() methods
  - two instance variables
    - single instance of Admin
    - an ArrayList of Customers (or class that extends one)
  - menu() method, main menu of the Bank
  - start() method, Bank menu input handling
  
  Task Three: Implement Admin Menus and Customer Login
  - details (the MEAT of the project)
  - adminStart() method added to Bank class
    - calls admin menu and handles resulting tasks
  - add ability to login as customer
    - method in Bank class
    - asks for UserName and PIN
    - instance of Customer set to null
    - go thru every customer in the customerList
      - if you can log in to that customer, 
        - set currentCustomer to that customer
        - activate start() method of that customer
    - if you get through list without a successful login, tell user
  - Add admin methods to Bank class
    - fullCustomerReport()
      - step thru each customer in list
      - print the getReport() value from that customer
    - addUser()
      - ask user for a userName and a PIN
      - create customer with that information
      - add that customer to the end of the customer list
    - applyInterest()
      - go through each customer in the list
      - apply the calcInterest() method of the savings account for that customer

  Task Four: Implement Serialization
    - create a saveCustomers() method in Bank
    - create a loadCustomers() method in Bank
    - modify the Bank constructor to save and load the data
      - on first pass, create and save the default data for testing purposes
      - after initial save is tested, comment out these lines, but you may want to keep them around for retesting
    - test everything to make sure it's all working
