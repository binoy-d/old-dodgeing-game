import java.awt.Canvas;
import java.awt.*;
import javax.swing.*;
public class Window extends Canvas{
  public Window(int width,int height,String title,Game game){
    //frame of our window
   JFrame frame = new JFrame(title);
   //setting size and stuff
   frame.setPreferredSize(new Dimension(width,height));
   frame.setMaximumSize(  new Dimension(width,height));
   frame.setMinimumSize(  new Dimension(width,height));
   //setting frame behaviours
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setResizable(false);
   frame.setLocationRelativeTo(null);
   //putting the game into the frame
   frame.add(game);
   //final stuff(running everything);
   frame.setVisible(true);
   game.start();
  }
}