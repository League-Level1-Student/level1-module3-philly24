import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {
	JButton button;
	JFrame frame;
	JPanel panel;
	JTextField text;
	JLabel label;
	public void gui() {
		frame = new JFrame();
		frame.setVisible(true);
		label = new JLabel();
		label.setVisible(true);
		panel = new JPanel();
		text = new JTextField();
		button = new JButton();
		frame.setTitle("The Amazing Tweet Retriever ");
		button.setText("Search the Twitterverse");
		button.addActionListener(this);
		Dimension size1 = new Dimension(200,20);
		text.setPreferredSize(size1);
		panel.add(button);
		panel.add(text);
		panel.add(label);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
		if (buttonPressed==e.getSource()) {
		System.out.println("Tweet Tweet");
		 label.setText(getLatestTweet(text.getText()));
		 System.out.println(getLatestTweet(text.getText()));
		}
	}


private String getLatestTweet(String searchingFor) {

    Twitter twitter = new TwitterFactory().getInstance();

    AccessToken accessToken = new AccessToken(
          "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
          "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
          "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

    twitter.setOAuthAccessToken(accessToken);

    Query query = new Query(searchingFor);
    try {
          QueryResult result = twitter.search(query);
          return result.getTweets().get(0).getText();
    } catch (Exception e) {
          System.err.print(e.getMessage());
          return "What the heck is that?";
    }
}
public static void main(String[] args) {
	GetLatestTweet run = new GetLatestTweet();
	run.gui();
	
}
}
