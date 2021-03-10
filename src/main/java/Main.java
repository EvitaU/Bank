import controller.Bank;
import entity.User;
import java.util.Scanner;

public class Main {

    private static Scanner scan;

    //psvm shortcut - public static void
    public static void main(String[] args) {
        Bank bank = new Bank();

        {

            User user = new User("000554515525155", 100.00, "Rebeca Anderson", "female");
            bank.setActiveUser(user);
            bank.getUserBalance();

            System.out.println("Welcome to bank " + user.name);
            System.out.println("Current balance: " + bank.getUserBalance());

            String response = bank.creditUser(200.52);
            System.out.println(response);
            System.out.println(bank.creditUser(23.50));
            System.out.println(bank.creditUser(50.40));
            System.out.println(bank.creditUser(732.20));
            //sout shortcut - system out println

            System.out.println("Current balance: " + bank.getUserBalance());
        }
        {
            User user = new User("38384838", 530.23, "Oscar Smith", "male");
            bank.setActiveUser(user);
            bank.getUserBalance();

            Scanner scan = new Scanner(System.in);
            boolean correctLogin = false;
            String username;
            String enteredUsername;

            while (correctLogin != true) {
                System.out.println("\nEnter username: ");
                enteredUsername = scan.nextLine();

                if (enteredUsername.equals("Oscar.Smith")) {
                    System.out.println("Access granted.");

                    System.out.println("\nWelcome to bank " + user.name);
                    System.out.println("Current balance: " + bank.getUserBalance());

                    String response = bank.debitUser(144.35);
                    System.out.println(response);
                    System.out.println(bank.debitUser(204.32));
                    System.out.println(bank.debitUser(62.21));
                    System.out.println(bank.debitUser(223.44));

                    System.out.println("Current balance: " + bank.getUserBalance());
                    correctLogin = true;
                    break;

                } else {
                    System.out.println("Access denied. Try again!");
                }

            }

            //new User
            System.out.println("\nWelcome to bank.");
            System.out.println("To register new account - ");
            Scanner myObj = new Scanner(System.in);
            System.out.println("\nEnter name");
            String name = myObj.nextLine();
            System.out.println("Enter surname");
            String surname = myObj.nextLine();
            System.out.println("Set username");
            String userName = myObj.nextLine();
            System.out.println("Enter gender");
            String gender = myObj.nextLine();
            System.out.println("Enter age");
            Integer age = myObj.nextInt();

            boolean acceptYes = false;
            String enteredYes;
            System.out.println("Make sure all your information is correct!");
            String accept = myObj.nextLine();

            while (acceptYes != true) {
                System.out.println("\nDo you want to create new account?");
                enteredYes = scan.nextLine();

            if (enteredYes.equals("Yes")) {

                long randomNum = (long) (Math.random() * 65436789);
                String accountNumber = "BYZ" + randomNum;

                System.out.println("\nYou have successfully made a new account! Your account information: ");
                System.out.println("Name: " + name + " " + surname);
                System.out.println("Age: " + age);
                System.out.println("Gender: " + gender);
                System.out.println("Username: " + userName);
                System.out.println("Account number: " + accountNumber);
                break;

            } else {
                System.out.println("Account is has not been made");

        }}


    }}}

