import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Coffee espresso = new Coffee("Espresso", 4, 250, 0, 16);
        Coffee latte = new Coffee("Latte", 7, 350, 75, 20);
        Coffee cappuccino = new Coffee("Cappuccino", 6, 200, 100, 12);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Buy Coffee");
            System.out.println("2. Fill Ingredients");
            System.out.println("3. Take Money");
            System.out.println("4. Show Ingredients");
            System.out.println("5. Analytics");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Select a coffee:");
                    System.out.println("1. Espresso");
                    System.out.println("2. Latte");
                    System.out.println("3. Cappuccino");
                    int coffeeChoice = scanner.nextInt();
                    if (coffeeChoice == 1) {
                        coffeeMachine.buyCoffee(espresso);
                    } else if (coffeeChoice == 2) {
                        coffeeMachine.buyCoffee(latte);
                    } else if (coffeeChoice == 3) {
                        coffeeMachine.buyCoffee(cappuccino);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount of water (ml): ");
                    int water = scanner.nextInt();
                    System.out.print("Enter the amount of milk (ml): ");
                    int milk = scanner.nextInt();
                    System.out.print("Enter the amount of coffee beans (grams): ");
                    int beans = scanner.nextInt();
                    coffeeMachine.fillIngredients(water, milk, beans);
                    break;
                case 3:
                    coffeeMachine.takeMoney();
                    break;
                case 4:
                    coffeeMachine.showIngredients();
                    break;
                case 5:
                    coffeeMachine.showAnalytics();
                    break;
                case 6:
                    System.out.println("Exiting the Coffee Machine Simulator.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

