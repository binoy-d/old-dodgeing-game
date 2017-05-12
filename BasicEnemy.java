import java.awt.*;
import java.util.*;

public class BasicEnemy extends GameObject{
  private Handler handler;
  public BasicEnemy(int x, int y, ID id,Handler handler){
    super(x,y,id);
    velX = 4;
    velY = 4;
    this.handler = handler;
  }
  public void tick(){
    x+=velX;
    y+=velY;
    if(y<=0||y>=Game.HEIGHT-50){
     velY*=-1; 
    }
    if(x<=0||x>=Game.WIDTH-20){
     velX*=-1; 
    }
    handler.addObject(new Trail(x,y,20,20,0.03f,ID.Trail,Color.red,handler));

  }
  public Rectangle getBounds(){
    return new Rectangle(x,y,20,20);
  }
  public void render(Graphics g){

    g.setColor(Color.red);
    g.fillRect(x,y,20,20);

  }
  
}