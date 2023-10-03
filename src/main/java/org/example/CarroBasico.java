package org.example;

public class CarroBasico implements Carro {
    public float preco;

    public CarroBasico() {
    }

    public CarroBasico(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }
}
