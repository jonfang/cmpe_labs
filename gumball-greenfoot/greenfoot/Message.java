import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image;
    
    public Message(){
        image = new GreenfootImage(100, 50);
        setImage(image);
    }
    
    public void setText(String msg){
        image.clear();
        image.setColor(Color.YELLOW);
        image.fill();
        image.setColor(Color.BLACK);
        image.drawString(msg, 0, 25);
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            World world = getWorld();
            world.removeObject(this);
        }
    }    
}
