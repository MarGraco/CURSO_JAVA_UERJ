package principal;

import modelo.Data;

    public class Pessoa {
        public String nome;
        private String endereco;
        modelo.Data dtNasc;

       public Pessoa(String nome, String endereco, Data dtNasc) {
            this.nome = nome;
            this.endereco = endereco;
            this.dtNasc = dtNasc;
}
        public String toString() {
            return "\nNome: " + nome + " Endereço: " + endereco + "\nData de nascimento: " + dtNasc + "\n";
    }
}