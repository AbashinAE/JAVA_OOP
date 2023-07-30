public class main {
    public static void main(String[] args) {
        Market market = new Market("Продукты", 10);
        market.greetings();
        Product product_01 = new Product("товар_1", 1, 6);
        Product product_02 = new Product("товар_2", 2, 5);
        Product product_03 = new Product("товар_3", 3, 4);
        Product product_04 = new Product("товар_4", 4, 3);
        Product product_05 = new Product("товар_5", 5, 2);
        Product product_06 = new Product("товар_6", 6, 1);
        Person visitor_01 = new Person("Bob", "Karlson");
        market.addProduct(product_01);
        market.addProduct(product_02);
        market.addProduct(product_03);
        market.addProduct(product_04);
        market.addProduct(product_05);
        market.addProduct(product_06);
        market.getIn();
        market.checkStockStatus();
        market.putPerson(visitor_01);
        market.giveProduct(visitor_01, product_01);

        System.out.println("Сортировка по весу: ");
        market.sortedProductByWeight();
        System.out.println("*".repeat(30));
        System.out.println("Сортировки по размеру: ");
        market.sortedProductBySize();
    }
}
