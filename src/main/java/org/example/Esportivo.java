package org.example;

public class Esportivo extends  CarroDecorator{
    public Esportivo(Carro carro) {
        super(carro);
    }

    public float getPercentualPreco() {
        return 15.0f;
    }
}
