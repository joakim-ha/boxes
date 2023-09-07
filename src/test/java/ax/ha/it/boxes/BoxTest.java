package ax.ha.it.boxes;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @org.junit.jupiter.api.Test
    void add() {

        // All-in-one test for add, getPrice, getWeight

        Box outerBox = new Box(2);

        Book theHobbit = new Book("The Hobbit", "Tolkien", "123456", "273821", new BigDecimal("29.99"), 0.6);
        Game hogwartsLegacy = new Game("Hogwarts Legacy", "PG-13", "238293", new BigDecimal("49.99"), 0.2);

        Box innerBox = new Box(1);
        Book petSematary = new Book("Pet Sematary", "King", "1728172", "29389238", new BigDecimal("19.99"), 0.5);

        Book misery = new Book("Misery", "King", "3943444", "349843", new BigDecimal("5.99"), 0.4);

        assertTrue(innerBox.add(petSematary));
        assertEquals(new BigDecimal("19.99"), innerBox.getPrice());
        assertEquals(0.5, innerBox.getWeight(), 0.0001);

        assertTrue(outerBox.add(theHobbit));
        assertTrue(outerBox.add(hogwartsLegacy));
        assertTrue(outerBox.add(innerBox));
        assertTrue(outerBox.add(misery));
        assertEquals(new BigDecimal("105.96"), outerBox.getPrice());
        assertEquals(1.7, outerBox.getWeight(), 0.0001);

        Book theStand = new Book("The Stand", "King", "121782", "283872", new BigDecimal("35.00"), 1);
        assertFalse(outerBox.add(theStand));

        // What is the expected outcome if we add the heavy item to the inner box instead?
        // How could this be fixed?
    }

    @org.junit.jupiter.api.Test
    void getDescription() {

        Box outerBox = new Box(2);
        Book theHobbit = new Book("The Hobbit", "Tolkien", "123456", "273821", new BigDecimal("29.99"), 0.6);
        Game hogwartsLegacy = new Game("Hogwarts Legacy", "PG-13", "238293", new BigDecimal("49.99"), 0.2);
        Box innerBox = new Box(1);
        Book petSematary = new Book("Pet Sematary", "King", "1728172", "29389238", new BigDecimal("19.99"), 0.5);
        Book misery = new Book("Misery", "King", "3943444", "349843", new BigDecimal("5.99"), 0.4);
        innerBox.add(petSematary);
        outerBox.add(theHobbit);
        outerBox.add(hogwartsLegacy);
        outerBox.add(innerBox);
        outerBox.add(misery);

        String expected =
                "Box containing:\n" +
                "   Book: The Hobbit by Tolkien\n" +
                "   Game: Hogwarts Legacy(PG-13)\n" +
                "   Box containing:\n" +
                "      Book: Pet Sematary by King\n" +
                "   Book: Misery by King\n";

        // How can we construct an indented string like the one above?
        // Hint: The boxes need a shared indentation level
        assertEquals(expected, outerBox.getDescription());
    }

}