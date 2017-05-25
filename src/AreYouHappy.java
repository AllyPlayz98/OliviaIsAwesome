import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String ary = JOptionPane.showInputDialog("Are you happy?");

		if (ary.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		} else if (ary.equals("no")) {
			String arx = JOptionPane.showInputDialog("Do you want to be happy?");
			if (arx.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			} else {
JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}

		else {
			JOptionPane.showMessageDialog(null, "Error: Please type 'yes' or 'no'");
		}
	}
}
