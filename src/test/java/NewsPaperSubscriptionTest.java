import org.testng.annotations.Test;

public class NewsPaperSubscriptionTest {

    @Test
    public void verifySubscriptions(){

        SubscriptionType subscriptionType = new SubscriptionType(WeekDays.Friday);
        Customer customer = new Customer();
        customer.addSubscription(subscriptionType,Newspaper);

    }



}
