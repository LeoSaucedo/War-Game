import java.util.Random;
/*
 * Constructs a grid.
 * Components, size, addChar, display.
 */
public class Grid {
    public Character[][] grid;
    public String[][] gridDisplay;
    public int[][] gridInt;
    Random rand = new Random();
    
    /**
     * Creates a new grid of specified size.
     * @param size Size of the grid.
     */
    public Grid(int size){
        grid = new Character[size][size];
        gridDisplay = new String[size][size];
        gridInt = new int[size][size];
    }
    
    /**
     * Adds a new character to the field.
     * @param aChar Character to add.
     */
    public void addChar(Character aChar){
        //Randomly generates the coordinates
        int randomX = rand.nextInt(grid.length);
        int randomY = rand.nextInt(grid.length);
        //Places Character values inside each array
        grid[randomX][randomY] = aChar;
        gridDisplay[randomX][randomY] = aChar.toString();
        gridInt[randomX][randomY] = aChar.toInt();
        
        //Writes x and y values into the character
        aChar.setX(randomX);
        aChar.setY(randomY);
    }
    
    /**
     * Outputs the current playing field in Matrix format.
     */
    public void displayGrid(){
        for(int i = 0; i < gridDisplay.length; i++){
            for(int j = 0; j < gridDisplay[i].length; j++){
                if(gridDisplay[i][j] == null){
                    System.out.print("\u25a1  ");
                }else{System.out.print(gridDisplay[i][j] + " ");}
            }
            System.out.println();
        }
    }
}
