public class SubscriptionType implements ISubscription{

    private WeekDays subscriptionType;


    public SubscriptionType(WeekDays subscriptionType){
        this.subscriptionType = subscriptionType;
    }

    public WeekDays getSubscriptionType(){
        return subscriptionType;
    }

    @Override
    public void getPrice() {

    }
}
