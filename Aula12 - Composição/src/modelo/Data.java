package modelo;
public class Data {
public int dia, mes;
private int ano;

    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
}
public String toString() {
return (dia+"/"+mes+"/"+ano);
}
} 