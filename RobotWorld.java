import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author Diego Prado
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        super(800, 600, 1); 
        
        prepareScenario();

    }
    public void prepareScenario()
    {
        int[][] array={{52, 147}, {159, 147}, {266, 147}, {587, 147}, {692, 147}, {791, 147}};

        addObject(new Robot(),48,50);
        for(int i=0;i<array.length;i++)
        {
           addObject(new Wall(),array[i][0],array[i][1]);
        }
        
        addObject(new Block(),427,147);
        addObject(new Scorepanel(),71,554);
        addObject(new Home(),751,552);

        
        int[][] array2={{720, 46}, {433, 38}, {183, 302}, {682, 312}, {417, 537}};
        for(int i=0;i<array2.length;i++)
        {
           addObject(new Pizza(),array2[i][0],array2[i][1]);
        }
    }
}
