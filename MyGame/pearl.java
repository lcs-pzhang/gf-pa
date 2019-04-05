import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pearl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pearl extends Actor
{
     private int speed;
    /**
     * Constructor
     */
    public pearl()
    {
        speed = Greenfoot.getRandomNumber(13) + 1;
    }
    
    /**
     * Act - do whatever the pearl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()+speed, getY());
        if (getX() == 600)
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
        if (Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("left")) 
        {
           MyWorld world = (MyWorld)getWorld();
           world.addScore(30);
           GreenfootSound sound = new GreenfootSound("star.mp3");
           sound.play();
           world.removeObject(this);
        }
    }
}
