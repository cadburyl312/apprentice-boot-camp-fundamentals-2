package autotrader;

import java.util.ArrayList;
import java.util.List;

public class PrivateCustomer {

    private Integer numberAdverts;
    private final List<String> products = new ArrayList<>();
    private final DealerType dealerType;

    public PrivateCustomer(DealerType dealerType) {
        this.dealerType = dealerType;
    }

    public void setAdvertNumber(Integer adverts) {
        numberAdverts = adverts;
    }

    public Integer getNumberAdverts() {
        return numberAdverts;
    }

    public void addProduct(String product) {
        products.add(product);
    }

    public Integer getProductNumbers() {
        return products.size();
    }

    public DealerType getDealerType() {
        return dealerType;
    }
}
