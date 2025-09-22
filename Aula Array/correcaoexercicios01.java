import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args)    {
        Scanner sc = new Scanner(System.in);
        float vet[] = new int[5];
        float media=0.0f;

        for (int i=0; i<vet.length; i++);
            System.out.println("Informe a nota "+(i+1)+":");
            vet[i] = sc.nextFloat();
            media+=vet[i];
        }
        System.out.println("Soma dos valores informados: "+(media/vet.length));
        Arrays.sort(vet);
        
    }
}