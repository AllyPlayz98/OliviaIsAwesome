import java.util.Random;

public class RandomPractice {
public static void main(String[] args) {
	Random rob = new Random();
	for (int a = 0; a<10; a++){
	int x = rob.nextInt(6);
	System.out.print(x+" ");
	}
}
}
