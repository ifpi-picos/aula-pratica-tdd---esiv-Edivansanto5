package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DollarTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(20, five.amount);
    }
}
