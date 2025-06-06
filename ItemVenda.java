public class ItemVenda {
  Produto produto;
  int quantidade;

  public ItemVenda(Produto produto, int quantidade) {
    this.produto = produto;
    this.quantidade = quantidade;
    produto.vender(quantidade);
  }

  public double getTotal() {
    return produto.preco * quantidade;
  }

  public String toString() {
    return produto.nome + " x" + quantidade + " = R$" + getTotal();
  }
}
