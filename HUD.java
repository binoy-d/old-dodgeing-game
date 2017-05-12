import java.awt.*;
import java.util.*;
public class HUD{
  public static int health = 100;
  public HUD(){
    
  }
  public void tick(){
    
  }
  public void render(Graphics g){
    g.setColor(Color.black);
    g.fillRect(15,15,104,34);
    g.setColor(Color.green);
    g.fillRect(17,17,health,30);
  }
}