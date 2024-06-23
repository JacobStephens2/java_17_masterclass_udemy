import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        String action = "";
        int amount = 0;
        String bankName = "Stoichuk Bank";
        System.out.println("Привиет! You have just opened an account with " + bankName + ".");
        do {
            System.out.println("You can 'deposit', 'withdraw', 'check balance', or 'leave'. What would you like to do?");
            action = scanner.nextLine();
            switch (action) {
                case "deposit":
                    System.out.println("How much do you want to deposit?");
                    System.out.println(account.deposit(Integer.parseInt(scanner.nextLine())));
                    break;
                case "withdraw":
                    System.out.println("How much do you want to withdraw?");
                    System.out.println(account.withdraw(Integer.parseInt(scanner.nextLine())));
                    break;
                case "check balance":
                    System.out.println("Your balance is $" + account.getBalance() + ".");
                    break;
            }
        } while (!action.equals("leave"));

        System.out.println("Thank you for visiting " + bankName + ". Добре Утро!");

    }
}
