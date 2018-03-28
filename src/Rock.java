
public class Rock extends Obstacle{
    
    private int rockHp;
    
    public Rock(){
        super();
        rockHp  = 3; //amount of health rock has 
    }
    
    public String toString(){ //toString
        return("\u2612"); //bock with x
    }

    public int toInt(){ //toInt
       int out = 2; //2 = rock
       return out;
   }
}

