import java.util.*;
import java.awt.*;
public class Handler{
  
  static LinkedList<GameObject> object = new LinkedList<GameObject>();
  
  public void tick(){
    for(int i = 0;i<object.size();i++){
      GameObject tempObject = object.get(i);
      tempObject.tick();
    }
  }
  public void render(Graphics g){
    for(int i = 0;i<object.size();i++){
      GameObject tempObject = object.get(i);
      tempObject.render(g);
    }
  }
  public void addObject(GameObject o){
    object.add(o);
  }
  public void removeObject(GameObject o){
    object.remove(o);
  }
}