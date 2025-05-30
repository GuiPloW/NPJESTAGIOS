package model;
public class MLogin {
    
    private String nome, matricula, email, senha;

    public MLogin(String matricula, String senha) {
        this.matricula = matricula;
        this.senha = senha;
    }
    
    public void cadastrar(String nome, String matricula, String email, String senha){
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
