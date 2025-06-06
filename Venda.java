import java.util.ArrayList;

public class Venda {
    Usuario usuario;
    ArrayList<ItemVenda> itens = new ArrayList<>();

    public Venda(Usuario usuario) {
        this.usuario = usuario;
    }

    public void adicionarItem(Produto produto, int qtd) {
        itens.add(new ItemVenda(produto, qtd));
    }

    public double getTotal() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.getTotal();
        }
        return total;
    }

    public String toString() {
        String texto = "Venda para " + usuario.nome + "\n";
        for (ItemVenda item : itens) {
            texto += " - " + item + "\n";
        }
        texto += "Total: R$" + getTotal();
        return texto;
    }
}
