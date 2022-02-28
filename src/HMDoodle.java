import acm.graphics.GCanvas;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;

public class HMDoodle extends GCanvas {
    //this makes the stand and the man for the game
    //the stand
    private static final GRect stand = new GRect(100, 25);
    private static final GRect pole = new GRect(20, 75);
    private static final GRect rod = new GRect(50, 65);
    private static final GLine string = new GLine(2, 2, 0, 0);
    //the guy
    private static final GRect body = new GRect(15, 35);
    private static final GOval head = new GOval(20, 20);
    private static final GLine lArm = new GLine(3, 3, 225, 225);
    private static final GLine rArm = new GLine(3, 3, 315, 315);
    private static final GLine lLeg = new GLine(2.5, 2.5,185, 185);
    private static final GLine rLeg = new GLine(2.5, 2.5, 175, 175);

//make a getter for the body and the stand

    public void platform(){
        add(stand,body.getX()-20,body.getY()+body.getY()/2);
        add(rod, stand.getX(), stand.getX()+ rod.getHeight());
        add(pole, rod.getX()+ rod.getWidth(),rod.getY());
        add(string, pole.getX()+pole.getWidth(),pole.getY()+ pole.getHeight());
    }

    public void corpse(){
        add(body,getWidth()/2,getHeight()/3);
        add(head,body.getX()+body.getWidth()/2,body.getY()+ head.getHeight());
        add(lArm, body.getX(),body.getY());
        add(lLeg, body.getX(), body.getY()+body.getHeight());
        add(rArm, body.getX()+ body.getWidth(),body.getY());
        add(rLeg, body.getX()+ body.getWidth(), body.getY()+body.getHeight());
    }

}
