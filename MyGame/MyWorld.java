import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int score;
    private int time;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        score = 0;
        time = 1000;
        showScore();
        showTime();

    }

    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Heart(), 300, Greenfoot.getRandomNumber(360));
        }

        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Diamond(), 300, Greenfoot.getRandomNumber(360)); 
        }

        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Spade(), 300, Greenfoot.getRandomNumber(360));
        }

        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Club(), 300, Greenfoot.getRandomNumber(360));
        }
        countTime();
    }

    public void addScore(int points)
    {
        score = score + points;
        showScore();
        if (score < 0)
        {
            Greenfoot.playSound("game-over.wav");
            Greenfoot.stop();
        }
    }

    private void showScore()
    {
        showText("Score: " + score, 80, 25);
    }

    private void countTime()
    {
        time--;
        showTime();
        if (time == 0)
        {
            showEndMessage();
            Greenfoot.stop();
        }
    }

    private void showTime()
    {
        showText("Time: " + time, 700, 25);
    }

    private void showEndMessage()
    {
        showText("Your final score: " + score + "points", 390, 170);
    }

    private void prepare()
    {  
    }
}
