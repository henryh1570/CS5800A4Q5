/**
 * CS5800 - Advanced Software Engineering
 * Assignment 4, Question 5
 * Desc: Given a UML class diagram, this program implements it by providing the corresponding
 *      java files with their expected code behaviors. Upload this to an online repository.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        IndividualHolder iHolder = new IndividualHolder(9, "123 E Smith street", "John", "123456789");
        CorporateHolder cHolder = new CorporateHolder(8, "555 S Maple road", "Project Manager Mitch");

        Account i_account = new Account(5000.0, iHolder);
        Account c_account = new Account(4000.0, cHolder);

        i_account.deposit(300);
        System.out.println(i_account.getBalance());
        System.out.println(i_account.getHolder());

        System.out.println(c_account.getBalance());
        c_account.setBalance(-199.0);
        System.out.println(c_account.getBalance());
    }
}