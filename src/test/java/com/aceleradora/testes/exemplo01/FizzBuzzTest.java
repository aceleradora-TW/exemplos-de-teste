package com.aceleradora.testes.exemplo01;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void retornaFizzQuandoNumeroEhDivisivelPor3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String resultado = fizzBuzz.traduz("3");
    }
}