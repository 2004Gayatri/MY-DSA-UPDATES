import java.util.*;
public class Interfaces{
    public static void main(String[]args){
   Queen q = new Queen();
   q.steps();
     Pawn p = new Pawn();
    p.steps();
    }
  
}
interface ChessPlayer{
    void steps();
} 

class Queen implements ChessPlayer{
   public void steps(){
    System.out.println("top , down, left , right");
   }
}
class Pawn implements ChessPlayer{
    public void steps(){
        System.out.println("one step in the front");
    }
}