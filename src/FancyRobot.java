import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class FancyRobot {
	public static void main(String[] args) {
		Robot Josh = new Robot();
		Josh.hide();
		Josh.setSpeed(10);
		Josh.penDown();
		for (int j = 0; 500 > j; j++) {
			Josh.setPenColor(Color.white);
			//draw 1 square at a time.
			int x = new Random().nextInt(1000);
			int y = new Random().nextInt(1000);
			int length = new Random().nextInt(300);
			Josh.setX(x);
			Josh.setY(y);
			for (int o = 0; o < 5; o++) {
				Josh.move(length);
				Josh.turn(144);
			}

		}
	}
}
