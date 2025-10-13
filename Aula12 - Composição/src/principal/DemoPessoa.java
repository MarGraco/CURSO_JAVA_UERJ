package principal;

import modelo.Data;

    public class DemoPessoa{
        public static void main(String args[]){
            Data dt = new Data(01,10,1978);
            Pessoa p1 = new Pessoa("Bianca Mota", "Rua 3, 37", dt );
            System.out.println(dt.dia);
            System.out.println(p1.dtNasc.dia);
            System.out.println(p1.nome);
    }

}