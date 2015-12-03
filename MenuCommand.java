import greenfoot.Actor;
/**
 * Write a description of class MenuCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuCommand implements ICommand
{
    IFunctionReceiver receiver;

    public void execute(Actor actor){
        receiver.perform(actor);
    }

    public void setReceiver( IFunctionReceiver receiver ){
        this.receiver = receiver;
    }
}
