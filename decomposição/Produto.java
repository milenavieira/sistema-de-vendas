package decomposição;

public class Produto {

    public String nomeDoProduto;
    public double precoDoProduto;

    public Produto(String nomeDoProduto, double precoDoProduto) {
    this.nomeDoProduto = nomeDoProduto;
    this.precoDoProduto = precoDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }
}
