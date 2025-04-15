package org.serratec.palestra.modelos;

public class Palestrante extends Pessoa{
    private String temaPalestra;

    public Palestrante(String nome, String cpf, String temaPalestra) {
        super(nome, cpf);
        this.temaPalestra = temaPalestra;
    }

    @Override
    public String exibirDados(){
        return "Nome: " + nome + " | " + "CPF: " + cpf + " | " + "Tema da Palestra: " + temaPalestra;
    }

}
