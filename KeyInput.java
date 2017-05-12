import java.awt.event.*;

public class KeyInput extends KeyAdapter{
  private Handler handler;
  public KeyInput(Handler handler){
    this.handler = handler;
  }
  public void keyPressed(KeyEvent e){
    int key = e.getKeyCode();
    for(int i = 0;i<handler.object.size();i++){
      GameObject temp = handler.object.get(i);
      if(temp.getID() == ID.Player){
        //player keyevents
        if(key == KeyEvent.VK_W)temp.setVelY(-5);
        if(key == KeyEvent.VK_S)temp.setVelY(5);
        if(key == KeyEvent.VK_A)temp.setVelX(-5);
        if(key == KeyEvent.VK_D)temp.setVelX(5);
      }
    }
  }
  public void keyReleased(KeyEvent e){
    int key = e.getKeyCode();
   for(int i = 0;i<handler.object.size();i++){
    GameObject temp = handler.object.get(i);
    if(temp.getID() == ID.Player){
        //player keyevents
        if(key == KeyEvent.VK_W)temp.setVelY(0);
        if(key == KeyEvent.VK_S)temp.setVelY(0);
        if(key == KeyEvent.VK_A)temp.setVelX(0);
        if(key == KeyEvent.VK_D)temp.setVelX(0);
      }
   }
  }
  
}