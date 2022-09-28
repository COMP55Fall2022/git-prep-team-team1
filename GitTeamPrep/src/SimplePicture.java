//xt
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
		GLabel label = new GLabel("How I feel when using github hackslash", 200, 400);
		add(label);
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}