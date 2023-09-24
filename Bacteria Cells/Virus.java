import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Virus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Virus extends Actor
{
    /**
     *Moves the virus class from right to left of the screen
     *and rotates the object anti-clockwise.
     */
    public void act() 
    {
        setLocation(getX()-8, getY());
        turn(-1);
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }    
}
