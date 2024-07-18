package org.example;

import java.util.Arrays;

/**
 * Classe para calcular a mediana de um conjunto de números.
 */
public class Mediana {
    private Calculadora calculadora;

    /**
     * Construtor que aceita uma instância de Calculadora.
     *
     * @param calculadora a instância de Calculadora a ser usada
     */
    public Mediana(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    /**
     * Calcula a mediana de um array de números inteiros.
     *
     * @param numeros o array de números inteiros
     * @return a mediana dos números
     * @throws IllegalArgumentException se o array estiver vazio
     */
    public double calcularMediana(int[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("O array não pode estar vazio");
        }

        Arrays.sort(numeros);

        int meio = numeros.length / 2;

        if (numeros.length % 2 == 0) {
            return calculadora.dividir(calculadora.somar(numeros[meio - 1], numeros[meio]), 2);
        } else {
            return numeros[meio];
        }
    }
}
