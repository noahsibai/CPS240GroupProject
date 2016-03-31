package groupProject;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
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
	int count = 0;

	@Override
	public void start(Stage stage) throws Exception {
		startText = new Text("Please Choose a Story Line");
		startText.setStyle("-fx-font-size:50;");
		startText.setLayoutX(380);
		startText.setLayoutY(250);
		restart = new Button("Restart");
		restart.setLayoutX(650);
		restart.setLayoutY(600);
		restart.setScaleX(3);
		restart.setScaleY(3);
		Logan = new Button("Story 1");
		Logan.setLayoutX(150);
		Logan.setLayoutY(300);
		Logan.setScaleX(3);
		Logan.setScaleY(3);
		Noah = new Button("Story 2");
		Noah.setLayoutX(400);
		Noah.setLayoutY(300);
		Noah.setScaleX(3);
		Noah.setScaleY(3);
		Bradb = new Button("Story 3");
		Bradb.setLayoutX(650);
		Bradb.setLayoutY(300);
		Bradb.setScaleX(3);
		Bradb.setScaleY(3);
		Paul = new Button("Paul: Story 4");
		Paul.setLayoutX(900);
		Paul.setLayoutY(300);
		Paul.setScaleX(3);
		Paul.setScaleY(3);
		Zack = new Button("Story 5");
		Zack.setLayoutX(1150);
		Zack.setLayoutY(300);
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

		pane.getChildren().addAll(restart, startText, Zack, Paul, Bradb, Noah, Logan);
		Scene sc = new Scene(pane, 400, 400);
		stage.setTitle("Welcome to the Game");
		stage.setScene(sc);
		stage.setMaximized(true);
		stage.show();
	}

	public void newRoom(String message, String button1, String button2 ){
//		Remove everything from the pane
		pane.getChildren().clear();

//		Creates new "Room" with message and choices

		Text txt = new Text(message);
		Button butt1 = new Button(button1);
		Button butt2 = new Button(button2);

		butt1.setScaleX(3);
		butt1.setScaleY(3);
		butt1.setLayoutX(250);
		butt1.setLayoutY(300);

		butt2.setScaleX(3);
		butt2.setScaleY(3);
		butt2.setLayoutX(1000);
		butt2.setLayoutY(300);

		txt.setLayoutX(400);
		txt.setLayoutY(200);
		txt.setStyle("-fx-font-size:25;");

		pane.getChildren().addAll(txt,butt1, butt2);

//	FIXME:	Add Tree data structure (Probably in separate class)
//	FIXME:  Add way to traverse node's on call of function

		butt1.setOnAction((ActionEvent e2) ->{
			newRoom("You find some poison", "Kill MOM", "Kill Bear");
//			tree.goToLeftChild (Somehow Move to the left node)
//	FIXME:		newRoom(tree.node.message, tree.node.choice1, tree.node.choice2);
		});

		butt2.setOnAction((ActionEvent e2) ->{
			newRoom("You find some dogs", "Eat nuts", "KILL");
//	FIXME:		newRoom(tree.node.message, tree.node.choice1, tree.node.choice2);

		});

	}

	public void scoreSheet(int count, String name, String filename) {
		// Add on exit
		File fileName = new File(filename);
		try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, true));) {
			pw.write(name + ", " + count + "\n");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	class Logan implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			String filename = "Story1Score.txt";
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack, startText);
			Text westText = new Text(
					"Travel to the West, heading to the unknow lands.\n" + "Keep going or turn around");
			westText.setLayoutX(400);
			westText.setLayoutY(200);
			westText.setStyle("-fx-font-size:25;");
			Button headBack = new Button("Head Back");
			Button keepGoing = new Button("Keep Going");
			headBack.setScaleX(3);
			headBack.setScaleY(3);
			headBack.setLayoutX(250);
			headBack.setLayoutY(300);
			keepGoing.setScaleX(3);
			keepGoing.setScaleY(3);
			keepGoing.setLayoutX(1000);
			keepGoing.setLayoutY(300);
			Text headBackText = new Text("The gates to town have closed. There's no going back now!");
			headBackText.setLayoutX(400);
			headBackText.setLayoutY(200);
			headBackText.setStyle("-fx-font-size:25;");
			headBack.setOnAction((ActionEvent e2) -> {
				pane.getChildren().removeAll(headBack, westText);
				pane.getChildren().add(headBackText);

			});
			keepGoing.setOnAction((ActionEvent e2) -> {
				pane.getChildren().removeAll(headBack, keepGoing, westText, headBackText);
				Text keepGoingText = new Text("The clouds suddenly get dark,"
						+ "\ncovering the sun and setting an\neerie darkness over the land"
						+ "\nIt looks like it's going to start raining\nDo you head to the woods that are in sight\n"
						+ "or continue along the road to the right\nto search for another town?");
				keepGoingText.setLayoutX(425);
				keepGoingText.setLayoutY(50);
				keepGoingText.setStyle("-fx-font-size:25;");
				Button woods = new Button("Woods");
				Button town = new Button("Town");
				woods.setScaleX(3);
				woods.setScaleY(3);
				woods.setLayoutX(250);
				woods.setLayoutY(300);
				town.setScaleX(3);
				town.setScaleY(3);
				town.setLayoutX(1000);
				town.setLayoutY(300);
				woods.setOnAction((ActionEvent e3) -> {
					pane.getChildren().removeAll(town, woods, keepGoingText);
					Text woodsText = new Text("The woods provide coverage from the rain,"
							+ "\nbut who knows what is in these woods." + "\nIt's dark and eerie, the wind is blowing."
							+ "\nYou have a flashlight in your backpack.\nDo you want to use it?");
					woodsText.setLayoutX(425);
					woodsText.setLayoutY(50);
					woodsText.setStyle("-fx-font-size:25;");
					Button yes = new Button("Yes");
					Button no = new Button("No");
					yes.setScaleX(3);
					yes.setScaleY(3);
					yes.setLayoutX(250);
					yes.setLayoutY(300);
					no.setScaleX(3);
					no.setScaleY(3);
					no.setLayoutX(1000);
					no.setLayoutY(300);
					pane.getChildren().addAll(woodsText, yes, no);
				});
				town.setOnAction((ActionEvent e3) -> {
					pane.getChildren().removeAll(town, woods, keepGoingText);
					Text townText = new Text("As you travel the rain begins to "
							+ "\ncome down harder.  Soaked and covered in wet clothes, you "
							+ "\napproach a town, but it looks abandoned...");
					townText.setLayoutX(425);
					townText.setLayoutY(50);
					townText.setStyle("-fx-font-size:25;");
					Button next1 = new Button("Next");
					next1.setScaleX(3);
					next1.setScaleY(3);
					next1.setLayoutX(1000);
					next1.setLayoutY(300);
					pane.getChildren().addAll(townText, next1);

					next1.setOnAction((ActionEvent e4) -> {
						pane.getChildren().removeAll(next1, townText);
						Text building = new Text("At the front of the town is the large "
								+ "\ntown hall building.  The writing on the wall says 'DO NOT ENTER' "
								+ "\nand it looks like it is written in blood...");
						building.setLayoutX(425);
						building.setLayoutY(50);
						building.setStyle("-fx-font-size:25;");
						Button goIn = new Button("Go in building");
						Button lookAround = new Button("Look around town");
						goIn.setScaleX(3);
						goIn.setScaleY(3);
						goIn.setLayoutX(250);
						goIn.setLayoutY(300);
						lookAround.setScaleX(3);
						lookAround.setScaleY(3);
						lookAround.setLayoutX(1000);
						lookAround.setLayoutY(300);
						pane.getChildren().addAll(building, goIn, lookAround);

						lookAround.setOnAction((ActionEvent e5) -> {
							int count = 1;
							pane.getChildren().removeAll(building, goIn, lookAround, restart);
							Text lookText = new Text(
									"As you are walking you step on a wire.  You hear a click from far off and a gunshot."
											+ "\nThe wire was a trip-wire connected to a rigged rifle.  You stepping on the wire "
											+ "\npulled the trigger, firing the gun aimed towards you, hitting you in the chest, making everything go black...");
							Text namePrompt = new Text("Please enter your initials");
							namePrompt.setLayoutX(600);
							namePrompt.setLayoutY(350);
							TextField scoreText = new TextField();
							scoreText.setLayoutX(600);
							scoreText.setLayoutY(400);
							Button exit = new Button("Exit");
							exit.setScaleX(3);
							exit.setScaleY(3);
							exit.setLayoutX(650);
							exit.setLayoutY(600);
							lookText.setLayoutX(350);
							lookText.setLayoutY(200);
							lookText.setStyle("-fx-font-size:25;");
							pane.getChildren().addAll(namePrompt, scoreText, lookText, exit);
							exit.setOnAction((ActionEvent e6) -> {
								String name = scoreText.getText();
								scoreSheet(count, name, filename);
								System.exit(0);
							});

						});

					});

				});
				pane.getChildren().addAll(keepGoingText, woods, town);
			});
			pane.getChildren().addAll(headBack, keepGoing, westText);

		}
	}

	class Brad implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
		}

	}

	class Paul implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			pane.getChildren().clear();

			newRoom("You got eaten by a Bear", "choice1", "choice2");
		}

	}

	class Zack implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
		}

	}

	class Noah implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			count = 0;
			String filename = "Story2Score.txt";
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack, startText);
			Text text = new Text("You have a choice to chose your dream job. \nRace Car Driver or Airplan Pilot");
			text.setLayoutX(350);
			text.setLayoutY(200);
			text.setStyle("-fx-font-size:25;");
			Button raceCar = new Button("Race");
			Button pilot = new Button("Pilot");
			raceCar.setScaleX(3);
			raceCar.setScaleY(3);
			raceCar.setLayoutX(250);
			raceCar.setLayoutY(300);
			raceCar.setOnAction((ActionEvent e2) -> {
				pane.getChildren().removeAll(text, raceCar, pilot);
				Text raceText = new Text("You're a race car driver now. Quick!"
						+ "\nIt's during a race and a car in front of you started flipping.\nDo you swerve left or right?");
				raceText.setLayoutX(350);
				raceText.setLayoutY(200);
				raceText.setStyle("-fx-font-size:25;");
				Button left = new Button("Left");
				Button right = new Button("Right");
				left.setScaleX(3);
				left.setScaleY(3);
				left.setLayoutX(250);
				left.setLayoutY(300);
				right.setScaleX(3);
				right.setScaleY(3);
				right.setLayoutX(1000);
				right.setLayoutY(300);
				left.setOnAction((ActionEvent e3) -> {
					pane.getChildren().removeAll(raceText, left, right, restart);
					Text raceDeath = new Text("The Car lands on top of you, \nand you die instantly");
					Text namePrompt = new Text("Please enter your initials");
					namePrompt.setLayoutX(600);
					namePrompt.setLayoutY(350);
					TextField scoreText = new TextField();
					scoreText.setLayoutX(600);
					scoreText.setLayoutY(400);
					Button exit = new Button("Exit");
					exit.setScaleX(3);
					exit.setScaleY(3);
					exit.setLayoutX(650);
					exit.setLayoutY(600);
					raceDeath.setLayoutX(350);
					raceDeath.setLayoutY(200);
					raceDeath.setStyle("-fx-font-size:50;");
					exit.setOnAction((ActionEvent e4) -> {
						String name = scoreText.getText();
						scoreSheet(count, name, filename);
						System.exit(0);
					});
					pane.getChildren().addAll(namePrompt, scoreText, raceDeath, exit);
				});
				right.setOnAction((ActionEvent e5) -> {
					pane.getChildren().removeAll(raceText, left, right);
					Text raceText2 = new Text("You barely make it out of the wreck."
							+ "\nHowever your car is extremely damaged."
							+ "There is 5 laps left!\nDo you stop and fix your car or try to finish the race as is?");
					raceText2.setLayoutX(350);
					raceText2.setLayoutY(100);
					raceText2.setStyle("-fx-font-size:25;");
					Button fix = new Button("Fix");
					Button contin = new Button("Continue");
					fix.setScaleX(3);
					fix.setScaleY(3);
					fix.setLayoutX(250);
					fix.setLayoutY(300);
					contin.setScaleX(3);
					contin.setScaleY(3);
					contin.setLayoutX(1000);
					contin.setLayoutY(300);
					fix.setOnAction((ActionEvent e6) -> {
					});
					contin.setOnAction((ActionEvent e6) -> {
						int count = 2;
						pane.getChildren().removeAll(raceText2, fix, contin, restart);
						Text raceDeath = new Text("You are just about to cross the finish line\nand win,"
								+ "but your car stop because it ran\nout of oil and your car blows up killing you");
						Text namePrompt = new Text("Please enter your initials");
						namePrompt.setLayoutX(600);
						namePrompt.setLayoutY(350);
						TextField scoreText = new TextField();
						scoreText.setLayoutX(600);
						scoreText.setLayoutY(400);
						Button exit = new Button("Exit");
						exit.setScaleX(3);
						exit.setScaleY(3);
						exit.setLayoutX(650);
						exit.setLayoutY(600);
						raceDeath.setLayoutX(250);
						raceDeath.setLayoutY(50);
						raceDeath.setStyle("-fx-font-size:50;");
						exit.setOnAction((ActionEvent e4) -> {
							String name = scoreText.getText();
							scoreSheet(count, name, filename);
							System.exit(0);
						});
						pane.getChildren().addAll(namePrompt, scoreText, raceDeath, exit);
					});
					pane.getChildren().addAll(raceText2, fix, contin);
				});
				pane.getChildren().addAll(left, right, raceText);
			});
			pilot.setScaleX(3);
			pilot.setScaleY(3);
			pilot.setLayoutX(1000);
			pilot.setLayoutY(300);
			pilot.setOnAction((ActionEvent e2) -> {
				pane.getChildren().removeAll(text, raceCar, pilot);
				Text pilotText = new Text("On your first flight ever and you hit some really hard turbulence.\n"
						+ "What are you going to do? Try and land the plane or do you continue to fly? ");
				pilotText.setLayoutX(350);
				pilotText.setLayoutY(200);
				pilotText.setStyle("-fx-font-size:25;");
				Button land = new Button("Land");
				Button fly = new Button("Fly");
				land.setScaleX(3);
				land.setScaleY(3);
				land.setLayoutX(250);
				land.setLayoutY(300);
				fly.setScaleX(3);
				fly.setScaleY(3);
				fly.setLayoutX(1000);
				fly.setLayoutY(300);
				pane.getChildren().addAll(land, fly, pilotText);
			});
			pane.getChildren().addAll(text, raceCar, pilot);
		}
	}
}
