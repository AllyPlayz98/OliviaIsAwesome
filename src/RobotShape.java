import org.jointheleague.graphical.robot.Robot;

public class RobotShape {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		rob.penDown();
		rob.setSpeed(10);
		drawsquare();
	}

	private static void drawsquare() {
		for (int robbie = 0; robbie < 4; robbie++) {
			rob.move(500);
			rob.turn(90);
		}
	}
}
