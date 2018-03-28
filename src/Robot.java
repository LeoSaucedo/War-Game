
public class Robot extends Character{
    /**
     *  constructor 
     */
    public Robot(int amtHp, int amtAmmo, String name){ //needs hp, ammo, and name
        super(amtHp, amtAmmo, name);
        
    }
    
    public String toString(){ //toString
        return("\uc6c3");
    }
    
    public int toInt(){ //toInt
        int out = 1; //1 = robot
        return out;
    }
     
}
