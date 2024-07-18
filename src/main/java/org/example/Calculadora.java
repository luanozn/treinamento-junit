package org.example;

/**
 * Uma classe de calculadora simples para realizar operações aritméticas básicas.
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a o primeiro número
     * @param b o segundo número
     * @return a soma de a e b
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número inteiro do primeiro.
     *
     * @param a o primeiro número
     * @param b o segundo número
     * @return a diferença entre a e b
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a o primeiro número
     * @param b o segundo número
     * @return o produto de a e b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro número inteiro pelo segundo.
     *
     * @param a o primeiro número
     * @param b o segundo número (não pode ser zero)
     * @return o quociente de a e b
     * @throws IllegalArgumentException se b for zero
     */
    public double dividir(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("É impossível dividir por zero");
        }
        return (double) a / b;
    }
}
