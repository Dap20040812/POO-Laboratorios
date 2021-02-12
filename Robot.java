
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Esta clase define el objeto del Robot.
 * 
 * @author Diego Prado- Daniel Barco- Jose Luis Tovar
 * @version 0.2
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
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
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
    /**
     * Esta subclase permite detectar la colisión del robot con el muro y realizar las acciones correspodientes al acto..
     * 
     */
    public void detectWallCollision()
    {
     if(isTouching(Wall.class))
       {
           Greenfoot.playSound("hurt.mp3");
       }   
    }
    /**
     * Esta subclase permite detectar la colisión del robot con el bloque y realizar las acciones correspodientes al acto..
     * 
     */
    public void detectBlockCollision()
    {
       if(isTouching(Block.class))
       {
           setLocation(48,50);
           Greenfoot.playSound("hurt.mp3");
       }
    }
    /**
     * Esta subclase permite detectar la colisión del robot con la casa y realizar las acciones correspodientes al acto..
     * 
     */
    public void detectHome()
    {
        if(isTouching(Home.class))
       {
           setLocation(48,50);
           Greenfoot.playSound("yipee.mp3");
       }
    }
    /**
     * Esta subclase permite detectar la colisión del robot con las pizzas y realizar las acciones correspodientes al acto..
     * 
     */
    public void eatPizza()
    {
        if(isTouching(Pizza.class))
       {
           removeTouching(Pizza.class);
           Greenfoot.playSound("eat.mp3");
       }
    }
}
