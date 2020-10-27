
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square foreground;
    private Square wall2;
    private Triangle roof2;
    private Square door;
    private Square background;
    private Triangle trunk;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        background = new Square();
        background.changeColor("cyan");
        background.moveHorizontal(-100);
        background.moveVertical(-100);
        background.changeSize(500);
        background.makeVisible();
        
        foreground = new Square();
        foreground.changeSize(350);
        foreground.moveVertical(150);
        foreground.moveHorizontal(-75);
        foreground.changeColor("green");
        foreground.makeVisible();
        
        wall = new Square();
        wall.moveVertical(40);
        wall.changeSize(150);
        wall.changeColor("blue");
        wall.makeVisible();
        
        wall2 = new Square();
        wall2.moveHorizontal(90);
        wall2.moveVertical(-10);
        wall2.changeSize(60);
        wall2.changeColor("blue");
        wall2.makeVisible();

        window = new Square();
        window.changeColor("cyan");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();
        
        door = new Square();
        door.changeColor("darkGray");
        door.moveHorizontal(60);
        door.moveVertical(140);
        door.changeSize(50);
        door.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(35);
        roof.changeColor("magenta");
        roof.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeSize(40, 100);
        roof2.moveHorizontal(130);
        roof2.moveVertical(-10);
        roof2.changeColor("magenta");
        roof2.makeVisible();
        
        trunk = new Triangle();
        trunk.moveHorizontal(200);
        trunk.moveVertical(70);
        trunk.changeSize(150, 45);
        trunk.changeColor("darkGray");
        trunk.makeVisible();

        sun = new Circle();
        sun.changeColor("green");
        sun.moveHorizontal(200);
        sun.moveVertical(20);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
