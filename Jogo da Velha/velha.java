
import java.util.Arrays;
import java.util.Scanner;

public class velha {
    public static void main(String[] args) {


    System.out.print("Bem-vindo ao jogo da velha!");

    String[][] tic = {
        {"","","","\n"},
        {"-","-","-","\n"},
        {"-","-","-","\n"},
        {"-","-","-","\n"}
     };

     try (Scanner scan = new Scanner(System.in)) {
        while (true) {
            
             for (int i = 0; i < tic.length; i++) {
            System.out.println();
             for (int j = 0; j < tic[i].length; j++){
        
        
        
               
             }  
             }
        
             System.out.println("O jogo:");
             
             System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
        
        //Jogador 1--------------------------------------------------------------------------------------
             System.out.println("\nJogador 1 selecione um número preencher:");
               System.out.println(" 7 8 9");
               System.out.println(" 4 5 6");
               System.out.println(" 1 2 3");
             System.out.println("Pressione 10 em caso de empate");
             System.out.println("Pressione 0 para sair");
            
               int jogada;
        
               
        loop1: while(scan.hasNextInt()){
        
               jogada = scan.nextInt();
               
               switch (jogada) {
        
            case 7:
        
                if (tic[1][0] == "-"){
        
                    tic[1][0] = "X";
                    break loop1;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 8:
        
                if (tic[1][1] == "-"){
                    tic[1][1] = "X";
                    break loop1;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 9:
        
                if (tic[1][2] == "-"){
                    tic[1][2] = "X";
                    break loop1;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 4:
        
                if (tic[2][0] == "-"){
                    tic[2][0] = "X";
                    break loop1;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 5:
        
                if (tic[2][1] == "-"){
                    tic[2][1] = "X";
                    break loop1;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 6:
        
                if (tic[2][2] == "-"){
                    tic[2][2] = "X";
                    break loop1;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 1:
        
                if (tic[3][0] == "-"){
                    tic[3][0] = "X";
                    break loop1;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 2:
        
                if (tic[3][1] == "-"){
                    tic[3][1] = "X";
                    break loop1;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 3:
        
                if (tic[3][2] == "-"){
                    tic[3][2] = "X";
                    break loop1;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
                
            case 10:
        
                    tic[1][0] = "-";
                    tic[1][1] = "-";
                    tic[1][2] = "-";
                    tic[2][0] = "-";
                    tic[2][1] = "-";
                    tic[2][2] = "-";
                    tic[3][0] = "-";
                    tic[3][1] = "-";
                    tic[3][2] = "-";
        
                    System.out.println("\nJogo reiniciado!");
                   
                    break loop1;
        
            case 0:
                System.out.println("Obrigado por jogar!!");
                System.exit(0);
        
            default:
                if (jogada>10) {
        
                System.out.println("");
                System.out.println("Selecione uma opção válida");
                    
                }
                    break;
               }}
        
        
               if(tic[1][0] == "X" && tic[1][1] == "X" && tic[1][2] == "X"){
                System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                System.out.println("\nO jogador 1 ganhou!!");
                tic[1][0] = "-";
                tic[1][1] = "-";
                tic[1][2] = "-";
                tic[2][0] = "-";
                tic[2][1] = "-";
                tic[2][2] = "-";
                tic[3][0] = "-";
                tic[3][1] = "-";
                tic[3][2] = "-";
                continue;
            }
        
            else if(tic[2][0] == "X" && tic[2][1] == "X" && tic[2][2] == "X"){
                System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                System.out.println("\nO jogador 1 ganhou!!");
                tic[1][0] = "-";
                tic[1][1] = "-";
                tic[1][2] = "-";
                tic[2][0] = "-";
                tic[2][1] = "-";
                tic[2][2] = "-";
                tic[3][0] = "-";
                tic[3][1] = "-";
                tic[3][2] = "-";
                continue;
            }
        
            else if(tic[3][0] == "X" && tic[3][1] == "X" && tic[3][2] == "X"){
                System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                System.out.println("\nO jogador 1 ganhou!!");
                tic[1][0] = "-";
                tic[1][1] = "-";
                tic[1][2] = "-";
                tic[2][0] = "-";
                tic[2][1] = "-";
                tic[2][2] = "-";
                tic[3][0] = "-";
                tic[3][1] = "-";
                tic[3][2] = "-";
                continue;
            }
            else if(tic[1][0] == "X" && tic[2][0] == "X" && tic[3][0] == "X"){
                System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                System.out.println("\nO jogador 1 ganhou!!");
                tic[1][0] = "-";
                tic[1][1] = "-";
                tic[1][2] = "-";
                tic[2][0] = "-";
                tic[2][1] = "-";
                tic[2][2] = "-";
                tic[3][0] = "-";
                tic[3][1] = "-";
                tic[3][2] = "-";
                continue;
            }
            else if(tic[1][1] == "X" && tic[2][1] == "X" && tic[3][1] == "X"){
                System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                System.out.println("\nO jogador 1 ganhou!!");
                tic[1][0] = "-";
                tic[1][1] = "-";
                tic[1][2] = "-";
                tic[2][0] = "-";
                tic[2][1] = "-";
                tic[2][2] = "-";
                tic[3][0] = "-";
                tic[3][1] = "-";
                tic[3][2] = "-";
                continue;
            }
            else if(tic[1][2] == "X" && tic[2][2] == "X" && tic[3][2] == "X"){
                System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                System.out.println("\nO jogador 1 ganhou!!");
                tic[1][0] = "-";
                tic[1][1] = "-";
                tic[1][2] = "-";
                tic[2][0] = "-";
                tic[2][1] = "-";
                tic[2][2] = "-";
                tic[3][0] = "-";
                tic[3][1] = "-";
                tic[3][2] = "-";
                continue;
            }
            else if(tic[1][0] == "X" && tic[2][1] == "X" && tic[3][2] == "X"){
                System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                System.out.println("\nO jogador 1 ganhou!!");
                tic[1][0] = "-";
                tic[1][1] = "-";
                tic[1][2] = "-";
                tic[2][0] = "-";
                tic[2][1] = "-";
                tic[2][2] = "-";
                tic[3][0] = "-";
                tic[3][1] = "-";
                tic[3][2] = "-";
                continue;
            }
            else if(tic[1][2] == "X" && tic[2][1] == "X" && tic[3][0] == "X"){
                System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                System.out.println("\nO jogador 1 ganhou!!");
                tic[1][0] = "-";
                tic[1][1] = "-";
                tic[1][2] = "-";
                tic[2][0] = "-";
                tic[2][1] = "-";
                tic[2][2] = "-";
                tic[3][0] = "-";
                tic[3][1] = "-";
                tic[3][2] = "-";
                continue;
            }
        
        //Jogador 1--------------------------------------------------------------------------------------
        
        //Jogador 2--------------------------------------------------------------------------------------
        
            System.out.println("");
            System.out.println(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
             System.out.println("Jogador 2 selecione um número preencher:");
               System.out.println(" 7 8 9");
               System.out.println(" 4 5 6");
               System.out.println(" 1 2 3");
            System.out.println("Pressione 10 em caso de empate");
            System.out.println("Pressione 0 para sair");
        
            int jogada2;
        
        
        loop2: while(scan.hasNextInt()) {
        
               jogada2 = scan.nextInt();
               switch (jogada2) {
        
            case 7:
        
                if (tic[1][0] == "-"){
                    tic[1][0] = "O";
                    break loop2;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 8:
        
                if (tic[1][1] == "-"){
                    tic[1][1] = "O";
                    break loop2;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
        
            case 9:
        
                if (tic[1][2] == "-"){
                    tic[1][2] = "O";
                    break loop2;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 4:
        
                if (tic[2][0] == "-"){
                    tic[2][0] = "O";
                    break loop2;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 5:
                if (tic[2][1] == "-"){
                    tic[2][1] = "O";
                    break loop2;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 6:
        
                if (tic[2][2] == "-"){
                    tic[2][2] = "O";
                    break loop2;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 1:
                if (tic[3][0] == "-"){
                    tic[3][0] = "O";
                    break loop2;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 2:
        
                if (tic[3][1] == "-"){
                    tic[3][1] = "O";
        
                    break loop2;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 3:
        
                if (tic[3][2] == "-"){
                    tic[3][2] = "O";
        
                    break loop2;
                }
        
                else {
                    System.out.println("\nEste local está preenchido!!\nSelecione outra opção:");
                    continue;
                }
        
            case 10:
        
                    tic[1][0] = "-";
                    tic[1][1] = "-";
                    tic[1][2] = "-";
                    tic[2][0] = "-";
                    tic[2][1] = "-";
                    tic[2][2] = "-";
                    tic[3][0] = "-";
                    tic[3][1] = "-";
                    tic[3][2] = "-";
                    
                    System.out.println("\nJogo reiniciado!");
        
                    break loop2;
        
            case 0:
                System.out.println("Obrigado por jogar!!");
                System.exit(0);
        
            default:
                if (jogada2>10) {
        
                System.out.println("");
                System.out.println("Selecione uma opção válida");
                 }
                break loop2;
        
                }}
        
        
                if(tic[1][0] == "O" && tic[1][1] == "O" && tic[1][2] == "O"){
                 System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                 System.out.println("\nO jogador 2 ganhou!!");
                 tic[1][0] = "-";
                 tic[1][1] = "-";
                 tic[1][2] = "-";
                 tic[2][0] = "-";
                 tic[2][1] = "-";
                 tic[2][2] = "-";
                 tic[3][0] = "-";
                 tic[3][1] = "-";
                 tic[3][2] = "-";
                
                }
            
                else if(tic[2][0] == "O" && tic[2][1] == "O" && tic[2][2] == "O"){
                 System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                 System.out.println("\nO jogador 2 ganhou!!");
                 tic[1][0] = "-";
                 tic[1][1] = "-";
                 tic[1][2] = "-";
                 tic[2][0] = "-";
                 tic[2][1] = "-";
                 tic[2][2] = "-";
                 tic[3][0] = "-";
                 tic[3][1] = "-";
                 tic[3][2] = "-";
                }
            
                else if(tic[3][0] == "O" && tic[3][1] == "O" && tic[3][2] == "O"){
                 System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                 System.out.println("\nO jogador 2 ganhou!!");
                 tic[1][0] = "-";
                 tic[1][1] = "-";
                 tic[1][2] = "-";
                 tic[2][0] = "-";
                 tic[2][1] = "-";
                 tic[2][2] = "-";
                 tic[3][0] = "-";
                 tic[3][1] = "-";
                 tic[3][2] = "-";
                }
                else if(tic[1][0] == "O" && tic[2][0] == "O" && tic[3][0] == "O"){
                 System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                 System.out.println("\nO jogador 2 ganhou!!");
                 tic[1][0] = "-";
                 tic[1][1] = "-";
                 tic[1][2] = "-";
                 tic[2][0] = "-";
                 tic[2][1] = "-";
                 tic[2][2] = "-";
                 tic[3][0] = "-";
                 tic[3][1] = "-";
                 tic[3][2] = "-";
                }
                else if(tic[1][1] == "O" && tic[2][1] == "O" && tic[3][1] == "O"){
                 System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                 System.out.println("\nO jogador 2 ganhou!!");
                 tic[1][0] = "-";
                 tic[1][1] = "-";
                 tic[1][2] = "-";
                 tic[2][0] = "-";
                 tic[2][1] = "-";
                 tic[2][2] = "-";
                 tic[3][0] = "-";
                 tic[3][1] = "-";
                 tic[3][2] = "-";
                }
                else if(tic[1][2] == "O" && tic[2][2] == "O" && tic[3][2] == "O"){
                 System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                 System.out.println("\nO jogador 2 ganhou!!");
                 tic[1][0] = "-";
                 tic[1][1] = "-";
                 tic[1][2] = "-";
                 tic[2][0] = "-";
                 tic[2][1] = "-";
                 tic[2][2] = "-";
                 tic[3][0] = "-";
                 tic[3][1] = "-";
                 tic[3][2] = "-";
                }
                else if(tic[1][0] == "O" && tic[2][1] == "O" && tic[3][2] == "O"){
                 System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                 System.out.println("\nO jogador 2 ganhou!!");
                 tic[1][0] = "-";
                 tic[1][1] = "-";
                 tic[1][2] = "-";
                 tic[2][0] = "-";
                 tic[2][1] = "-";
                 tic[2][2] = "-";
                 tic[3][0] = "-";
                 tic[3][1] = "-";
                 tic[3][2] = "-";
                }
                else if(tic[1][2] == "O" && tic[2][1] == "O" && tic[3][0] == "O"){
                 System.out.print(Arrays.deepToString(tic).replace("]","").replace("[","").replace(",",""));
                 System.out.println("\nO jogador 2 ganhou!!");
                 tic[1][0] = "-";
                 tic[1][1] = "-";
                 tic[1][2] = "-";
                 tic[2][0] = "-";
                 tic[2][1] = "-";
                 tic[2][2] = "-";
                 tic[3][0] = "-";
                 tic[3][1] = "-";
                 tic[3][2] = "-";
                }
        
        //Jogador 2--------------------------------------------------------------------------------------
            
          }
    }
 }
}
