package classes;

public class Eleitor {

    private String nome = "";
    private int anoDeNasc = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeNasc() {
        return anoDeNasc;
    }

    public void setAnoDeNasc(int anoDeNasc) {
        this.anoDeNasc = anoDeNasc;
    }

    public int calcularIdade() {
        int anovigente = 2020;
        return anovigente - this.anoDeNasc;
    }

    public String identificatipoEleitor() {
        String tipo = "";
        int auxIdade = calcularIdade();

        if (auxIdade < 16) {
            tipo = "Não Eleitor";
        } else if (auxIdade >= 16 && auxIdade < 18) {
            tipo = "Eleitor Facultativo";
        } else if (auxIdade >= 18 && auxIdade < 66) {
            tipo = "Eleitor Obrigatório";
        } else {
            tipo = "Eleitor Facultativo";
        }

        return tipo;
    }
    
    @Override
    public String toString(){
        
        String saida = "Dados do Eleitor: \n";
        saida+= "Nome: " + getNome() + "\n";
        saida+= "Ano de Nascimento: " + getAnoDeNasc() + "\n";
        saida+= "Idade: " + calcularIdade()+ "\n";
        saida+= "Tipo de eleitor: " + identificatipoEleitor();
        return saida;
    }

}
