import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;

public class Images{
   JFrame frame;

   public Images(ImageIcon icon){
    frame = new JFrame();
    JLabel label = new JLabel(icon);
    frame.getContentPane().add(label, BorderLayout.CENTER);
    frame.setSize(400, 300);
   }

   public void start(){
    frame.setVisible(true);
   }
   public void quit(){
    frame.dispose();
   }

}
