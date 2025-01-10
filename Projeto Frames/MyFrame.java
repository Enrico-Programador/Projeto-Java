
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class MyFrame extends JFrame implements ActionListener{

JButton botão;
JCheckBox checkBox;

MyFrame(){

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
    this.pack();
    this.setVisible(true);

    botão = new JButton();
    botão.setText("ir");
    botão.addActionListener(this);

    new JCheckBox();
    checkBox.setText("Eu não sou um robo");
    checkBox.setFocusable(false);
    checkBox.setFont(new Font("Arial",Font.PLAIN,25));
    this.add(checkBox);
    
}

    @Override
    public void actionPerformed(ActionEvent e) {

if(e.getSource()==botão){

    System.out.println(checkBox.isSelected());
    this.add(botão);
}

    }


}
