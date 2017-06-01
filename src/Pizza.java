import javax.swing.JOptionPane;

public class Pizza {
public static void main(String[] args) {
	for (int m = 0; m<3; m++){
	String k = JOptionPane.showInputDialog("Do you like pizza?");
	
	if (k.equals("yes")) {
		String l = JOptionPane.showInputDialog("Do you like pepperoni pizza?");
		
		if (l.equals("yes")){
			JOptionPane.showMessageDialog(null, "Enjoy your pepperoni pizza!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Enjoy your cheese pizza!");
		}
	}
	else if (k.equals("no")) {
		JOptionPane.showMessageDialog(null, "You will be hungry.");
	}
	}
 
}
}
