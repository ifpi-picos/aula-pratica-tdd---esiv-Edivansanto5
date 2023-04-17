package org.example;

public class Dollar {
        public int amount ;
        public Dollar(int amount){
                this.amount = amount;

        }
         public Dollar times(int multiplier) {
                return new Dollar(amount * multiplier);
        }
        public boolean equals(Object object) {
                if (object instanceof Dollar) {
                        Dollar dollar = (Dollar) object;
                        return amount == dollar.amount;
                } else {
                        return false;
                }
        }

}
