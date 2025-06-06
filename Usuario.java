public class Usuario {
  String Nome;
  String CPF;
  String Email;
public Usuario (String Nome, String CPF, String Email)
  { this.Nome = Nome;
    this.CPF = CPF;
    this.Email = Email;
  }
  public String toString() {
    return Nome +"-"+ CPF +"-"+ Email;
  }
  }
