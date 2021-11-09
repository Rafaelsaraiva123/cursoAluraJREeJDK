package sintaxeBasica;

public class MultiplosDeTres {
    public static void main(String[] args) {
        for (int numero = 1; numero < 100; numero++){
            if (numero % 3 == 0){
                System.out.println("O numero " + numero + " é multiplo de 3");
            }
        }
    }
}
