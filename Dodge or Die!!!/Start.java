import greenfoot.*;

public class Start extends World
{
    public Start()
    {    
        super(748, 826, 1); 
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MyWorld());
        }
        
        //Score.score = 0;
    }
}