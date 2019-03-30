import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DIamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamond extends Actor
{
    private int speed;
    /**
     * Constructor
     */
    public Diamond()
    {
        speed = Greenfoot.getRandomNumber(5) + 1;
    }
    
    /**
     * Act - do whatever the DIamond wants to do. This method is called whenever
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
    }    
}
