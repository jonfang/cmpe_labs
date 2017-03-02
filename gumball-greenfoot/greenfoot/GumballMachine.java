import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{   Message m = new Message();
    Actor haveCoin=null;
    
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }
    
    public void setMessage(String msg){
        int mX, mY;
        MouseInfo mouse = Greenfoot.getMouseInfo();
        mX = mouse.getX(); 
        mY = mouse.getY();
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
        if(Greenfoot.mousePressed(this)){
            if(haveCoin==null){
                setMessage("No Coin Inserted");
            }
            else{
                setMessage("Cranked Turned");
                World world = getWorld();
               /*
                for(Picker g: world.getObjects(Picker.class)){
                    g.pick();
                }*/
                for(Inspector g: world.getObjects(Inspector.class)){
                   g.inspect((Coin)(haveCoin));
                }
                haveCoin = null;
            }
        }
        Actor coin = getOneIntersectingObject(Coin.class);
        if(coin!=null){
            haveCoin = coin;
            setMessage("Have Coin");
            World world = getWorld();
            world.removeObject(coin);
        }
       
        /*
        if(Greenfoot.mousePressed(this)){
            if(haveCoin==null){
                setMessage("No Coin in Slot!!!");
            }
            else{
                setMessage("Crank Turned!!!");
            }
        }
        Actor coin = getOneObjectAtOffset( 10, 10, Coin.class);
        
        if(coin!=null){
            if(haveCoin!=null){
                coin.move(-300);
            }
            else{
                haveCoin = coin;
                setMessage("Have Coin!!!");
                ((Coin)coin).inSlot();
            }
        
        }
        */
    }    
}
