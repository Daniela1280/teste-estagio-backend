package model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Usuario usuario;
    private List<ItemVenda> itens = new ArrayList<>();

    public Venda(Usuario usuario) {
        this.usuario = usuario;
    }

    public void adicionarItem(Produto produto, int qtd) {
        itens.add(new ItemVenda(produto, qtd));
    }

    public double getTotal() {
        return itens.stream().mapToDouble(ItemVenda::getTotal).sum();
    }

    @Override
    public String toString() {
        StringBuilder texto = new StringBuilder("Venda para " + usuario.getNome() + "\n");
        for (ItemVenda item : itens) {
            texto.append(" - ").append(item).append("\n");
        }
        texto.append("Total: R$").append(getTotal());
        return texto.toString();
    }
}