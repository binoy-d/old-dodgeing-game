import java.awt.*;
import java.util.*;

public class Particle extends GameObject{
  private Random r = new Random();
  public Particle(int x, int y, ID id){
    super(x,y,id);
    velX = r.nextInt(5)+1;
    velY = r.nextInt(5)+1;
  }
  public void tick(){
    if(x<=640){
    x+=velX;
    y+=velY;
    }
    else{
     x = 0;
     y = 0;
    }
  }

  public Rectangle getBounds(){
    return new Rectangle(x,y,10,10);
  }
  public void render(Graphics g){
    g.setColor(Color.yellow);
    g.fillOval(x,y,10,10);
  }
}