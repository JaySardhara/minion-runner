/**
 * Write a description of class NormalWeapon here.
 * 
 * @author (Manthan) 
 * @version (a version number or a date)
 */
public class NormalWeapon implements IWeaponState
{    
    private IWeaponBearer minion;

    /**
     * Constructor for objects of class NormalWeapon
     */
    public NormalWeapon(IWeaponBearer minion)
    {
        this.minion = minion;
    }

    public void smokerHit(){
        minion.setSmokerWeapon();
    }

    public void rocketHit(){
        minion.setRocketWeapon();
    }

}
