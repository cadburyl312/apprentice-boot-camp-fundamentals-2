package autotrader;

public class BillingService {

    public Integer generateBill(PrivateCustomer customer) {
        if (customer.getDealerType().equals(DealerType.PRIVATE)) {
            return customer.getNumberAdverts() * 20 + customer.getProductNumbers() * 10;
        }
        return customer.getNumberAdverts() * 50 + (customer.getProductNumbers() * 10 * customer.getNumberAdverts());
    }
}
