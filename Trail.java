import java.awt.*;
import java.awt.image.*;
import java.util.*;

public class Trail extends GameObject{
  private float alpha = 1;
  private Handler handler;
  private Color color;
  private int width,height;
  private float life;
  
  //0.01<life<0.1 
  public Trail(int x, int y,int w,int h, float l, ID id,Color color,Handler handler){
    super(x,y,id);
    this.color = color;
    width = w;
    life = l;
    height = h;
    this.handler = handler;
  }
  public void tick(){
    if(alpha>life){
     alpha-=(life-0.001f); 
    }
    else{
     handler.removeObject(this); 
    }
  }
  public void render(Graphics g){
    Graphics2D g2d = (Graphics2D)g;
    g2d.setComposite(makeTransparent(alpha));
    g.setColor(color);
    g.fillRect(x,y,width,height);
    
    g2d.setComposite(makeTransparent(1));
  }
  public Rectangle getBounds(){
   return null; 
  }
  private AlphaComposite makeTransparent(float alpha){
    int type = AlphaComposite.SRC_OVER;
    return (AlphaComposite.getInstance(type,alpha));
  }
  
}