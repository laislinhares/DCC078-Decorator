package org.example;

public class Cor extends CarroDecorator {
    public Cor(Carro carro) {
        super(carro);
    }

    public float getPercentualPreco() {
        return 10.0f;
    }
}
