package entity;

public class User {

    public String accountNumber;
    private double balance;
    public String name;
    public String gender;

    public User(String accountNumber, double balance, String name, String gender) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.gender = gender;
    }

    public double getBalance() {
        return balance;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

        }
