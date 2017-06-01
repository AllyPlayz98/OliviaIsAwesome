import javax.swing.JOptionPane;

public class Compliments {
	public static void main(String[] args) {
		for (int j = 0; j < 5; j++) {
			String i = JOptionPane.showInputDialog("Name a person in your life.");

			if (i.equals("Anya")) {
				JOptionPane.showMessageDialog(null,
						"You are very good at basketball and have shown a real determination to get better at it.");
			} else if (i.equals("Grace")) {
				JOptionPane.showMessageDialog(null, "You are very good at dance and I admire your talent for it.");
			} else if (i.equals("Sonny")) {
				JOptionPane.showMessageDialog(null,
						"You are very good at baseball and I think that you might be the best player on your team.");
			} else if (i.equals("Josh")) {
				JOptionPane.showMessageDialog(null,
						"You are very kind and always are kind to people who are feeling down.");
			} else {
				JOptionPane.showMessageDialog(null, "Error: please type the names 'Anya, Grace, Sonny, or Josh.'");
			}
		}
	}
}
