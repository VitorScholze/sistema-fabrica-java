public class ItemReceita {
    MateriaPrima materia;
    int quantidade;

    ItemReceita(MateriaPrima materia, int quantidade){
        this.materia = materia;
        this.quantidade = quantidade;
    }

    MateriaPrima getMateria(){
        return materia;
    }

    int getQuantidade(){
        return quantidade;
    }
}
