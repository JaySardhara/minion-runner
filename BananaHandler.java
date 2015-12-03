import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * 
 * 
 * @author Jay Sardhara
 * @version 0.0.1
 */
public class BananaHandler implements Chain
{
    private Actor collidedBanana;
    private  Chain nextInChain;

    public void setNextChain(Chain nextInChain) 
    {     
        this.nextInChain = nextInChain;    
    }

    public void calculate(Car a) 
    {
        collidedBanana = a.getCollidedActor(Banana.class);
        if (collidedBanana != null)
        {
            a.getWorld().removeObject(collidedBanana);
            //((CarWorld) a.getWorld()).collided();
            //Greenfoot.playSound("Explosion.wav");
        }
        else 
        {
            if(nextInChain != null)
                nextInChain.calculate(a);
        }
    }

}
