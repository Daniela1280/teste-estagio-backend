public class Produto {
  String nome;
  double preco;
  int quantidade;
  public Produto(String nome, double preco, int quantidade)
  { 
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }
  public void vender(int qtd) {
    this.quantidade -= qtd;
  }
  public String toString() {
    return nome +"-R$" + preco + " - Estoque: " + quantidade;
  }
}
  
  
  
