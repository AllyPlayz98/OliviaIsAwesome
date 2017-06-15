import javax.swing.JOptionPane;

public class YearIWasBorn {
public static void main(String[] args) {
	String i = JOptionPane.showInputDialog("What is your age at the end of the year?");
	int age = Integer.parseInt(i);
	int j = 2017-age;
	System.out.println("You were born in "  + j);
}
}
