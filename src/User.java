package src;

public class User {
    private String nome;
    private int idade;
    private int cpf;


    // Metodo responsavel por tornar seguro os acessos as variaves 
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }


    // Metodo de inserção de dados e de uso externo da class
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public int getCpf(){
        return cpf;
    }
}
