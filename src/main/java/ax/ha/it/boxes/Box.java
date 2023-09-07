package ax.ha.it.boxes;

import java.math.BigDecimal;

public class Box implements Boxable {

    private final double maxWeight;
    private final Boxable[] contents;
    private int noOfBoxables;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        contents = new Boxable[100]; // assume that we never add more than 100 objects to a Box
    }

    public Boxable[] getContents() {
        return contents;
    }

    public boolean add(Boxable boxable) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public BigDecimal getPrice() {
        throw new RuntimeException("Not implemented yet");

    }

    @Override
    public double getWeight() {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public String getDescription() {
        throw new RuntimeException("Not implemented yet");
    }

}
