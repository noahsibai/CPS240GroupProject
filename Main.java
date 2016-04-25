package checkGroup;

import java.awt.Desktop;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * @author Noah Sibai, Logan Greer, Paul Lamine, Bradley Davis, Zachary Casavant
 * @fileName Main.java
 * @version 1.0
 */
public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	// private Desktop desktop = Desktop.getDesktop();
	Pane pane = new Pane();
	Button Logan = null;
	Button restart = null;
	Button Noah = null;
	Button Bradb = null;
	Button Paul = null;
	Button Zack = null;
	Button load = null;
	Button exit = null;
	Button close = new Button("x");
	Button mini = new Button("_");
	static String fileName;
	TextField scoreText = new TextField();
	File zackFile = new File("zackfile.txt");
	File loganFile = new File("loganfile.txt");
	File noahFile = new File("noahfile.txt");
	File bradFile = new File("bradfile.txt");
	File paulFile = new File("paulfile.txt");
	Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
	final FileChooser fileChooser = new FileChooser();
	final Button openButton = new Button("Open a file");
	final Button saveButton = new Button("Save");
	Stage stage = new Stage();
	String treeName;
	Point global;
	Tree p;
	Tree l;
	Tree z;
	Tree n;
	Tree b;
	Tree temp;
	int x;
	int y;
	Text startText = new Text("Please choose a story");

	@Override
	public void start(Stage stage) throws Exception {
		pane.getChildren().clear();
		close.setScaleX(1.5);
		close.setScaleY(1.5);
		close.setLayoutX(primaryScreenBounds.getWidth()-27);
		mini.setScaleX(1.5);
		mini.setScaleY(1.5);
		mini.setLayoutX(primaryScreenBounds.getWidth()-59);
		startText.setStyle("-fx-font-size:50;");
		startText.setLayoutX((primaryScreenBounds.getWidth() / 2)-250);
		startText.setLayoutY((primaryScreenBounds.getHeight() / 2) - 100);
		exit = new Button("Exit");
		exit.setScaleX(3);
		exit.setScaleY(3);
		exit.setLayoutX((primaryScreenBounds.getWidth() / 2));
		exit.setLayoutY((primaryScreenBounds.getHeight() / 2) + 250);
		exit.setStyle("-fx-background-color:white;");
		restart = new Button("Restart");
		restart.setLayoutX((primaryScreenBounds.getWidth() / 2) + 400);
		restart.setLayoutY((primaryScreenBounds.getHeight() / 2) + 250);
		restart.setScaleX(3);
		restart.setScaleY(3);
		restart.setStyle("-fx-background-color:white;");
		Logan = new Button("Story 1");
		Logan.setLayoutX((primaryScreenBounds.getWidth() / 9) + 25);
		Logan.setLayoutY(primaryScreenBounds.getHeight() / 2);
		Logan.setScaleX(3);
		Logan.setScaleY(3);
		Logan.setStyle("-fx-background-color:white;");
		Noah = new Button("Story 2");
		Noah.setLayoutX((primaryScreenBounds.getWidth() / 3.5) + 25);
		Noah.setLayoutY(primaryScreenBounds.getHeight() / 2);
		Noah.setScaleX(3);
		Noah.setScaleY(3);
		Noah.setStyle("-fx-background-color:white;");
		Bradb = new Button("Story 3");
		Bradb.setLayoutX((primaryScreenBounds.getWidth() / 2.25) + 40);
		Bradb.setLayoutY(primaryScreenBounds.getHeight() / 2);
		Bradb.setScaleX(3);
		Bradb.setScaleY(3);
		Bradb.setStyle("-fx-background-color:white;");
		Paul = new Button("Story 4");
		Paul.setLayoutX((primaryScreenBounds.getWidth() / 1.6) + 25);
		Paul.setLayoutY(primaryScreenBounds.getHeight() / 2);
		Paul.setScaleX(3);
		Paul.setScaleY(3);
		Paul.setStyle("-fx-background-color:white;");
		Zack = new Button("Story 5");
		Zack.setLayoutX((primaryScreenBounds.getWidth() - 250));
		Zack.setLayoutY(primaryScreenBounds.getHeight() / 2);
		Zack.setScaleX(3);
		Zack.setScaleY(3);
		Zack.setStyle("-fx-background-color:white;");
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
		close.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
			}
			
		});
		mini.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				stage.setFullScreen(false);
				pane.getChildren().removeAll(mini,close);
			}
			
		});
		saveButton.setLayoutX(primaryScreenBounds.getWidth() - (primaryScreenBounds.getWidth() - 75));
		saveButton.setLayoutY(primaryScreenBounds.getHeight() - (primaryScreenBounds.getHeight() - .1));
		openButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(final ActionEvent e) {
				File file = fileChooser.showOpenDialog(stage);
				if (file != null) {
					openFile(file);
				}
			}
		});
		saveButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(final ActionEvent e) {
				if (treeName.equalsIgnoreCase("logan")) {
					fileName = "story1save.txt";
				} else if (treeName.equalsIgnoreCase("noah")) {
					fileName = "story2save.txt";
				} else if (treeName.equalsIgnoreCase("brad")) {
					fileName = "story3save.txt";
				} else if (treeName.equalsIgnoreCase("paul")) {
					fileName = "story4save.txt";
				} else if (treeName.equalsIgnoreCase("zack")) {
					fileName = "story5save.txt";
				} else {
					return;
				}
				File file = new File(fileName);
				if (file != null) {
					try {
						SaveFile(file, treeName, global);
						Text save = new Text("You saved a file called " + fileName
								+ ",\nit is in the directory where you saved the application.");
						save.setStyle("-fx-font-size:15;");
						save.setLayoutX((primaryScreenBounds.getWidth() / 2) - 675);
						save.setLayoutY((primaryScreenBounds.getHeight() / 2) - 300);
						pane.getChildren().add(save);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		pane.getChildren().addAll(restart, Zack, Paul, Bradb, Noah, Logan, openButton, saveButton, startText,close,mini);
		Scene sc = new Scene(pane, primaryScreenBounds.getWidth(), primaryScreenBounds.getHeight());
		pane.setStyle("-fx-background-color: turquoise;");
		stage.setTitle("Welcome to the Game");
		stage.setFullScreen(true);
		stage.setScene(sc);
		stage.setMaximized(true);
		stage.show();
	}

	class reset implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent arg0) {
			pane.getChildren().clear();
			close.setScaleX(1.5);
			close.setScaleY(1.5);
			close.setLayoutX(primaryScreenBounds.getWidth()-27);
			mini.setScaleX(1.5);
			mini.setScaleY(1.5);
			mini.setLayoutX(primaryScreenBounds.getWidth()-59);
			startText.setStyle("-fx-font-size:50;");
			startText.setLayoutX((primaryScreenBounds.getWidth() / 2)-250);
			startText.setLayoutY((primaryScreenBounds.getHeight() / 2) - 100);
			exit = new Button("Exit");
			exit.setScaleX(3);
			exit.setScaleY(3);
			exit.setStyle("-fx-background-color:white;");
			exit.setLayoutX((primaryScreenBounds.getWidth() / 2));
			exit.setLayoutY((primaryScreenBounds.getHeight() / 2) + 250);
			restart = new Button("Restart");
			restart.setLayoutX((primaryScreenBounds.getWidth() / 2) + 400);
			restart.setLayoutY((primaryScreenBounds.getHeight() / 2) + 250);
			restart.setScaleX(3);
			restart.setScaleY(3);
			restart.setStyle("-fx-background-color:white;");
			Logan = new Button("Story 1");
			Logan.setLayoutX((primaryScreenBounds.getWidth() / 9) + 25);
			Logan.setLayoutY(primaryScreenBounds.getHeight() / 2);
			Logan.setScaleX(3);
			Logan.setScaleY(3);
			Logan.setStyle("-fx-background-color:white;");
			Noah = new Button("Story 2");
			Noah.setLayoutX((primaryScreenBounds.getWidth() / 3.5) + 25);
			Noah.setLayoutY(primaryScreenBounds.getHeight() / 2);
			Noah.setScaleX(3);
			Noah.setScaleY(3);
			Noah.setStyle("-fx-background-color:white;");
			Bradb = new Button("Story 3");
			Bradb.setLayoutX((primaryScreenBounds.getWidth() / 2.25) + 40);
			Bradb.setLayoutY(primaryScreenBounds.getHeight() / 2);
			Bradb.setScaleX(3);
			Bradb.setScaleY(3);
			Bradb.setStyle("-fx-background-color:white;");
			Paul = new Button("Story 4");
			Paul.setLayoutX((primaryScreenBounds.getWidth() / 1.6) + 25);
			Paul.setLayoutY(primaryScreenBounds.getHeight() / 2);
			Paul.setScaleX(3);
			Paul.setScaleY(3);
			Paul.setStyle("-fx-background-color:white;");
			Zack = new Button("Story 5");
			Zack.setLayoutX((primaryScreenBounds.getWidth() - 250));
			Zack.setLayoutY(primaryScreenBounds.getHeight() / 2);
			Zack.setScaleX(3);
			Zack.setScaleY(3);
			Zack.setStyle("-fx-background-color:white;");
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
			pane.getChildren().addAll(restart, Zack, Paul, Bradb, Noah, Logan, openButton, saveButton,startText,close,mini);

		}

	}

	class Logan implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent arg0) {
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack);
			try {
				Tree n = new Tree(loganFile);
				newRoom(n, new Point(0, 0));
			} catch (FileNotFoundException e) {
			}

		}
	}

	class Brad implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack);
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
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack);
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
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack);
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
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack);
			try {
				Tree n = new Tree(noahFile);
				newRoom(n, new Point(0, 0));
			} catch (FileNotFoundException e) {
			}

		}
	}

	class exit implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			System.exit(0);
		}

	}

	private void openFile(File file) {
		try {
			loadFile(file);
		} catch (IOException ex) {
			System.out.println();
			;
		}
	}

	private void loadFile(File f) throws IOException {
		Scanner sc = new Scanner(f);
		String[] check = sc.nextLine().split(",");
		String rootName = check[0];
		int x = Integer.parseInt(check[1]);
		int y = Integer.parseInt(check[2]);
		Tree temp = null;
		if (check[0].equalsIgnoreCase("paul")) {
			try {
				temp = new Tree(paulFile);
				newRoom(temp, new Point(x, y));
			} catch (FileNotFoundException e) {
			}
		} else if (check[0].equalsIgnoreCase("noah")) {
			try {

				temp = new Tree(noahFile);
				newRoom(temp, new Point(x, y));
			} catch (FileNotFoundException e) {
			}
		} else if (check[0].equalsIgnoreCase("logan")) {
			try {

				temp = new Tree(loganFile);
				newRoom(temp, new Point(x, y));
			} catch (FileNotFoundException e) {
			}
		} else if (check[0].equalsIgnoreCase("zack")) {
			try {

				temp = new Tree(zackFile);
				newRoom(temp, new Point(x, y));
			} catch (FileNotFoundException e) {
			}
		} else if (check[0].equalsIgnoreCase("brad")) {
			try {

				temp = new Tree(bradFile);
				newRoom(temp, new Point(x, y));
			} catch (FileNotFoundException e) {
			}
		} else {
			reset reset = new reset();
			reset.handle(null);
		}

	}

	private void SaveFile(File f, String name, Point p) throws IOException {
		PrintWriter pw = new PrintWriter(f);
		pw.print(name);
		pw.print("," + ((int) p.getX()) + "," + ((int) p.getY()) + ",");
		pw.close();
	}

	public void newRoom(Tree tree, Point pos) {
		int x = (int) pos.getX();
		int y = (int) pos.getY();
		Node n = tree.getNode(pos);
		treeName = tree.getName();
		global = pos;
		// Remove everything from the pane
		pane.getChildren().clear();
		pane.getChildren().addAll(restart, openButton, saveButton,close,mini);
		// Creates new "Room" with message and choices
		Text txt = new Text(n.getMessage());
		Button buttR = new Button(n.getButtonR()); // right choice
		Button buttL = new Button(n.getButtonL()); // left Choice

		buttL.setStyle("-fx-background-color: white;");
		buttL.setScaleX(3);
		buttL.setScaleY(3);
		buttL.setLayoutX((primaryScreenBounds.getWidth() / 3) - 100);
		buttL.setLayoutY((primaryScreenBounds.getHeight() / 2));

		buttR.setStyle("-fx-background-color: white;");
		buttR.setScaleX(3);
		buttR.setScaleY(3);
		buttR.setLayoutX((primaryScreenBounds.getWidth() / 1.5) + 75);
		buttR.setLayoutY(primaryScreenBounds.getHeight() / 2);

		txt.setLayoutX(primaryScreenBounds.getWidth() / 3);
		txt.setLayoutY((primaryScreenBounds.getHeight() - primaryScreenBounds.getHeight()) + 30);
		txt.setStyle("-fx-font-size:25;");

		if (n.getButtonL() == null && n.getButtonR() == null) {
			exit ex = new exit();
			exit.setOnAction(ex);
			pane.getChildren().addAll(txt, exit);
		} else {
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

}