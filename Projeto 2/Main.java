import java.util.Scanner;



public class carros {

    public static void main(String[] args) {


      Scanner scan = new Scanner(System.in);
      String[] carros = new String[3];
      int opção;


while(true){


      System.out.println("Escolha uma opção:");
      System.out.print("1 Armazenar carros, ");
      System.out.print("2 ver carros, ");
      System.out.print("pressione 0 para sair.");
      opção = scan.nextInt();
      scan.nextLine();

      switch (opção) {
        case 1:

        for (int i = 0; i < carros.length; i++) {

          System.out.println("Digite seu carro:");
          
          carros[i] = scan.nextLine();
          
        }
          break;

          case 2:
          System.out.println("Seus carros são:");
          System.out.println(carros[0]);
          System.out.println(carros[1]);
          System.out.println(carros[2]);

          break;

          case 0:
          System.out.println("Safe Exit");
          scan.close();
          System.exit(0);
          break;


         default:

          if (opção>5) {
          System.out.println("Essa opção não existe");
          }
        

          break;

      }
    }
  }
}
