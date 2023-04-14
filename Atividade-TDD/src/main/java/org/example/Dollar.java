package org.example;

public class Dollar {
    // criando uma variável
    int amount ;

    // construtod
    Dollar(int amount) {
        this.amount = amount;
        // Isso atribui o valor do parâmetro amount à variável amount do objeto Dollar
        // atualmente em construção.
    }
    void times (int multiplier){
        // definindo um metado TIMES que multiplica a quantia em dólar por um valor multiplier..

        amount = amount * multiplier;
        // Isso multiplica o valor atual da variável amount pelo valor do parâmetro
        // multiplier e atribui o resultado de volta à variável amount.
    }
}
