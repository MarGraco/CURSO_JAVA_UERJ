import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args)    {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[5];
        int soma=0;

        for (int i=0; i<vet.length; i++);
            System.out.println("Informe o valor "+i+1+":");
            vet[i] = sc.nextInt();
            soma+=vet[i];
        }
        System.out.println("Soma dos valores informados: "+soma);
    }
}