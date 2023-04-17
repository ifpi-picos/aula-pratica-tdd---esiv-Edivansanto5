package org.example;

public class Dollar {
        private int amount ;
        public Dollar(int amount){
                this.amount = amount;

        }
         public Dollar times(int multiplier) {
                return new Dollar(amount * multiplier);
        }
        public boolean equals(Object object)  {
                Dollar dollar = (Dollar) object;
                return amount == dollar.amount;
        }
//        public boolean equals(Object object) {
//                if (object instanceof Dollar) {
//                        Dollar dollar = (Dollar) object;
//                        return amount == dollar.amount;
//                } else {
//                        return false;
//                }
//        }

}
