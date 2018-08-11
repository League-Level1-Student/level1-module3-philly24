import javax.swing.JFrame;

public class TypingTutor {
JFrame frame;
char currentLetter;

currentLetter = generateRandomLetter();

char generateRandomLetter() {
      Random r = new Random();
      return (char) (r.nextInt(26) + 'a');
}
void userinter() {
	frame.setTitle("Type or Die");
	frame.setVisible(true);
	frame.pack();

}
}
