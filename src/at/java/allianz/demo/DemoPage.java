package at.java.allianz.demo;
import javax.swing.JOptionPane;

public class DemoPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = JOptionPane.showConfirmDialog(null, "are you ready", "ask",2);
		System.out.println(answer);
		int x = 4711;
		// nochmalls ein Blödsinn
		float f = 234.3f;
		System.out.println("text..." + x + f);
		//This is a new line
	}

}
