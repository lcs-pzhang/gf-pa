import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spade extends Actor
{
    private int speed;
    
    /**
     * Constructor
     */
    public Spade()
    {
        speed = Greenfoot.getRandomNumber(4) + 1;
    }
    
    /**
     * Act - do whatever the Spade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()+speed, getY());
        if (getX() == 0)
        {
            MyWorld world = (MyWorld)getWorld();
            world.addScore(-10);
            world.removeObject(this);
        }
        checkKeyPress();
    } 
    
    /**
     * Check whether a keyboard key has been pressed and react if it has.
     */
     private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left")) 
        {
           MyWorld world = (MyWorld)getWorld();
           world.addScore(20);
           world.removeObject(this);
        }
    }
}
    
  
