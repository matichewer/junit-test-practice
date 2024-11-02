public class Calculator {

    public int addition (int x, int y) {
        return x + y;
    }

    public int subtraction(int x, int y) {
        return x - y;
    }

    public int divide(int x, int y) {
        if (y == 0) {
            return 0;
        } else {
            return x / y;
        }
    }

    public int multiply(int x, int y){
        return x * y;
    }

    public boolean esPar(int x){
        return x % 2 == 0;
    }

    // Conversión de Celsius a Fahrenheit
    public static double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    // Retorna verdadero si un numero es primo, falso en caso contrario
    public static boolean esPrimo(int numero) {
        if (numero <= 1)
            return false;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }

    // Retorna verdadero si un numero es negativo
    public boolean esNegativo(int x){
        return x < 0;
    }

    // Retorna el valor absoluto de un numero entero
    public int valorAbsoluto(int x){
        if (x >= 0)
            return x;
        else
            return -x;
    }
}
