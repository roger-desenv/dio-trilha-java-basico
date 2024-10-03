public class SistemaMedida {
  public static void main(String[] args) {
    
    String sigla = "R";

    switch (sigla) {
      case "P": {
        System.out.println("PEQUENO");
        break;
      }

      case "G": {
        System.out.println("GRANDE");
        break;
      }

      case "M": {
        System.out.println("MÉDIO");
        break;
      }
    
      default:
        System.out.println("INDEFINIDO");
        
        break;
    }

  }
}
