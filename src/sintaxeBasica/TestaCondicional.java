package sintaxeBasica;

public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 30;
        int quantidadePessoas = 3;

        if (idade >= 18) {
            System.out.println("Você tem mais que 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("você não tem 18, mas pode entrar");
            } else {
                System.out.println("Infelizmente você não pode entrar");
            }

        }
    }
}