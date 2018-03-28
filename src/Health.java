import java.util.Random;
public class Health extends Collectable{
    
    private int healthPackHp;
    
    Random rand = new Random();
    public Health(){ 
        super(); //calls on character constructor
        healthPackHp = rand.nextInt(6); //health is a random number from 1 to 5
    }
    
     public int toInt(){ //toInt
       int out = 4; //4 = health
       return out;
   }

       public String toString(){ 
        String out = "\u2764";
        return out;
    }
   
}
