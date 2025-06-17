package Model;

public class Empregado {
    //definindo atributos
    private int id;
    private String nome;
    private int idade;
    private String email;
    private String senha;
    private String categoria;

    //construtor
    public Empregado(int id, String nome, int idade, String email, String senha, String categoria) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
        this.categoria = categoria;
    }

    //getter
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    public String getCategoria() {
        return categoria;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
