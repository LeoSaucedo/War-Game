import java.util.Random;
public class Ammo extends Collectable{
    
    private int ammoPackAmt;
    
    Random rand = new Random();
    
    public Ammo(){
        super();
         ammoPackAmt = rand.nextInt(6); //Ammo is a random number from 1 to 5
    }

    
      public String toString(){ //toString
        return("\u25A9"); //box with diagonal crosshatch
}
    
     public int toInt(){ //toInt
       int out = 5; //5 = ammo
       return out;
   }
}
