import greenfoot.Actor;
/**
 * Command interface.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ICommand  
{
    public void execute(Actor actor);
    void setReceiver( IFunctionReceiver target ) ;
}
