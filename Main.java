package checkGroup;

import java.awt.Point;
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
 * @author Noah Sibai, Logan Greer, Paul Lamine, Bradley Davis, Zachary C.
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
	File zackFile = new File("zack.txt");
	File loganFile = new File("loganfile.txt");
	File noahFile = new File("noahfile.txt");
	File bradFile = new File("bradfile.txt");
	File paulFile = new File("paulfile.txt");
	int count = 0;
	Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

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
		}

	}

	class Logan implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent arg0) {
			count = 0;
			filename = "Story1Score.txt";
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack, startText);
			try {
				Tree n = new Tree(noahFile);
				newRoom(n, new Point(0, 0));
			} catch (FileNotFoundException e) {
			}

		}
	}

	class Brad implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			count = 0;
			filename = "Story3Score.txt";
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack, startText);
			try {
				Tree n = new Tree(bradFile);
				newRoom(n, new Point(0, 0));
			} catch (FileNotFoundException e) {
			}
		}

	}

	class Paul implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			count = 0;
			filename = "Story4Score.txt";
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack, startText);
			try {
				Tree n = new Tree(paulFile);
				newRoom(n, new Point(0, 0));
			} catch (FileNotFoundException e) {
			}
		}

	}

	class Zack implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			count = 0;
			filename = "Story5Score.txt";
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack, startText);
			try {
				Tree z = new Tree(zackFile);
				newRoom(z, new Point(0, 0));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}

	}

	class Noah implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			count = 0;
			filename = "Story5Score.txt";
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack, startText);
			try {
				Tree n = new Tree(noahFile);
				newRoom(n, new Point(0, 0));
			} catch (FileNotFoundException e) {
			}

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

	public void newRoom(Tree tree, Point pos) {
		int x = (int) pos.getX();
		int y = (int) pos.getY();
		Node n = tree.getNode(pos);
		// Remove everything from the pane
		pane.getChildren().clear();
		pane.getChildren().add(restart);
		// Creates new "Room" with message and choices
		Text txt = new Text(n.getMessage());
		Button buttR = new Button(n.getButtonR()); // right choice
		Button buttL = new Button(n.getButtonL()); // left Choice

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

		if (n.getButtonL() == null && n.getButtonR() == null) {
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
			if (n.getButtonL() == null) {
				pane.getChildren().remove(buttL);
			}
			if (n.getButtonR() == null) {
				pane.getChildren().remove(buttR);
			}
		}

		buttR.setOnAction((ActionEvent e1) -> {
			// Go Right
			Node r = tree.getNode(new Point(x + 1, (2 * y) + 1));
			newRoom(tree, r.getPos());
		});

		buttL.setOnAction((ActionEvent e2) -> {
			// Go Left
			Node l = tree.getNode(new Point(x + 1, (2 * y)));
			newRoom(tree, l.getPos());
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