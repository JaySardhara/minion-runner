import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Banana here.
 * 
 * @author Manthan 
 * @version (a version number or a date)
 */
public class PersonHandler implements Chain
{
    private Actor collidedPerson;
    private  Chain nextInChain;

    public void setNextChain(Chain nextInChain) 
    {     
        this.nextInChain = nextInChain;    
    }

    public void calculate(Car a) 
    {
        collidedPerson = a.getCollidedActor(Person.class);
        if (collidedPerson != null)
        {
            a.getWorld().removeObject(collidedPerson);
            ((CarWorld) a.getWorld()).collided();
            //Greenfoot.playSound("Explosion.wav");
        }
        else 
        {

            nextInChain.calculate(a);

        }       
    }

}
