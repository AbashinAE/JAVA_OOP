public class Product implements Comparable<Product> {

    private String name;
    private int size;
    private int weight;



    public Product(String name, int size, int weight) {
        if (size <= 0 || weight <= 0) {
            throw new IllegalArgumentException("incorrectly");
        }
        this.name = name;
        this.size = size;
        this.weight = weight;

    }


    public int getSize() {
        return this.size;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Название товара: ");
        sb.append(name);
        sb.append("; ");
        sb.append("Размер товара: ");
        sb.append(size);
        sb.append("; ");
        sb.append("Вес товара: ");
        sb.append(weight);
        return sb.toString();
    }


    @Override
    public int compareTo(Product other) {
        return this.weight - other.weight;
    }

}