import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Instantiates new Scanner class for reading input
        System.out.println("How big should the grid be?");
        Grid gameGrid = new Grid(input.nextInt());
        
        //Reading and adding characters
        System.out.print("What is the name of player 1? -> ");
        String player1Name = input.next();
        System.out.print("What is the name of player 2? -> ");
        String player2Name = input.next();
        Robot player1 = new Robot(3, 3, player1Name);
        Robot player2 = new Robot(3, 3, player2Name);
        Block block1 = new Block();
        Rock rock1 = new Rock();
        Ammo ammo1 = new Ammo();
        Health health1 = new Health();
        gameGrid.addChar(player1);
        gameGrid.addChar(player2);
        gameGrid.addChar(block1);
        gameGrid.addChar(rock1);
        gameGrid.addChar(ammo1);
        gameGrid.addChar(health1);
        gameGrid.displayGrid();
    }
}