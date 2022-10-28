package decomposição;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String name;
    public List<Compra> compra = new ArrayList<>(); //lembrar de importar o list

    public Cliente(String name) { //lista n passa no construtor
        this.name = name;
    }

    public Cliente(String maria, int i, boolean b) {
    }

    public Double obterValorTotal () {
        double compraTotal = 0.0; //para iniciar a variavel
        for (Compra c: compra){ // percorre em decomposição
            for (Item i: c.itens) { //percorre em decomposição e faz o calculo aqui pq pertence
                // ao item a quantidade
                compraTotal += i.getQuantidade() * i.produto.getPrecoDoProduto();
            }
        }
        return compraTotal;
    }

    public void adicionarCompraNoCliente(Compra c) { //para adicionar itens em uma lista que foi instanciada
        //como variavel da classe
        compra.add(c); //no tipo compra adicionar a lista c
    }
}
