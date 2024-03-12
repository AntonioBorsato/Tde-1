import java.util.Scanner;

public class Aumento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        double salario;

        System.out.println("Insira seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Insira seu salario: ");
        salario = scanner.nextDouble();

        double salarioAtualizado = salario * 1.1;

        System.out.printf("Nome: " + nome + "Salario com aumento de 10%% %.2f",salarioAtualizado);
    }

}
