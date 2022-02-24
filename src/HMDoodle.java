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
    private static final GOval head = new GOval(18, 18);
    private static final GLine lArm = new GLine(3, 3, 0, 0);
    private static final GLine rArm = new GLine(3, 3, 0, 0);
    private static final GLine lLeg = new GLine(2.5, 2.5, 0, 0);
    private static final GLine rLeg = new GLine(2.5, 2.5, 0, 0);

}
