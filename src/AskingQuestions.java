import javax.swing.JOptionPane;

public class AskingQuestions {
public static void main(String[] args) {
	String Q1 = JOptionPane.showInputDialog("What is your name?");
	String Q2 = JOptionPane.showInputDialog("What is your favorite element on the peridoc table?");
	String Q3 = JOptionPane.showInputDialog("What is your favorite character in the fellowship?");
	JOptionPane.showMessageDialog(null, Q1 + " likes the element " + Q2 + " and likes the character " + Q3 + " in the Fellowship.");
}
}
