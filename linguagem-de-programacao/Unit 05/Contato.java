public class Contato {

    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    Contato() {
    }

    Contato(String nome, String endereco, String telefone, String email) {
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefoe = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email)( {
        this.email = email;
    }
}

