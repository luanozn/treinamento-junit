import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.somar(2, 3));
        assertEquals(0, calc.somar(-1, 1));
        assertEquals(-5, calc.somar(-2, -3));
        assertEquals(1000000000, calc.somar(500000000, 500000000));
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(-1, calc.subtrair(2, 3));
        assertEquals(-2, calc.subtrair(-1, 1));
        assertEquals(1, calc.subtrair(-2, -3));
        assertEquals(0, calc.subtrair(500000000, 500000000));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(-1, calc.multiplicar(-1, 1));
        assertEquals(6, calc.multiplicar(-2, -3));
        assertEquals(0, calc.multiplicar(500000000, 0));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2.0, calc.dividir(6, 3));
        assertEquals(-1.0, calc.dividir(-3, 3));
        assertEquals(1.5, calc.dividir(3, 2));
        assertEquals(0.0, calc.dividir(0, 5));
    }

    @Test
    public void testDividirPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(1, 0);
        });
    }
}
