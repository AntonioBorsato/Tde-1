import java.util.Scanner;

public class Area
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double largura;
        double altura;
        double area = 0;

        System.out.println("Insira a largura do retângulo em centimetros: ");
        largura = sc.nextDouble();
        System.out.println("Insira a altura do retângulo em centimetros: ");
        altura = sc.nextDouble();

        area = largura * altura;

        System.out.printf("Area do Retangulo em centímetros: %.2f",area);

    }
}
