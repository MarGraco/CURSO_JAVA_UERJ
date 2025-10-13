package principal;

import java.util.Scanner;

import modelo.Compromisso;
import modelo.Data;
import modelo.Hora;

public class MainAgenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Compromisso c1,c2;
        c1 = new Compromisso(new Data(7,10,2025),new Hora(14,30, 0),"Aula de LP2");
        c2 = new Compromisso(8,10,2025,10,40,0, "Aula de POO");   
        
        System.out.println(c1);
        System.out.println(c2);

        sc.close();  
    }
}