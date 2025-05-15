package autotrader;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BillingServiceTest {

    BillingService billingService = new BillingService();

    @Test
    public void generateBill_GivenPrivateDealerAdvertNoProducts_generateCorrectBill() {
        PrivateCustomer customer = new PrivateCustomer(DealerType.PRIVATE);
        customer.setAdvertNumber(3);

        Integer bill =  billingService.generateBill(customer);

        assertThat(bill).isEqualTo(60);
    }

    @Test
    public void generateBill_givenPrivateDealerAdvertsAndProducts_generateCorrectBill() {

        PrivateCustomer customer = new PrivateCustomer(DealerType.PRIVATE);
        customer.setAdvertNumber(1);
        customer.addProduct("100 images");

        Integer bill =  billingService.generateBill(customer);

        assertThat(bill).isEqualTo(30);
    }

    @Test
    public void generateBill_givenDealerAdvertAndProducts_generateCorrectBill() {
        PrivateCustomer customer = new PrivateCustomer(DealerType.DEALER);
        customer.setAdvertNumber(1000);
        customer.addProduct("fiance");
        customer.addProduct("valuations");

        Integer bill =  billingService.generateBill(customer);

        assertThat(bill).isEqualTo(70000);

    }

}