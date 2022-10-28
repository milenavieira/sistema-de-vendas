package decomposição;

import java.util.ArrayList;

public class ClienteTest {

    public static void main(String[] args) {

        Produto p1 = new Produto("Mesa", 4.0);

        Item i = new Item(1, p1);

        Compra c = new Compra();
        c.adicionarItensNaCompra(i); //passar o metodo de adicionar que esta na classe

        Cliente cli = new Cliente("Milena");
        cli.adicionarCompraNoCliente(c); //passar o metodo de adicionar que esta na classe

        System.out.println(cli.obterValorTotal());
    }
}
