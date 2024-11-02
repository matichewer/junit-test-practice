import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void additionTest() {
        int result = calculator.addition(3, 2);
        assertEquals(5, result);
    }

    @Test
    public void additionWithNegativeNumbersTest() {
        int result = calculator.addition(-3, 2);
        assertEquals(-1, result);
    }

    @Test
    public void subtractionTest() {
        int result = calculator.subtraction(3, 2);
        assertEquals(1, result);
    }

    @Test
    public void divideWithYDifferentThan0Test(){
        int result = calculator.divide(6, 3);
        assertEquals(2, result);
    }

    @Test
    public void divideWithYEquals0Test(){
        int result = calculator.divide(6, 0);
        assertEquals(0, result);
    }

    @Test
    public void multiplyTest(){
        int result = calculator.multiply(2,3);
        assertEquals(6,result);
    }

    @Test
    public void esParConNumeroImparTest(){
        boolean result = calculator.esPar(3);
        assertFalse(result);
    }

    // Tests para la conversión de Celsius a Fahrenheit
    @Test
    public void convertirCelsiusAFahrenheitTest_0C() {
        double result = calculator.convertirCelsiusAFahrenheit(0);
        assertEquals(32.0, result);
    }

    @Test
    public void convertirCelsiusAFahrenheitTest_40Cnegativo() {
        double result = calculator.convertirCelsiusAFahrenheit(-40);
        assertEquals(-40, result);
    }
    @Test
    public void convertirCelsiusAFahrenheitTest_60Cnegativo() {
        double result = calculator.convertirCelsiusAFahrenheit(-60);
        assertEquals(-76, result);
    }

    // Tests para verificar si un número es primo
    @Test
    public void esPrimoTest_negativo1() {
        boolean result = calculator.esPrimo(-1);
        assertFalse(result);
    }

   @Test
    public void esPrimoTest_0() {
        boolean result = calculator.esPrimo(0);
        assertFalse(result);
    }

   @Test
    public void esPrimoTest_1() {
        boolean result = calculator.esPrimo(1);
        assertFalse(result);
    }

   @Test
    public void esPrimoTest_2() {
        boolean result = calculator.esPrimo(2);
        assertTrue(result);
    }

    @Test
    public void esPrimoTest_3() {
        boolean result = calculator.esPrimo(3);
        assertTrue(result);
    }

   @Test
    public void esPrimoTest_4() {
        boolean result = calculator.esPrimo(4);
        assertFalse(result);
    }

    @Test
    public void esPrimoTest_5() {
        boolean result = calculator.esPrimo(5);
        assertTrue(result);
    }

    @Test
    public void esPrimoTest_13() {
        boolean result = calculator.esPrimo(13);
        assertTrue(result);
    }

  @Test
    public void esPrimoTest_97() {
        boolean result = calculator.esPrimo(97);
        assertTrue(result);
    }

    @Test
    public void esPrimoTest_1000() {
        boolean result = calculator.esPrimo(1000);
        assertFalse(result);
    }

    // Tests para esNegativo(x)
    @Test
    public void esNegativoConNumNegTest(){
        boolean result = calculator.esNegativo(-1);
        assertTrue(result);
    }
    @Test
    public void esNegativoConNumPosTest(){
        boolean result = calculator.esNegativo(1);
        assertFalse(result);
    }

    @Test
    public void esNegativoConCeroTest(){
        boolean result = calculator.esNegativo(0);
        assertFalse(result);
    }

    // TESTS DE VALOR ABSOLUTO
    @Test
    public void valorAbsolutoConNumPosTest(){
        int result = calculator.valorAbsoluto(1);
        assertEquals(1,result);
    }

    @Test
    public void valorAbsolutoConNumNegTest(){
        int result = calculator.valorAbsoluto(-1);
        assertEquals(1,result);
    }

    @Test
    public void valorAbsolutoConCeroTest(){
        int result = calculator.valorAbsoluto(0);
        assertEquals(0,result);
    }

}
