public class CoffeeMachine {

        private int moneyBox;
        private int water;
        private int milk;
        private int beans;
        private int espressoCount;
        private int latteCount;
        private int cappuccinoCount;
        private int earnings;

        public CoffeeMachine() {
            moneyBox = 0;
            water = 0;
            milk = 0;
            beans = 0;
            espressoCount = 0;
            latteCount = 0;
            cappuccinoCount = 0;
            earnings = 0;
        }

        public void buyCoffee(Coffee coffee) {
            if (water >= coffee.getWaterRequired() && milk >= coffee.getMilkRequired() && beans >= coffee.getBeansRequired()) {
                System.out.println("Dispensing " + coffee.getName() + "...");
                moneyBox += coffee.getPrice();
                water -= coffee.getWaterRequired();
                milk -= coffee.getMilkRequired();
                beans -= coffee.getBeansRequired();

                if (coffee.getName().equals("Espresso")) {
                    espressoCount++;
                } else if (coffee.getName().equals("Latte")) {
                    latteCount++;
                } else if (coffee.getName().equals("Cappuccino")) {
                    cappuccinoCount++;
                }
            } else {
                System.out.println("Not enough ingredients to make " + coffee.getName() + ".");
            }
        }

        public void fillIngredients(int water, int milk, int beans) {
            this.water += water;
            this.milk += milk;
            this.beans += beans;
        }

        public void takeMoney() {
            System.out.println("Taking $" + moneyBox + " from the money box.");
            earnings += moneyBox;
            moneyBox = 0;
        }

        public void showIngredients() {
            System.out.println("Water: " + water + " ml");
            System.out.println("Milk: " + milk + " ml");
            System.out.println("Coffee Beans: " + beans + " grams");
        }

        public void showAnalytics() {
            System.out.println("Coffee Sales Analytics:");
            System.out.println("Espresso: " + espressoCount + " cups");
            System.out.println("Latte: " + latteCount + " cups");
            System.out.println("Cappuccino: " + cappuccinoCount + " cups");
            System.out.println("Total earnings: $" + earnings);
            System.out.println("Ingredients consumed:");
            showIngredients();
        }
    }


