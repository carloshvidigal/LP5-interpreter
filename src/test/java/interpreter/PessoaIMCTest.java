package interpreter;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaIMCTest {

    @Test
    void deveCalcularIMC() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(70.00f);
        pessoa.setAltura(1.72f);

        DecimalFormat df = new DecimalFormat("#,###.00");

        assertEquals("23,66", df.format(pessoa.calcularIMC()));
    }
}
