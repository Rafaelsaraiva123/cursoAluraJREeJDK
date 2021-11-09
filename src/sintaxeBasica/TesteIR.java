package sintaxeBasica;

public class TesteIR {
    public static void main(String[] args) {
        double salario = 4000.0;

        if (salario <= 2800.0){
            double descontoIR = 7.5;
            salario = salario - 142;
            System.out.println("O desconto do IR é de " + descontoIR + "%, o seu salario é: " + salario);
        } else if (salario > 2800.0 && salario <= 3751.0){
            double descontoIR = 15;
            salario = salario - 350;
            System.out.println("O desconto do IR é de " + descontoIR + "%, o seu salario é: " + salario);
        } else {
            double descontoIR = 22.5;
            salario = salario - 636;
            System.out.println("O desconto do IR é de " + descontoIR + "%, o seu salario é: " + salario);
        }

    }
}
