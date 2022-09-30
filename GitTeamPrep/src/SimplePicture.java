// hackslash not push
// hackslash pushing
// just another commment
//testing
//xt
//tx
//1stCommit
//secondCommit
//hack first commit
//hack commit 2
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
		//mart
		GImage robot = new GImage(X, X);
		add(robot);
		GLabel label = new GLabel("Proc.", 200, 400);

		add(label);
	}	
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}// n
	//comment
}