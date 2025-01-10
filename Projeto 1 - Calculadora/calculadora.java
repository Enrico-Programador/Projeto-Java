
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int escolha;



            while (true) {
                
            System.out.println("Digite 1 para adição, 2 para subtração, 3 para multiplicação, 4 para divisão e 0 para sair:");
            escolha = scan.nextInt();
   
            switch (escolha) {


                case 1:
                System.out.println("Digite o número para adicionar:");
                int x1 = scan.nextInt();
   
                System.out.println("Digite outro número para adicionar:");
                int y1 = scan.nextInt();
                int z1;
                z1 = y1 + x1;
                System.out.println(z1);

                break;


                case 2:
                System.out.println("Digite o número para adicionar:");
                int x2 = scan.nextInt();
   
                System.out.println("Digite outro número para subtrair:");
                int y2 = scan.nextInt();
                int z2;
                z2 = x2 - y2;
                System.out.println(z2);
                break;


                case 3:
                System.out.println("Digite o número para multiplicar:");
                int x3 = scan.nextInt();
   
                System.out.println("Digite outro número para multiplicar:");
                int y3 = scan.nextInt();
                int z3;
                z3 = x3 * y3;
                System.out.println(z3);

                
                case 4:
                System.out.println("Digite o número para dividir:");
                int x4 = scan.nextInt();
   
                System.out.println("Digite outro número para dividir:");
                int y4 = scan.nextInt();
                int z4;
                z4 = x4 / y4;
                System.out.println(z4);
                break;

                case 0:
                System.out.println("Safe Exit");
            	System.exit(0);
                break;
            
                default:
                System.out.println("Digite um número");
                    break;
            }
   
   } }
   
   catch (Exception e) {
            
            System.out.println("Você é burro");

   }
        }




        
}
