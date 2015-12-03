import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor implements Component, IMenuInvoker
{
    private ICommand playGame;

    public Start(){
        playGame = new MenuCommand();
        playGame.setReceiver(new IFunctionReceiver() {
                    public void perform(Actor actor){
                        ((CarWorld) getWorld()).pauseGame(false);
                        
                        //toggles Music
                        ((CarWorld) getWorld()).toggleMusic();
                        
                        ((CarWorld) getWorld()).add(new Pause(),480,550);
                        getWorld().removeObject(actor);
                        /*
                        */
                    }
                });
        setCommand(playGame);       
    }

    /**
     * Act - do whatever the Information wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
    }            

    public void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            //             ((CarWorld) getWorld()).pauseGame(false);
            //             ((CarWorld) getWorld()).add(new Pause(),480,550);
            //             getWorld().removeObject(this);
            invoke(this);
            
        }
    }

    public void initialize(){
    }

    public void setCommand(ICommand command){
        playGame = command;
    }

    public void invoke(Actor actor){
        playGame.execute(actor);
    }
}
