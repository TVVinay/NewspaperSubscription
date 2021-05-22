import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private String category;
    private List<SubscriptionType> subscriptionType;
    private double price;


    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
        subscriptionType = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

}

