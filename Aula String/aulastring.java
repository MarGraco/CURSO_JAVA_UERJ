import java.util.Scanner;

public class aulastring {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        String texto;
        char c;

        System.out.println("Me diga uma frase:  ");
        texto = sc.nextLine();
        System.out.println("Informe o caractere desejado: ");
        c = sc.next().charAt(0);

        // int contagem = texto.length();
        int contagem = 0;
        for(int i=0;i<texto.length();i++) {
            if(c == texto.charAt(i));
                contagem++;
        }
    System.out.println("Essa é a quantidade de vezes que o caractere aparece na frase: "+contagem);
    }
}
