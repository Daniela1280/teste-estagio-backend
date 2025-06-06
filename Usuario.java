public class Usuario {
  String nome;
  String cpf;
  String email;

  public Usuario(String nome, String cpf, String email) {
    // Corrigido: estava 'Nome' maiúsculo, deve ser 'nome'
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
  }

  public String toString() {
    return nome + "-" + cpf + "-" + email;
  }
}
