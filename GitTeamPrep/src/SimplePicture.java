// hackslash not push
// hackslash pushing
// just another commment
/xt
//tx
//1stCommit
//secondCommit
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	public static String ROBOT_IMAGE = "robot.png";
	int X = 200;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		
		GImage robot = new GImage(, X, X);
		add(robot);


		GLabel label = new GLabel("Martyr changed for first step.", 200, 400);
		add(label);
	}	
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}