package ax.ha.it.boxes;

import java.math.BigDecimal;

public abstract class SellableItem implements Boxable {

    private final String ean;
    private final BigDecimal price;
    private final double weight;

    public SellableItem(String ean, BigDecimal price, double weight) {
        this.ean = ean;
        this.price = price;
        this.weight = weight;
    }

    public String getEan() {
        return ean;
    }
    @Override
    public BigDecimal getPrice() {
        return price;
    }
    @Override
    public double getWeight() {
        return weight;
    }
}
