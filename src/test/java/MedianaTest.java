import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.example.Calculadora;
import org.example.Mediana;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;

public class MedianaTest {

    private Calculadora calculadora;
    private Mediana mediana;

    @BeforeEach
    public void setUp() {
        calculadora = mock(Calculadora.class);
        mediana = new Mediana(calculadora);
    }

    @Test
    public void testCalcularMedianaArrayImpar() {
        int[] numeros = {1, 3, 2};

        assertEquals(2, mediana.calcularMediana(numeros));
        verify(calculadora, never()).somar(anyInt(), anyInt());
        verify(calculadora, never()).dividir(anyInt(), anyInt());
    }

    @Test
    public void testCalcularMedianaArrayPar() {
        int[] numeros = {1, 3, 2, 4};

        when(calculadora.somar(2, 3)).thenReturn(5);
        when(calculadora.dividir(5, 2)).thenReturn(2.5);

        assertEquals(2.5, mediana.calcularMediana(numeros));

        verify(calculadora).somar(2, 3);
        verify(calculadora).dividir(5, 2);
    }

    @Test
    public void testCalcularMedianaArrayUnicoElemento() {
        int[] numeros = {42};

        assertEquals(42, mediana.calcularMediana(numeros));
        verify(calculadora, never()).somar(anyInt(), anyInt());
        verify(calculadora, never()).dividir(anyInt(), anyInt());
    }

    @Test
    public void testCalcularMedianaArrayVazio() {
        int[] numeros = {};

        assertThrows(IllegalArgumentException.class, () -> {
            mediana.calcularMediana(numeros);
        });
    }
}
