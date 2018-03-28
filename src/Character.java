import java.lang.Math;
import java.util.Random;
/*
 * A Character
 */
public class Character {
    private int x; //creates x
    private int y; //creates y
    private int ammo; //creates an ammo variable 
    private int hp; //creates a health variable 
    private String name; //creates a variable for the name 
 
    /**
     * Constructer for the character.
     */
    public Character(){
        ammo = 3; //default ammo is 3
        hp = 3; //default hp = 3
    }
    
    public Character(int amtHp, int amtAmmo, String name){ //Assigns position
        ammo = amtAmmo;
        hp = amtHp;
        name = this.name;
    }
    /**
     * Returns the distance.
     */
    public int getDistance(Character aChar){ //gets distance between 2 characters
        double distance = 0;
        int xDistance = 0;
        int yDistance = 0;
        xDistance = Math.abs(this.getX() - aChar.getX());
        yDistance = Math.abs(this.getY() - aChar.getY());
        distance = 	Math.sqrt(Math.pow((double)xDistance, 2.0) + Math.pow((double)yDistance, 2.0)); //uses pathagorian formula to find distance
        return (int)distance; //returns distance
    }
    
    /**
     * Attacks an enemy.
     * @param enemy The character to attack.
     */
    public void attack(Character enemy){
        int denominator = 32;
        int numerator = 32 - (this.getDistance(enemy));
        double probability = numerator/denominator; //probability goes up as players move closer
        if(probability >= Math.random()){ //determines if the ammo hits the opponent
            enemy.setHp(hp - 1); //if it does then enemy hp is reduced by 1   
        }
        this.setAmmo(ammo - 1); //subtracts 1 ammo per shot
    }

    
    public int getX(){ //gets x value
        return x;
    }
    
    public void setX(int x){ //sets x value
        this.x = x;
    }
    
    public int getY(){ //gets y value
        return y;
    }
    
    public void setY(int y){ //sets y value
        this.y = y;
    }
    
    public int getAmmo(){ //gets ammo
		 return ammo;          
	}
	
	public void setAmmo(int ammo){ //sets ammo
	    this.ammo = ammo; 
	}
	
	public int getHp(){ //gets hp
		 return hp;          
	}
	
	public void setHp(int hp){ //sets hp
	    this.hp = hp;
	}
	
	 /**
     * Returns information on the Character.
     */
    public String toString(){ //toString
        String out = "null";
        return out;
    }
    public int toInt(){ //itInt
        int out = 0;
        return out;
    }
}

