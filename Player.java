import java.awt.*;
import java.util.*;

public class Player extends GameObject{
  private Random r = new Random();
  Handler handler;
  public Player(int x, int y, ID id,Handler handler){
    super(x,y,id);
    this.handler = handler;
  }
  public Rectangle getBounds(){
    return new Rectangle(x,y,32,32);
  }
  public void tick(){
 
    x+=velX;
    y+=velY;
    x = Game.clamp(x,0,Game.WIDTH-38);
    y = Game.clamp(y,0,Game.HEIGHT-62);
    collision();
  }
    
  public void collision(){
    for(int i = 0;i<Handler.object.size();i++){
     GameObject temp = Handler.object.get(i);
     if(temp.getID() == ID.BasicEnemy){
      
       if(getBounds().intersects(temp.getBounds())){
         //collision
         HUD.health--;
       }
     }
    }
  }
  public void render(Graphics g){
    g.setColor(Color.white);
    g.fillRect(x,y,32,32);
  }
}