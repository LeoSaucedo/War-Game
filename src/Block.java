
public class Block extends Obstacle{
    
    private int blockHp; //holds the health 
    
    public Block(){
        super();
        blockHp  = 3; //health of the obstacle 
    }

    
    public int toInt(){ //to int
       int out = 3; //3 = block
       return out;
    }
    
    public String toString(){
        return("\u2612");  //dimond sign, but we 
                           //can change if needed
    }
}
    
 
