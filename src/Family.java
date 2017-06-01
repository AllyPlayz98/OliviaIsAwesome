import javax.swing.JOptionPane;

public class Family {
public static void main(String[] args) {
	for (int c = 0; c<3; c++){
	String a = JOptionPane.showInputDialog("Are you part of my family?");
	
	if (a.equals("yes")) {
		String b = JOptionPane.showInputDialog("Are you my parent?");
		
		if (b.equals("yes")) {
			JOptionPane.showMessageDialog(null, "You are welcome in my room!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You are not welcome in my room!");
		}
	}
	else if (a.equals("no")) {
		JOptionPane.showMessageDialog(null, "Leave me and my family alone!");
	}
	}
}
}
