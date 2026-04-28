import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private List<ItemReceita> receita;

    public Produto(String nome) {
        this.nome = nome;
        this.receita = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<ItemReceita> getReceita() {
        return receita;
    }

    public void adicionarItemReceita(ItemReceita item) {
        receita.add(item);
    }

    public String toString(){
        return "Produto: " + nome;
    }
}