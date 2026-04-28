
import java.util.ArrayList;
import java.util.List;

public class Estoque {
   List<ItemEstoque> itens = new ArrayList<>() ;


   void adicionarMaterial(String nome, int qtd) {

    for (ItemEstoque item : itens) {

        if (item.getMateria().getNome().equalsIgnoreCase(nome)) {
            item.adicionarQuantidade(qtd);
            System.out.println("Quantidade atualizada!");
            return;
        }
    }

    MateriaPrima materia = new MateriaPrima(nome);
    itens.add(new ItemEstoque(materia, qtd));

    System.out.println("Material adicionado ao estoque!");
}
void removerMaterial(String nome, int quantidade) {

    ItemEstoque removido = null;

    for (ItemEstoque item : itens) {
        if (item.getMateria().getNome().equalsIgnoreCase(nome)) {

            int novaQuantidade = item.getQuantidade() - quantidade;

            if (novaQuantidade > 0) {
                item.removerQuantidade(quantidade);
            } else {
                removido = item;
            }

            break;
        }
    }

    if (removido != null) {
        itens.remove(removido);
        System.out.println("Material removido completamente!");
    }else{
        System.out.println("Material nao encontrado no estoque.");
    }

}

void listarEstoque(){
    if(itens.isEmpty()){
        System.out.println("Estoque esta vazio");
        return;
    }else{
        for(ItemEstoque item : itens){
            System.out.println(item);
        }
    }
}


public ItemEstoque buscarItemPorNome(String nome) {

    if (itens == null || itens.isEmpty()) {
        return null;
    }

    for (ItemEstoque item : itens) {
        if (item.getMateria().getNome().equalsIgnoreCase(nome)) {
            return item;
        }
    }

    return null;
}


int getQuantidade(String nome){
    ItemEstoque item = buscarItemPorNome(nome);

    if(item != null){
        return item.getQuantidade();
    }

    return 0;
}












}



