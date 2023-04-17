import org.example.Dollar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class DollarTest {
    @Test
    public void testMultiplication(){
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
    class Franc{
        private int amount;
        Franc (int amount){
            this.amount= amount;
        }
       public  Franc times(int multiplier){
           return new Franc(amount * multiplier);
       }
        public boolean equals(Object object) {
            Franc franc = (Franc) object;
            return amount == franc.amount;
        }
    }
}
