import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb  extends Actor implements Component
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private Actor collidedVehicle;
    private Actor collidedPerson;
    private Actor collidedBackground;
    public Bomb()
    {
       /*image1 = new GreenfootImage("explosion.png");
       image2 = new GreenfootImage("explosion-big.png");*/
    }
    
    public void initialize(){
    }
    
    public void act() 
    {
       //if(Car.isRocket)
       if(Car.getWeaponState() instanceof RocketWeapon){
            setImage(new GreenfootImage("rocket_only.png")); 
           
        }
       //else if(Car.isSmoker)
       else if(Car.getWeaponState() instanceof SmokerWeapon){
            setImage(new GreenfootImage("fart_smog.png"));
            
        }
        
       moveUp();
       check();
    }
    
    public void moveUp()
    {
       if(((CarWorld) getWorld()).getPause() == false)
       {
          setLocation(getX(), getY()-4);
       }
    }
    public void check()
    {
       collidedVehicle = getOneIntersectingObject(Vehicle.class);
       collidedPerson = getOneIntersectingObject(Person.class);
       collidedBackground = getOneIntersectingObject(Background.class);
       if(collidedVehicle != null || collidedPerson != null || collidedBackground != null || getY() == 0)
       {
          
           //Set randimization for collision laugh of minion
           if( Greenfoot.getRandomNumber(2) < 1)
            Greenfoot.playSound("Minion Laugh Sound Effect_01.mp3");
           else if( Greenfoot.getRandomNumber(2) < 1 )
            Greenfoot.playSound("Minion Laugh Sound Effect_02.mp3");
           else
            Greenfoot.playSound("look_at_u.mp3");
          if(collidedVehicle != null)
          {
             ((CarWorld) getWorld()).addScore(50);
             getWorld().removeObject(collidedVehicle);
          }
          if(collidedBackground != null)
          {
             ((CarWorld) getWorld()).addScore(75);
             getWorld().removeObject(collidedBackground);
          }
          if(collidedPerson != null)
          {
             ((CarWorld) getWorld()).addScore(100);
             getWorld().removeObject(collidedPerson);
          }
          getWorld().removeObject(this);
       }
    }
}
