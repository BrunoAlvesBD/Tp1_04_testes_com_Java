public class Fatorial {
    public static int fatorialDeUmNumero(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        else if(numero < 0){
            throw new ArithmeticException("Fatorial não é definido para números negativos.");
        }
        else {
            return numero * fatorialDeUmNumero(numero - 1);
        }
    }
}
