import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The bloodstream is the setting for our White Blood Cell scenario. 
 * It's a place where blood cells, bacteria and viruses float around.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Bloodstream extends World
{
    public int score;
    public int time;
    /**
     * Constructor: Set up the staring objects.
     */
    public Bloodstream()
    {    
        super(780, 360, 1); 

        prepare();
        setPaintOrder(Border.class);
        score = 0;
        showScore();
        time = 2000;
        showTime();
    }
    
    /**
     * Add 20 points the the score variable.
     * shows the string "Score" plus the intance variable in sfront of it. 
     */
    public void addScore(int points)
    {
        score = score + points;
        showScore();
    }
    
    /**
     * shows the score on the upper right of the screen
     * if the score if less than 0, you lost the game
     */
    private void showScore()
    {  
        showText("Score: " + score, 80, 25);
        if(score < 0)
        {
            Greenfoot.stop();
            Greenfoot.playSound("game-over.wav");
        }
    }
    
    /**
     * Shows the time on the upper left of the screen
     */
    private void showTime()
    {
        showText("Time: " + time, 700, 25);
    }
    
    /**
     * it subtracts 1 every act cycle to the time instance variable
     * if the time equals to 0 the game will stop and show you your score
     */
    private void countTime()
    {
        time = time - 1;
        showTime();
        if(time == 0)
        {
            showText("Time is up you win!", getWidth()/2, getHeight()/2);
            showText("Your final score: " + score + " points", getWidth()/2 + 20, getHeight()/2 + 20);
            Greenfoot.stop();
        }
    }
    
    /**
     * Create new floating objects at irregular intervals.
     */
    public void act()
    {
        countTime();
        if (Greenfoot.getRandomNumber(100) < 3)
        {
            addObject(new Bacteria(), 779, Greenfoot.getRandomNumber(360));
        }
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Lining(), 779, 359);
        }
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Lining(), 779, 5);
        }
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Virus(), 779, Greenfoot.getRandomNumber(360));
        }
        if (Greenfoot.getRandomNumber(100) < 6)
        {
            addObject(new RedCell(), 779, Greenfoot.getRandomNumber(360));
        }
    }
    
    /**
     * Prepare the world for the start of the program. In this case: Create
     * a white blood cell and the lining at the edge of the blood stream.
     */
    private void prepare()
    {
        WhiteCell whitecell = new WhiteCell();
        addObject(whitecell, 95, 195);
        Lining lining = new Lining();
        addObject(lining, 126, 1);
        Lining lining2 = new Lining();
        addObject(lining2, 342, 5);
        Lining lining3 = new Lining();
        addObject(lining3, 589, 2);
        Lining lining4 = new Lining();
        addObject(lining4, 695, 5);
        Lining lining5 = new Lining();
        addObject(lining5, 114, 359);
        Lining lining6 = new Lining();
        Lining lining7 = new Lining();
        addObject(lining7, 295, 353);
        Lining lining8 = new Lining();
        Lining lining9 = new Lining();
        Lining lining10 = new Lining();
        addObject(lining10, 480, 358);
        Lining lining11 = new Lining();
        addObject(lining11, 596, 359);
        Lining lining12 = new Lining();
        addObject(lining12, 740, 354);
        Border border = new Border();
        addObject(border, 0, 180);
        Border border2 = new Border();
        addObject(border2, 770, 180);
    }
}
