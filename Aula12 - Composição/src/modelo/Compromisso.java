package modelo;

public class Compromisso {

    public Compromisso(int d, int m, int a, int h, int min, int seg, String desc){
        new Data(d,m,a);
        new Hora(h, min, seg);
    }
    public Compromisso(int d, int m, int a, String desc) {
        new Data(d, m, a);
        new Hora(0,0,0);
    }
    public Compromisso(Data data, Hora hora, String string) {
        //TODO Auto-generated constructor stub
    }

}

