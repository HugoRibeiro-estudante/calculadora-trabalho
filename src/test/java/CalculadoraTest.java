import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    public void testeConstrutorVazio(){

        var resultadoEsperado = 0;

        Calculadora calc = new Calculadora();

        var resultadoObtido = calc.getMemoria();

        Assertions.assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    public void testeConstrutorParametrizado(){

        var resultadoEsperado = 0;

        Calculadora calc = new Calculadora(0);

        var resultadoObtido = calc.getMemoria();

        Assertions.assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    public void somar(){

        var resultadoEsperado = 0;

        Calculadora calc = new Calculadora(-10);

        calc.somar(10);

        var resultadoObtido = calc.getMemoria();

        Assertions.assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    public void subtrair(){

        var resultadoEsperado = 0;

        Calculadora calc = new Calculadora(10);
        calc.subtrair(10);

        var resultadoObtido = calc.getMemoria();

        Assertions.assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    public void multiplicar(){

        var resultadoEsperado = 100;

        Calculadora calc = new Calculadora(10);
        calc.multiplicar(10);

        var resultadoObtido = calc.getMemoria();

        Assertions.assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    public void dividirPorZero() throws Exception {

        var resultadoEsperado = 100;

        Calculadora calc = new Calculadora(10);
        calc.dividir(0);

        var resultadoObtido = calc.getMemoria();

        Assertions.assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    public void dividirPorPositivo() throws Exception {

        var resultadoEsperado = 1;

        Calculadora calc = new Calculadora(10);
        calc.dividir(10);

        var resultadoObtido = calc.getMemoria();

        Assertions.assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    public void exponenciar() throws Exception {

        var resultadoEsperado = 100;

        Calculadora calc = new Calculadora(10);
        calc.exponenciar(2);

        var resultadoObtido = calc.getMemoria();

        Assertions.assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    public void exponenciarMaior10() throws Exception {

        var resultadoEsperado = 1000000000;

        Calculadora calc = new Calculadora(10);
        calc.exponenciar(11);

        var resultadoObtido = calc.getMemoria();

        Assertions.assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    public void zerarMemoria(){

        var resultadoEsperado = 0;

        Calculadora calc = new Calculadora();

        calc.zerarMemoria();

        var resultadoObtido = calc.getMemoria();

        Assertions.assertEquals(resultadoEsperado, resultadoObtido);

    }

}