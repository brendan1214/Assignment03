
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City kw = new City(); 
     
    Robot bot = new Robot(kw,0,2,Direction.WEST);
    
    new Wall(kw, 1, 1, Direction.NORTH); 
    new Wall(kw, 1, 2, Direction.NORTH);
    new Wall(kw, 1, 1, Direction.WEST);
    new Wall(kw, 2, 1, Direction.WEST);
    new Wall(kw, 2, 2, Direction.SOUTH);
    new Wall(kw, 2, 1, Direction.SOUTH);
    new Wall(kw, 1, 2, Direction.EAST);
    new Wall(kw, 2, 2, Direction.EAST);
    
    int a = 0;
    while(a<8){
    bot.move();
    bot.move();
    bot.turnLeft();
    bot.move();
    a=a+1;
    
    }
    
    
    
    
    }
}
