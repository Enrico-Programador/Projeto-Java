import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class GamePanel extends JPanel implements Runnable{

      final int originalTileSize = 16;
      final int scale = 3;
      final int tileSize = originalTileSize * scale;
      final int maxScreenCol = 16;
      final int maxScreenRow = 12;
      final int screenWidth = tileSize * maxScreenCol;
      final int screenHeight = tileSize * maxScreenRow;

      Keys keyH = new Keys();
      Thread gameThread;
      boolean running = false;

      //default position
      int playerX = 100;
      int playerY = 100;
      int playerSpeed = 4;

      public GamePanel() {
      this.setPreferredSize(new Dimension(screenWidth, screenHeight));
      this.setBackground(Color.BLUE);
      this.setDoubleBuffered(true);
      this.addKeyListener(keyH);
      this.setFocusable(true);
      this.requestFocusInWindow();
      }

      public void startGameThread(){
        gameThread = new Thread(this);
        running = true;
        gameThread.start();
        
      }
      
      @Override
      public void run(){

     while (running){
      //atualizar as informações do jogo
      update();

      //desenhar a tela com as informações atualizadas
      repaint();

      //definir o fps
      try {
        Thread.sleep(16);
          } catch (Exception e) {
        e.printStackTrace();
                                }
     }
  }

  public void update(){

    if(keyH.upPress){
     playerY -= playerSpeed;
    }
    else if(keyH.downPress){
      playerY += playerSpeed;
    }
    else if(keyH.rightPress == true){
      playerX += playerSpeed;
    }
    else if(keyH.leftPress == true){
      playerX -= playerSpeed;
    }

  }

  //paintComponent é como se fosse seu pincel/lápis
      @Override
  public void paintComponent(Graphics g){

//super é para puxar o jPanel sua "Parent Class" no caso
super.paintComponent(g);
Graphics2D g2 = (Graphics2D) g;
g2.setColor(Color.white);
g2.fillRect(playerX, playerY, tileSize, tileSize);
             //x        y      width     height

//salvar memória          
g2.dispose();
  }

  public void stopGameThread(){
    running = false;
    try {
        gameThread.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
  }

}
