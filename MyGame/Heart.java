import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends Actor
{
    private int speed;
    private int score;
    /**
     * Constructor
     */
    public Heart()
    {
        speed = Greenfoot.getRandomNumber(7) + 1;
        
    }
    
    /**
     * Act - do whatever the Heart wants to do. This method is called whenever
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
        if (Greenfoot.isKeyDown("up")) 
        {
           MyWorld world = (MyWorld)getWorld();
           world.addScore(20);
           GreenfootSound sound = new GreenfootSound("bell3.mp3");
           sound.play();
           world.removeObject(this);
        }
    }
}
