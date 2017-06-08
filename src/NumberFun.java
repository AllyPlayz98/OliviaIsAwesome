import javax.swing.JOptionPane;

public class NumberFun {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("Type in a number in the space below.");
	int aint = Integer.parseInt(a);
	String b = JOptionPane.showInputDialog("Type another number in the space below.");
	int bint = Integer.parseInt(b);
	String c = JOptionPane.showInputDialog("Type one more number in the space below");
	int cint = Integer.parseInt(c);
	double d = aint + bint + cint;
	d+=5;
	d/=7;
	
	if (d>15) {
		System.out.println(d+" Your number is big.");
	}
	else if (d<15) {
		System.out.println(d+" Your number is small.");
	}
	else {
		System.out.println(d+" Your number is medium.");
	}
}
}
