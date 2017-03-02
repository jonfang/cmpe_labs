import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 
    private ArrayList<Picker> pickers = new ArrayList();
    
    public void add(Picker obj){
        pickers.add(obj);
    }
    public void remove(Picker obj){
        pickers.remove(obj);
    }
    
    public void inspect(Coin coin) 
    {
        // Add your action code here.
        setMessage(coin.getClass().getName());
        int which = Greenfoot.getRandomNumber(pickers.size());
        Picker picked = pickers.get(which);
        if(coin.getClass()== Quarter.class){
             picked.pick();
        }
    }    
}
