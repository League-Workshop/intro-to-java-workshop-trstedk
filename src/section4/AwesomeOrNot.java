package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"


Random randgen= new Random();
int x= randgen.nextInt(100);
	// 3. Print out this variable
System.out.println(x);
	// 4. Get the user to enter something that they think is awesome
String response=JOptionPane.showInputDialog(null,"What is Awesome?");
	// 5. If the random number is 0
if(x==0) {
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer

}
}
}
