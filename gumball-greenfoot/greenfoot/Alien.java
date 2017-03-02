import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    Message m = new Message();
    public Alien()
    {
        GreenfootImage image = getImage() ;
        image.scale( 150, 180 ) ; 
    }
    
    public void setMessage(String msg){
        int mX, mY;
        mX = this.getX(); 
        mY = this.getY();
        World world = getWorld();
        if(m.getWorld() != null){
            world.removeObject(m);
        }
        world.addObject(m, mX, mY);
        m.setText(msg);
        
    }

    public void act() 
    {
        // Add your action code here.
    }    
}
