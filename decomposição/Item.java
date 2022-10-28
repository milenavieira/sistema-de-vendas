package decomposição;

public class Item {

    public int quantidade;
    public Produto produto = new Produto("Mesa", 4.0);

    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
