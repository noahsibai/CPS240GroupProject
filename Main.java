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
		Paul = new Button("Story 4");
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
					
					yes.setOnAction((ActionEvent e16) -> {
						pane.getChildren().removeAll(woodsText, yes, no);
						Text cabin = new Text("Looking around, you find a small cabin in the woods."
								+ "\nThere aren't any lights on and one of the windows are smashed in.");
						
					});
					
					no.setOnAction((ActionEvent e13) -> {
						pane.getChildren().removeAll(woodsText, yes, no);
						Text path = new Text("Walking through the woods, the path starts to become unclear."
								+ "\nYou hear rustling in the bushes behind you.");
						path.setLayoutX(425);
						path.setLayoutY(50);
						path.setStyle("-fx-font-size:25;");
						Button walk = new Button("Keep walking");
						Button look = new Button("Look for it!");
						walk.setScaleX(3);
						walk.setScaleY(3);
						walk.setLayoutX(250);
						walk.setLayoutY(300);
						look.setScaleX(3);
						look.setScaleY(3);
						look.setLayoutX(1000);
						look.setLayoutY(300);
						pane.getChildren().addAll(path, walk, look);
						
						walk.setOnAction((ActionEvent e17) -> {
							pane.getChildren().removeAll(path, walk, look, restart);
							Text eated = new Text("You hear the noise getting closer and louder!"
									+ "\nYou turn around and see a giant silhouette towering over you!"
									+ "\nThe creature mauls you, leaving you to die in the woods.");
							eated.setLayoutX(425);
							eated.setLayoutY(50);
							eated.setStyle("-fx-font-size:25;");
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
							pane.getChildren().addAll(namePrompt, scoreText, eated, exit);
							exit.setOnAction((ActionEvent e6) -> {
								String name = scoreText.getText();
								scoreSheet(count, name, filename);
								System.exit(0);
							});
						});
						
						look.setOnAction((ActionEvent e14) -> {
							pane.getChildren().removeAll(path, walk, look);
							Text creature = new Text("You see a silhouette of a large furry creature walking behind some nearby trees.");
							creature.setLayoutX(425);
							creature.setLayoutY(50);
							creature.setStyle("-fx-font-size:25;");
							Button run = new Button("Turn and run!");
							Button crouch = new Button("Crouch in bushes and wait");
							run.setScaleX(3);
							run.setScaleY(3);
							run.setLayoutX(250);
							run.setLayoutY(300);
							crouch.setScaleX(3);
							crouch.setScaleY(3);
							crouch.setLayoutX(1000);
							crouch.setLayoutY(300);
							pane.getChildren().addAll(creature, run, crouch);
							
							run.setOnAction((ActionEvent e15) -> {
								pane.getChildren().removeAll(creature, run, crouch, restart);
								Text maul = new Text("The beast hears you!  It chases you down and you aren't fast enough."
										+ "\nThe creature mauls you, leaving you to die in the woods.");
								maul.setLayoutX(425);
								maul.setLayoutY(50);
								maul.setStyle("-fx-font-size:25;");
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
								pane.getChildren().addAll(namePrompt, scoreText, maul, exit);
								exit.setOnAction((ActionEvent e6) -> {
									String name = scoreText.getText();
									scoreSheet(count, name, filename);
									System.exit(0);
								});
								
								
							});
							
						});
						
						
					});
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
						
						goIn.setOnAction((ActionEvent e7) -> {
							pane.getChildren().removeAll(building, goIn, lookAround);
							Text inBuilding = new Text("The doors on the building are heavy, but you are able to push them open."
									+ "\nIt is dark inside, and you hear a muffled noise that sounds like groaning...");
							inBuilding.setLayoutX(425);
							inBuilding.setLayoutY(50);
							inBuilding.setStyle("-fx-font-size:25;");
							Button find = new Button("Find the noise");
							Button run = new Button("Run out! Too creepy!");
							find.setScaleX(3);
							find.setScaleY(3);
							find.setLayoutX(250);
							find.setLayoutY(300);
							run.setScaleX(3);
							run.setScaleY(3);
							run.setLayoutX(1000);
							run.setLayoutY(300);
							pane.getChildren().addAll(inBuilding, find, run);
							
							find.setOnAction((ActionEvent e10) -> {
								pane.getChildren().removeAll(inBuilding, find, run);
								Text room = new Text("You find the room where the noise is coming from."
										+ "\nThe sound is louder and something is bumping against the doors.");
								room.setLayoutX(425);
								room.setLayoutY(50);
								room.setStyle("-fx-font-size:25;");
								Button open = new Button("Open the doors");
								Button run2 = new Button("Screw that! Run out!");
								open.setScaleX(3);
								open.setScaleY(3);
								open.setLayoutX(250);
								open.setLayoutY(300);
								run2.setScaleX(3);
								run2.setScaleY(3);
								run2.setLayoutX(1000);
								run2.setLayoutY(300);
								pane.getChildren().addAll(room, open, run2);
								
								open.setOnAction((ActionEvent e12) -> {
									int count = 1;
									pane.getChildren().removeAll(room, open, run2, restart);
									Text eaten = new Text("You open the doors and a horde of the undead come spilling out of the room!"
											+ "\nThey swarm you, eating you alive...");
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
									eaten.setLayoutX(350);
									eaten.setLayoutY(200);
									eaten.setStyle("-fx-font-size:25;");
									pane.getChildren().addAll(namePrompt, scoreText, eaten, exit);
									exit.setOnAction((ActionEvent e6) -> {
										String name = scoreText.getText();
										scoreSheet(count, name, filename);
										System.exit(0);
									});
									
								});
								
								run2.setOnAction((ActionEvent e11) -> {
									int count = 1;
									pane.getChildren().removeAll(room, open, run2, restart);
									Text lookText = new Text(
											"As you are walking through the town you step on a wire.  You hear a click from far off and a gunshot."
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
							
							run.setOnAction((ActionEvent e9) -> {
								int count = 1;
								pane.getChildren().removeAll(inBuilding, find, run, restart);
								Text lookText = new Text(
										"As you are walking through the town you step on a wire.  You hear a click from far off and a gunshot."
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

						lookAround.setOnAction((ActionEvent e5) -> {
							int count = 1;
							pane.getChildren().removeAll(building, goIn, lookAround, restart);
							Text lookText = new Text(
									"As you are walking through the town you step on a wire.  You hear a click from far off and a gunshot."
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