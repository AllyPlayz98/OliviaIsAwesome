import org.jointheleague.graphical.robot.Robot;

public class RobotStar {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		rob.penDown();
		rob.setSpeed(10);
		for (int a = 0; a < 5; a++) {
			turn(360/5);
			move(100);
		}
	}

	private static void turn(int i) {
		rob.turn(i);
		// TODO Auto-generated method stub

	}

	private static void move(int i) {
		rob.move(i);
		// TODO Auto-generated method stub

	}

}
