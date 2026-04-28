public class ItemEstoque {
    MateriaPrima materia;
    int quantidade;

    ItemEstoque(MateriaPrima materia, int quantidade){
        this.materia = materia;
        this.quantidade = quantidade;
    }

    MateriaPrima getMateria(){
        return materia;
    }

    int getQuantidade(){
        return quantidade;
    }

    void adicionarQuantidade(int quantidade){
        if(quantidade < 0){
            System.out.println("Quantidade precisa ser maior que zero.");
        }else{
            this.quantidade += quantidade;
        }
    }

    void removerQuantidade(int quantidade){
        if(quantidade < 0){
            System.out.println("Quantidade precisa ser maior que zero.");
        }else{
            this.quantidade -= quantidade;
            if(this.quantidade < 0){
                this.quantidade = 0;
            }
        }

    }

    public String toString(){
        return  materia + "// Quantidade: " + quantidade;
    }
}
