import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String customerName;
    private List<Product> products;
    private SubscriptionType subscriptionType;

    public Customer(String customerName, SubscriptionType subscriptionType) {
        this.customerName = customerName;
        this.subscriptionType = subscriptionType;
        products = new ArrayList<>();
    }

    public void addSubscription(Product product){
        products.add(product);
    }

}
