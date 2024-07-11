import org.example.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testarSoma() {
        assertEquals(6, calculadora.somar(3,3));
    }

    @Test
    public void testarSubtracao() {
        assertEquals(5, calculadora.subtrair(12,7));
    }

    @Test
    public void testarMultiplicacao() {
        assertEquals(20, calculadora.multiplicar(10,2));
    }

    @Test
    public void testarDivisao() {
        assertEquals(2, calculadora.dividir(10,5));
    }

    @Test
    public void testarDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(5, 0));
    }

    @AfterEach
    public void tearDown() {
        calculadora = null;
    }

}
