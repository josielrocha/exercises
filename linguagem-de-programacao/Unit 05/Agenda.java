
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public Contato buscarPeloNome(String nome) {
        Contato contato;

        if (contatos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum contato cadastrado.");
        } else {
            for (Contato c : contatos) {
                if (nome.equalsIgnoreCase(contato.getNome())) {
                    contato = c;
                    break;
                }
            }
        }

        return contato;
    }

    public void excluir(Contato contato) {
        int index = contatos.indexOf(contato);

        if (index >= 0) {
            contatos.remove(index);
        }
    }
}
