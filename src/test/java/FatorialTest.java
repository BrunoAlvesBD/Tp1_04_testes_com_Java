import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class FatorialTest {
    @Test
    public void testFatorialComNumeroDiferenteDeZeroEum() {
        //arrange
        int esperado = 120;
        //act
        int resultado = Fatorial.fatorialDeUmNumero(5);
        //asert
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void testFatorialComNumeroum() {
        //arrange
        int esperado = 1;
        //act
        int resultado = Fatorial.fatorialDeUmNumero(1);
        //asert
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void testFatorialComNumeroZero() {
        //arrange
        int esperado = 1;
        //act
        int resultado = Fatorial.fatorialDeUmNumero(0);
        //asert
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void testFatorialComNumeroNegativo() {
        // Arrange
        int numeroNegativo = -1;

        // Act
        ArithmeticException exception = null;
        try {
            Fatorial.fatorialDeUmNumero(numeroNegativo);
        } catch (ArithmeticException e) {
            exception = e;
        }

        // Assert (Verificação)
        Assertions.assertNotNull(exception, "Exceção  não foi lançada .");
    }

}
