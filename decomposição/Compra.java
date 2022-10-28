package decomposição;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    public List<Item> itens = new ArrayList<>();

    public void adicionarItensNaCompra(Item i) {
        itens.add(i);
    }
}
