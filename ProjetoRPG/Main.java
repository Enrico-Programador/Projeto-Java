import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
    
     ImageIcon icone = new ImageIcon("Dale.jpg");

     JFrame window = new JFrame();
     window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     window.setResizable(false);
     window.setTitle("RPG");
     window.setLocationRelativeTo(null);
     window.setVisible(true);
     window.setIconImage(icone.getImage());
     
     GamePanel gamepanel = new GamePanel();
     window.add(gamepanel);
     window.pack();


    }

}
