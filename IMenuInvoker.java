import greenfoot.Actor;
/**
 * Write a description of interface IMenuInvoker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IMenuInvoker  
{
   public void setCommand(ICommand c);
   public void invoke(Actor actor);
}
