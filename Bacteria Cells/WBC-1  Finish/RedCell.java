import greenfoot.*;

/**
 * Write a description of class RedCell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedCell extends Actor
{
    public int speed;
    /**
     * Get a random number from 1 to 2 and set it the the intance variable speed.
     */
    public RedCell()
    {
        speed = Greenfoot.getRandomNumber(2) + 1;
        setRotation(Greenfoot.getRandomNumber(360));
    }
    
    /**
     * Moves the RedCell from right to left and it turns it slowly clockwise.
     * If the RedCell touches the left of the screen it will get removed.
     */
    
    public void act() 
    {
        setLocation(getX() - speed, getY());
        
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }
}
