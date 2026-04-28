import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sistema {

    private List<Produto> produtos;
    private Estoque estoque;

    public Sistema() {
        this.produtos = new ArrayList<>();
        this.estoque = new Estoque();
    }

    Scanner sc = new Scanner(System.in);


   void executar() {

    int opcao = -1;

    while (opcao != 0) {

        System.out.println("\n===== SISTEMA =====");
        System.out.println("1 - Cadastrar materia prima");
        System.out.println("2 - Listar estoque");
        System.out.println("3 - Cadastrar produto");
        System.out.println("4 - Produzir");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");

        opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {

            case 1:
                cadastrarMateriaPrima();
                break;

            case 2:
                estoque.listarEstoque();
                break;

            case 3:
                cadastrarProdutos();
                break;

            case 4:
                produzir();
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opcao invalida!");
        }
    }
}

    void cadastrarMateriaPrima() {

    System.out.println("Digite o nome da Materia Prima:");
    String nome = sc.nextLine().trim();

    if (nome.isEmpty()) {
        System.out.println("Nome inválido!");
        return;
    }

    System.out.println("Digite a quantidade inicial:");
    int qtd = sc.nextInt();
    sc.nextLine();

    estoque.adicionarMaterial(nome, qtd);

    System.out.println("Materia prima cadastrada no estoque!");
}


    void listarMateriasPrimas(){
        estoque.listarEstoque();
    }


    void cadastrarProdutos(){
        System.out.println("Digite o nome do produto:");
        String nome = sc.nextLine();

        if (nome == null || nome.isEmpty()) {
        System.out.println("Nome invalido");
        return;
    }

        Produto produto = new Produto(nome);

        System.out.println("Qual material e utilizado nesse produto?");
        String nomeMaterial = sc.nextLine();

        if (nomeMaterial.isEmpty()) {
            System.out.println("Material invalido");
            return;
        }

        MateriaPrima materia = new MateriaPrima(nomeMaterial);

        System.out.println("Digite a quantidade do material:");
        int qtd = sc.nextInt();
        sc.nextLine();

        ItemReceita item = new ItemReceita(materia, qtd);

        produto.adicionarItemReceita(item);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso");
        
    }

    void listarProdutos(){
        for(Produto p: produtos){
            System.out.println(p);
        }
    }


    void produzir(){
       System.out.println("Qual produto?");
       String produto = sc.nextLine();

       if(produto == null || produto.isEmpty()){
        System.out.println("Nome invalido!");
        return;
       }

       Produto produtoo= null;
       for(Produto p : produtos){
         if(p.getNome().equalsIgnoreCase(produto)){
            produtoo = p;
            break;
        }
       }

        if(produtoo == null){
            System.out.println("Produto nao encontrado!");
            return;
        }

        
       System.out.println("Qual a quantidade:");
       int qtd = sc.nextInt();
       sc.nextLine();
       
       for(ItemReceita item: produtoo.getReceita()){
            String materia = item.getMateria().getNome();
            int qtdNecessaria = item.getQuantidade() * qtd;

            int qtdEstoque = estoque.getQuantidade(materia);

            if (qtdEstoque < qtdNecessaria) {
            System.out.println("Estoque insuficiente de: " + materia);
            return;

       }

    }

     for(ItemReceita item : produtoo.getReceita()){

            String materia = item.getMateria().getNome();
            int qtdNecessaria = item.getQuantidade() * qtd;

            estoque.removerMaterial(materia, qtdNecessaria);
       }
       

       System.out.println("Produto produzido com sucesso.");
}

public static void main(String[] args) {
    Sistema sistema = new Sistema();
    sistema.executar();

    

}  
}



