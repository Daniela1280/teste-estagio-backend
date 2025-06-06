import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Usuario usuario1 = new Usuario("Daniela Sousa", "123.456.789-00", "daniela@email.com");

    List<Produto> catalogo = new ArrayList<>();
    catalogo.add(new Produto("Açaí 400ml", 15.0, 10));
    catalogo.add(new Produto("Granola", 3.0, 20));
    catalogo.add(new Produto("Leite condensado", 2.5, 15));

    System.out.println("=== PRODUTOS DISPONÍVEIS ===");
    for (Produto p : catalogo) {
      System.out.println(p);
    }

    Venda venda = new Venda(usuario1);
    venda.adicionarItem(catalogo.get(0), 2); // 2 Açaís
    venda.adicionarItem(catalogo.get(2), 1); // 1 Leite condensado

    System.out.println("\n=== RESUMO DA VENDA ===");
    System.out.println(venda);

    System.out.println("\n=== ESTOQUE ATUALIZADO ===");
    for (Produto p : catalogo) {
      System.out.println(p);
    }
  }
}
