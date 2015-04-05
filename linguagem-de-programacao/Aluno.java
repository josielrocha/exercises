public class Aluno {

    private String nome;
    private char sexo;
    private double altura;
    private double peso;
    private int anoNascimento;

    public double getImc() {
        double alturaAoQuadrado = altura * altura;
        double imc = peso / alturaAoQuadrado;
        return imc;
    }

    public String getSituacao() {
        String situacao;
        double imc = getImc();

        if (imc < 18.5) {
            situacao = "Abaixo do peso ideal";
        } else {
            if (imc < 24.9) {
                situacao = "Peso normal";
            } else {
                if (imc < 29.9) {
                    situacao = "Acima do peso (sobrepeso)";
                } else {
                    if (imc < 34.9) {
                        situacao = "Obesidade grau I";
                    } else {
                        if (imc < 39.9) {
                            situacao = "Obesidade grau II";
                        } else {
                            situacao = "Obesidade grau III";
                        }
                    }
                }
            }
        }

        return situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}

