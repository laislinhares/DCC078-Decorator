import org.example.Carro;
import org.example.CarroBasico;
import org.example.Cor;
import org.example.Esportivo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarroTest {

    @Test
    public void deveRetornarPrecoCarro() {
        Carro carro = new CarroBasico(30000.0f);

        assertEquals(30000.0f, carro.getPreco(), 0);
    }

    @Test
    public void deveRetornarPrecoCarroComCor() {
        Carro carro = new Cor(new CarroBasico(30000.0f));

        assertEquals(30000.0f, carro.getPreco(),3000.0f);
    }

    @Test
    public void deveRetornarPrecoCarroEsportivo() {
        Carro carro = new Esportivo(new CarroBasico(30000.0f));

        assertEquals(30000.0f, carro.getPreco(),4500.0f);
    }

    @Test
    public void deveRetornarPrecoCarroEsportivoComCor() {
        Carro carro = new Esportivo(new Cor(new CarroBasico(30000.0f)));

        assertEquals(30000.0f, carro.getPreco(),7950.0f);
    }
}
