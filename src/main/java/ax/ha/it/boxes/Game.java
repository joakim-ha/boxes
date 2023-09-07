package ax.ha.it.boxes;

import java.math.BigDecimal;

public class Game extends SellableItem {

    private final String rating;
    private final String title;

    public Game(String title, String rating, String ean, BigDecimal price, double weight) {
        super(ean, price, weight);
        this.title = title;
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return "Game: " + title + "(" + rating + ")";
    }
}
