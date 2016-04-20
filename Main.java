package groupProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * @author Noah Sibai
 * @fileName Main.java
 * @version 1.0
 */
public class Main extends Application {
	public static void main(String[] args) {
		launch(args);

	}

	Pane pane = new Pane();
	Button Logan = null;
	Text startText = null;
	Button restart = null;
	Button Noah = null;
	Button Bradb = null;
	Button Paul = null;
	Button Zack = null;
	String name = null;
	static String filename = null;
	Button exit = null;
	TextField scoreText = new TextField();
	int count = 0;
	Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
	MenuBar bar = new MenuBar();

	@Override
	public void start(Stage stage) throws Exception {
		Text namePrompt = new Text("Please enter your initials");
		namePrompt.setLayoutX((primaryScreenBounds.getWidth() / 2) - 90);
		namePrompt.setLayoutY((primaryScreenBounds.getWidth() / 2) - 275);
		scoreText.setLayoutX((primaryScreenBounds.getWidth() / 2) - 100);
		scoreText.setLayoutY((primaryScreenBounds.getWidth() / 2) - 250);
		Button enterName = new Button("Enter");
		enterName.setLayoutX((primaryScreenBounds.getWidth() / 2) - 50);
		enterName.setLayoutY((primaryScreenBounds.getWidth() / 2) - 150);
		enterName.setScaleX(3);
		enterName.setScaleY(3);
		pane.getChildren().addAll(namePrompt, scoreText, enterName);
		enterName.setOnAction((ActionEvent e) -> {
			name = scoreText.getText();
			pane.getChildren().clear();
			exit = new Button("Exit");
			exit.setScaleX(3);
			exit.setScaleY(3);
			exit.setLayoutX((primaryScreenBounds.getWidth() / 2));
			exit.setLayoutY((primaryScreenBounds.getHeight() / 2) + 250);
			startText = new Text("Please Choose a Story Line");
			startText.setStyle("-fx-font-size:50;");
			startText.setLayoutX((primaryScreenBounds.getWidth() / 2) - 300);
			startText.setLayoutY(250);
			restart = new Button("Restart");
			restart.setLayoutX((primaryScreenBounds.getWidth() / 2) + 400);
			restart.setLayoutY((primaryScreenBounds.getHeight() / 2) + 250);
			restart.setScaleX(3);
			restart.setScaleY(3);
			Logan = new Button("Story 1");
			Logan.setLayoutX((primaryScreenBounds.getWidth() / 9) + 25);
			Logan.setLayoutY(primaryScreenBounds.getHeight() / 2);
			Logan.setScaleX(3);
			Logan.setScaleY(3);
			Noah = new Button("Story 2");
			Noah.setLayoutX((primaryScreenBounds.getWidth() / 3.5) + 25);
			Noah.setLayoutY(primaryScreenBounds.getHeight() / 2);
			Noah.setScaleX(3);
			Noah.setScaleY(3);
			Bradb = new Button("Story 3");
			Bradb.setLayoutX((primaryScreenBounds.getWidth() / 2.25) + 40);
			Bradb.setLayoutY(primaryScreenBounds.getHeight() / 2);
			Bradb.setScaleX(3);
			Bradb.setScaleY(3);
			Paul = new Button("Story 4");
			Paul.setLayoutX((primaryScreenBounds.getWidth() / 1.6) + 25);
			Paul.setLayoutY(primaryScreenBounds.getHeight() / 2);
			Paul.setScaleX(3);
			Paul.setScaleY(3);
			Zack = new Button("Story 5");
			Zack.setLayoutX((primaryScreenBounds.getWidth() - 250));
			Zack.setLayoutY(primaryScreenBounds.getHeight() / 2);
			Zack.setScaleX(3);
			Zack.setScaleY(3);
			Logan logan = new Logan();
			Logan.setOnAction(logan);
			Noah noah = new Noah();
			Noah.setOnAction(noah);
			Brad brad = new Brad();
			Bradb.setOnAction(brad);
			Paul paul = new Paul();
			Paul.setOnAction(paul);
			Zack zack = new Zack();
			Zack.setOnAction(zack);
			reset reset = new reset();
			restart.setOnAction(reset);
			pane.getChildren().addAll(restart, startText, Zack, Paul, Bradb, Noah, Logan);
		});
		Scene sc = new Scene(pane, primaryScreenBounds.getWidth(), primaryScreenBounds.getHeight());
		stage.setTitle("Welcome to the Game");
		stage.setScene(sc);
		stage.setMaximized(true);
		stage.show();
	}

	class reset implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent arg0) {
			pane.getChildren().clear();
			Text namePrompt = new Text("Please enter your initials");
			namePrompt.setLayoutX((primaryScreenBounds.getWidth() / 2) - 90);
			namePrompt.setLayoutY((primaryScreenBounds.getWidth() / 2) - 275);
			scoreText.setLayoutX((primaryScreenBounds.getWidth() / 2) - 100);
			scoreText.setLayoutY((primaryScreenBounds.getWidth() / 2) - 250);
			Button enterName = new Button("Enter");
			enterName.setLayoutX((primaryScreenBounds.getWidth() / 2) - 50);
			enterName.setLayoutY((primaryScreenBounds.getWidth() / 2) - 150);
			enterName.setScaleX(3);
			enterName.setScaleY(3);
			pane.getChildren().addAll(namePrompt, scoreText, enterName);
			enterName.setOnAction((ActionEvent e) -> {
				name = scoreText.getText();
				pane.getChildren().clear();
				exit = new Button("Exit");
				exit.setScaleX(3);
				exit.setScaleY(3);
				exit.setLayoutX((primaryScreenBounds.getWidth() / 2));
				exit.setLayoutY((primaryScreenBounds.getHeight() / 2) + 250);
				startText = new Text("Please Choose a Story Line");
				startText.setStyle("-fx-font-size:50;");
				startText.setLayoutX((primaryScreenBounds.getWidth() / 2) - 300);
				startText.setLayoutY(250);
				restart = new Button("Restart");
				restart.setLayoutX((primaryScreenBounds.getWidth() / 2) + 400);
				restart.setLayoutY((primaryScreenBounds.getHeight() / 2) + 250);
				restart.setScaleX(3);
				restart.setScaleY(3);
				Logan = new Button("Story 1");
				Logan.setLayoutX((primaryScreenBounds.getWidth() / 9) + 25);
				Logan.setLayoutY(primaryScreenBounds.getHeight() / 2);
				Logan.setScaleX(3);
				Logan.setScaleY(3);
				Noah = new Button("Story 2");
				Noah.setLayoutX((primaryScreenBounds.getWidth() / 3.5) + 25);
				Noah.setLayoutY(primaryScreenBounds.getHeight() / 2);
				Noah.setScaleX(3);
				Noah.setScaleY(3);
				Bradb = new Button("Story 3");
				Bradb.setLayoutX((primaryScreenBounds.getWidth() / 2.25) + 40);
				Bradb.setLayoutY(primaryScreenBounds.getHeight() / 2);
				Bradb.setScaleX(3);
				Bradb.setScaleY(3);
				Paul = new Button("Story 4");
				Paul.setLayoutX((primaryScreenBounds.getWidth() / 1.6) + 25);
				Paul.setLayoutY(primaryScreenBounds.getHeight() / 2);
				Paul.setScaleX(3);
				Paul.setScaleY(3);
				Zack = new Button("Story 5");
				Zack.setLayoutX((primaryScreenBounds.getWidth() - 250));
				Zack.setLayoutY(primaryScreenBounds.getHeight() / 2);
				Zack.setScaleX(3);
				Zack.setScaleY(3);
				Logan logan = new Logan();
				Logan.setOnAction(logan);
				Noah noah = new Noah();
				Noah.setOnAction(noah);
				Brad brad = new Brad();
				Bradb.setOnAction(brad);
				Paul paul = new Paul();
				Paul.setOnAction(paul);
				Zack zack = new Zack();
				Zack.setOnAction(zack);
				reset reset = new reset();
				restart.setOnAction(reset);
				pane.getChildren().addAll(restart, startText, Zack, Paul, Bradb, Noah, Logan);
			});
			Scene sc = new Scene(pane, primaryScreenBounds.getWidth(), primaryScreenBounds.getHeight());
		}

	}

	class Logan implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent arg0) {
		}
	}

	class Brad implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			count = 0;
			filename = "Story3Score.txt";
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack, startText);
		}

	}

	class Paul implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			count = 0;
			filename = "Story4Score.txt";
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack, startText);
		}

	}

	class Zack implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			count = 0;
			filename = "Story5Score.txt";
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack, startText);
		}

	}

	class Noah implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			count = 0;
			filename = "Story2Score.txt";
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack, startText);
			Tree n = new Tree("You have a choice to chose your dream job. \nRace Car Driver or Airplan Pilot", "Race",
					"Pilot", "");
			// left branch
			n.add("You're a race car driver now. Quick!\nIt's during a race and a car in front of you started flipping.\nDo you swerve left or right?",
					"Left", "Right", "l");
			n.add("The Car lands on top of you, \nand you die instantly", null, null, "ll");
			n.add("You barely make it out of the wreck.\nHowever your car is extremely damaged. There is 5 laps left!\nDo you stop and fix your car or try to finish the race as is?",
					"Fix", "Continue", "lr");
			n.add("You are just about to cross the finish line\nand win, but your car stops because it ran\nout of oil, and your car blows up killing you",
					null, null, "lrr");
			n.add("You stop and get your car fixed,\nluckly for you so did everyone else. \nSo you make it out first and finish the face in first place.\nWhere do you go disney world or home with your family",
					"Home", "Disney", "lrl");
			n.add("You and your family are heading to Disney.\nOn the way there, you see a sign for a free\nfestival with your favorite band,\nbut you are limited on time. Do you stop for the\nfestival or keep going?",
					"Festival", "Keep Going", "lrlr");
			n.add("Your favorite band plays for hours\nand you love every minute of it,\nbut you are so happy that you die\nfrom a heart attack.",
					null, null, "lrlrl");
			n.add("You make it to Disney and find out your\nmom is in the hospital back home.\nDo you leave immediately or stay for\none day and enjoy Disney?",
					"Leave", "Stay", "lrlrr");
			n.add("You go home with your family.\nIt is a peaceful night, and you are getting ready for bed.\nYou get a phone call do you answer or not?",
					"Answer", "No", "lrll");
			n.add("The call was one of those annoying things on the internet\nwhere if you don't like and share a ghost will come and haunt you,\nbut this one was true and because you did not answer\na ghost haunted you at night and killed you and your family",
					null, null, "lrllr");
			n.add("You answer the phone and it is your best friend.\nHe wants you to come hangout with him for the night\nand celebrate tour win.What do you do?",
					"Go", "Stay", "lrlll");

			// right branch
			n.add("On your first flight ever and you hit some really hard turbulence.\nWhat are you going to do? Try and land the plane or do you continue to fly?",
					"Land", "Fly", "r");
			n.add("You keep flying and you make it out of the storm,\nbut you are informed that there is a bomb on board.\nWhat do you do alert the passangers\nor have the Air Marshal look for the bomb",
					"Alert", "Air Marshall", "rr");
			n.add("The air marshal pretends he is going to the bathroom\nand looks for anyone being suspicious,\nhe see's a man and find the bomb.\nIt is deconstructed and everyone lives.\nBut now you are low on gas. What do you do try and land in the ocean\nor in the middle of the forest?",
					"Ocean", "Forest", "rrr");

			// Original call
			newRoom("You have a choice to chose your dream job. \nRace Car Driver or Airplan Pilot", "Race", "Pilot", n,
					"");

		}

	}

	public void score() throws FileNotFoundException {
		name = scoreText.getText();
		scoreSheet(count, name, filename);
	}

	class exit implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			System.exit(0);
		}

	}

	public void newRoom(String message, String buttonL, String buttonR, Tree tree, String pos) {

		Node n = tree.get(pos);
		// Remove everything from the pane
		pane.getChildren().clear();
		pane.getChildren().add(restart);
		// Creates new "Room" with message and choices
		Text txt = new Text(message);
		Button buttR = new Button(buttonR); // right choice
		Button buttL = new Button(buttonL); // left Choice

		buttL.setScaleX(3);
		buttL.setScaleY(3);
		buttL.setLayoutX((primaryScreenBounds.getWidth() / 3) - 100);
		buttL.setLayoutY((primaryScreenBounds.getHeight() / 2));

		buttR.setScaleX(3);
		buttR.setScaleY(3);
		buttR.setLayoutX((primaryScreenBounds.getWidth() / 1.5) + 75);
		buttR.setLayoutY(primaryScreenBounds.getHeight() / 2);

		txt.setLayoutX(primaryScreenBounds.getWidth() / 3);
		txt.setLayoutY((primaryScreenBounds.getHeight() - primaryScreenBounds.getHeight()) + 30);
		txt.setStyle("-fx-font-size:25;");

		if (buttonL == null && buttonR == null) {
			count = count - 1;
			try {
				score();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			exit ex = new exit();
			exit.setOnAction(ex);
			pane.getChildren().addAll(txt, exit);
		} else {
			count++;
			pane.getChildren().addAll(txt, buttR, buttL);
		}

		buttR.setOnAction((ActionEvent e1) -> {
			// Go Right
			Node r = tree.get(pos + 'r');
			newRoom(r.message, r.choiceR, r.choiceL, tree, r.pos);
		});

		buttL.setOnAction((ActionEvent e2) -> {
			// Go Left
			Node l = tree.get(pos + 'l');
			newRoom(l.message, l.choiceR, l.choiceL, tree, l.pos);
		});

	}

	public void scoreSheet(int count, String name, String filename) throws FileNotFoundException {
		// Add on exit
		// Fix so when they don't put intitals it doesn't add

		File fileName = new File(filename);

		try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, true));) {

			pw.write(name + ", " + count + "\n");

		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
