import javax.swing.JOptionPane;

public class GuessingGame {
	public static void main(String[] args) {
		for (int w = 0; w < 10; w++) {
			String s = JOptionPane.showInputDialog("Person 1, pick a number between 0 and 10.");
			String t = JOptionPane.showInputDialog("Person 2, pick a number between 0 and 10.");
			if (s.equals(t)) {
				JOptionPane.showMessageDialog(null, "You Win!");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "You Lose!");
			}
		}
	}
}
