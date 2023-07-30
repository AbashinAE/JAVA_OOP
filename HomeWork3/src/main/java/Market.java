public class Market implements iMarketBehavior, iQueueBehavior {

    private int size;
    private String name;
    private int fill;
    private MarketQueue queue;
    private Stock stock;


    public Market(String name, int size) {
        this.name = name;
        this.size = size;
        this.fill = 0;
        this.queue = new MarketQueue();
        this.stock = new Stock();
    }


    public void greetings() {
        System.out.println("Добро пожаловать в наш магазин " + name);
    }


    public void giveProduct(Person person, Product product) {
        if (stock.contains(product)) {
            System.out.println("Просим вас уважаемый " + person + ", вот ваш товар: " + product.toString());
            stock.removeProduct(product);
            queue.removePerson(person);
        } else {
            System.out.println("Такого товара нет в наличии");
        }
    }


    private boolean isMarketFull() {
        return fill == size;
    }


    @Override
    public void getIn() {
        if (!isMarketFull()) {
            fill++;
        } else {
            System.out.println("Извините, магазин переполнен, подождите или придите позже!");
        }
        update();
    }


    @Override
    public void getOut() {
        if (fill > 0) {
            fill--;
        }
        update();
    }


    @Override
    public void update() {
        System.out.println(" Очередь в магазине " + fill + " человек(а)");
    }


    @Override
    public void checkQueueStatus() {
        queue.checkQueueStatus();
    }


    @Override
    public void putPerson(Person person) {
        if (!isMarketFull()) {
            queue.putPerson(person);
            System.out.println(person.toString() + " встал в очередь");
        } else {
            System.out.println("Дождитесь, своей очереди!");
        }
        checkQueueStatus();
    }


    @Override
    public void removePerson(Person person) {
        if (fill != 0) {
            queue.removePerson(person);
            System.out.println("До свидания, буем видеть Вас снова! " + person.toString());
        }
        checkQueueStatus();
    }


    public void addProduct(Product product) {
        stock.putProduct(product);
    }


    void removeProduct(Product product) {
        stock.removeProduct(product);
    }


    public void sortedProductByWeight() {
        stock.sortedByWeight();
    }


    public void sortedProductBySize() { stock.sortBySize();}


    public void checkStockStatus() {
        stock.checkStatus();
    }
}
