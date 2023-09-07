public class Coffee {

        private String name;
        private int price;
        private int waterRequired;
        private int milkRequired;
        private int beansRequired;

        public Coffee(String name, int price, int waterRequired, int milkRequired, int beansRequired) {
            this.name = name;
            this.price = price;
            this.waterRequired = waterRequired;
            this.milkRequired = milkRequired;
            this.beansRequired = beansRequired;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public int getWaterRequired() {
            return waterRequired;
        }

        public int getMilkRequired() {
            return milkRequired;
        }

        public int getBeansRequired() {
            return beansRequired;
        }
    }


