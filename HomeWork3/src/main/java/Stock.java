import java.util.*;
public class Stock implements iStockBehavior {


    private List<Product> items;

    // Конструктор для инициализации списка товаров при создании объекта Stock
    public Stock() {
        items = new ArrayList<>();
    }


    @Override
    public void putProduct(Product product) {
        items.add(product);
    }


    @Override
    public void removeProduct(Product product) {
        items.remove(product);
    }




    @Override
    public void checkStatus() {
        System.out.println("На данный момент на складе " + items.size() + " позиций");
    }


    public boolean contains(Product product) {
        return items.contains(product);
    }


    public void sortedByWeight() {
        Collections.sort(items);
        for (Product product:items) {
            System.out.println(product);
        }
    }


    public void sortBySize() {
        Comparator<Product> comparator = (product1, product2) -> product1.getSize() - product2.getSize();
        Collections.sort(items, comparator);
        for (Product product : items) {
            System.out.println(product);
        }
    }

}