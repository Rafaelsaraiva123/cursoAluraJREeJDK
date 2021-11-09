package sintaxeBasica;

public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 16;
        int quatidadePessoas = 3;
        boolean acompanhado = quatidadePessoas >= 2;

        if (idade >= 18 || quatidadePessoas >= 2){
            System.out.println("Seja bem vindo");
        } else  {
            System.out.println("infelizmente voce não pode entrar");
        }

        if (idade >= 18 && acompanhado){
            System.out.println("seja bem vindo");
        } else {
            System.out.println("Infelizmente voce nao pode entrar");
        }




    }
}
