import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase define el objeto del Robot.
 * 
 * @author Diego Prado
 * @version 0.1
 */
public class Robot extends Actor
{
    /**
     * Esta subclase permite difinir todos las acciones del bloque.
     * 
     */
    public void act() 
    {
        robotMovement();   
    }   
    /**
     * Esta subclase se encarga de generar el movimiento del robot.
     * 
     */
    public void robotMovement()
    {
        if(Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX() + 3, getY());
        }
        if(Greenfoot.isKeyDown("Left"))
        {
            setLocation(getX() - 3, getY());
        }
        if(Greenfoot.isKeyDown("Down"))
        {
            setLocation(getX(), getY() + 3);
        }
        if(Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(), getY() - 3);
        }
    }
}
