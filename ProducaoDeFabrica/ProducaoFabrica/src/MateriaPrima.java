public class MateriaPrima{
    String material;

    MateriaPrima(String material){
        this.material = material;
    }

    String getNome(){
        return material;
    }

    public String toString(){
        return "Materia prima: " + material;
    }
}