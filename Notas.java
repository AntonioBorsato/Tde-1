import java.util.ArrayList;
import java.util.Scanner;

public class Notas
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> notas =  new ArrayList<>();

        for(int i=0; i < 4; i++)
        {
            System.out.print("INSIRA A " + (i+1) + "° NOTA: " );
            notas.add(sc.nextDouble());
        }
        double soma = 0;
        for(int i=0; i < 4; i++)
        {
            soma += notas.get(i);
        }

        double media = soma / 4;

        System.out.printf("A MÉDIA DAS NOTAS É: %.1f",media);

        sc.close();
    }
}
