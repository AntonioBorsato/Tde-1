import java.util.Scanner;

public class Tabuada
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Insira o número: ");
        numero = sc.nextInt();

        for(int i=1; i<10; i++)
        {
            int resultado = i*(int)numero;
            System.out.println(i + " X "+ (numero) + " = " + resultado);
        }
        sc.close();


    }
}
