/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square topL; //Black
    private Square topR; //Yellow
    private Square botL; //Yellow
    private Square botR; //Black
    private Triangle point1;
    private Triangle point2;
    private Circle center;
    private Person man;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        topL = new Square();
        topR = new Square();
        botL = new Square();
        botR = new Square();
        point1 = new Triangle();
        point2 = new Triangle();
        center = new Circle();
        man = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            topL.moveHorizontal(-200);
            topL.moveVertical(-100);
            topL.changeSize(100);
            topL.changeColor("black");
            topL.makeVisible();
            
            topR.moveHorizontal(-100);
            topR.moveVertical(-100);
            topR.changeSize(100);
            topR.changeColor("yellow");
            topR.makeVisible();
            
            botL.moveHorizontal(-200);
            botL.moveVertical(0);
            botL.changeSize(100);
            botL.changeColor("yellow");
            botL.makeVisible();
            
            botR.moveHorizontal(-100);
            botR.moveVertical(0);
            botR.changeSize(100);
            botR.changeColor("black");
            botR.makeVisible();
            
            center.moveHorizontal(-60);
            center.moveVertical(-10);
            center.changeSize(80);
            center.changeColor("blue");
            center.makeVisible();
            
            point1.moveHorizontal(0);
            point1.moveVertical(-120);
            point1.changeSize(80, 20);
            point1.changeColor("blue");
            point1.makeVisible();
            
            point2.moveHorizontal(0);
            point2.moveVertical(80);
            point2.changeSize(-80, 20);
            point2.changeColor("blue");
            point2.makeVisible();
            
            man.moveHorizontal(-70);
            man.moveVertical(-80);
            man.changeSize(40, 30);
            man.changeColor("red");
            man.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        topL.changeColor("black");
        topR.changeColor("black");
        botL.changeColor("black");
        botR.changeColor("black");
        center.changeColor("white");
        point1.changeColor("white");
        point2.changeColor("white");
        man.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        topL.changeColor("black");
        topR.changeColor("yellow");
        botL.changeColor("yellow");
        botR.changeColor("black");
        center.changeColor("blue");
        point1.changeColor("blue");
        point2.changeColor("blue");
        man.changeColor("red");
    }
}
