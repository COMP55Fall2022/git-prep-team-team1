//xt
//tx
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	public static String ROBOT_IMAGE = "robot.png";
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage(, 200, 200);
		add(robot);

<<<<<<< HEAD
		GLabel label = new GLabel("Tanxuan did it", 200, 400);
=======
		GLabel label = new GLabel("No screw you mine's better", 200, 400);
>>>>>>> branch 'main' of https://github.com/COMP55Fall2022/git-prep-team-team1.git
		add(label);
	}	
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}