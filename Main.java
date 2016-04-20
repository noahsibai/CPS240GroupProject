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
		}

	}

	class Logan implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent arg0) {
			count = 0;
			filename = "Story1Score.txt";
			pane.getChildren().removeAll(Logan, Noah, Paul, Bradb, Zack, startText);
			Tree l = new Tree("Travel to the West, heading to the unknown lands", "Turn around", "Keep Going", "");
			
//right branch
			l.add("The gates to the town have closed.  There's no going back now.", null, "Keep Going", "r");
			l.add("As you are walking away from the town, a small group of zombies come out of the woods!\nThe town you came from open fire, and a stray bullet hits you, leaving you as zombie bait...", null, null, "rr");
			l.add("The clouds suddenly get dark, covering the sun \nand setting an eerie darkness over the land. \nIt looks like it's going to rain.", "Head to the woods", "Continue on the road looking for a town", "l");
	//Town story
			l.add("As you travel the rain begins to come down harder.  Soaked and covered in wet clothes, \nyou approach a town, but it looks abandoned...", null, "Next", "lr");
			
			l.add("At the front of the town is the large town hall building.  \nThe writing on the wall says DO NOT ENTER and it looks like it is written in blood...", "Go in the building", "Look around town", "lrr");
			l.add("The doors on the building are heavy, but you are able to push them open.\nIt is dark inside, and you hear a muffled noise that sounds like groaning...", "Run out!", "Look for the noise", "lrrl");
			l.add("As you are walking you step on a wire...You hear a click from far off and a gunshot...", "Next", null, "lrrll");
			l.add("The wire was a trip-wire connected to a rigged rifle.  You stepping on the wire pulled the trigger, \nfiring the gun aimed towards you, hitting you in the chest, making everything go black...", null, null, "lrrlll");
			
			l.add("You find the room where the noise is coming from.  \nThe sound is louder and something is bumping against the doors.", "Open up the doors", "Run out of the building!", "lrrlr");
			l.add("As you are walking you step on a wire...You hear a click from far off and a gunshot...", null, "Next", "lrrlrr");
			l.add("The wire was a trip-wire connected to a rigged rifle.  You stepping on the wire pulled the trigger, \nfiring the gun aimed towards you, hitting you in the chest, making everything go black...", null, null, "lrrlrrr");
			
			l.add("You open the doors and a horde of the undead come spilling out of the room!\nThey swarm you, eating you alive...", null, null, "lrrlrl");
			l.add("As you are walking you step on a wire...You hear a click from far off and a gunshot...", null, "Next", "lrrr");
			l.add("The wire was a trip-wire connected to a rigged rifle.  You stepping on the wire pulled the trigger, \nfiring the gun aimed towards you, hitting you in the chest, making everything go black...", null, null, "lrrrr");
			
//left branch
			l.add("The woods provide coverage from the rain, but who knows what is in these woods.\nIt's dark and eerie, the wind is blowing.  You have a flashlight in your backpack.  Do you want to use it?", "Yes, use it", "No, don't need it", "ll");
	//Cabin story
			l.add("Looking around, you find a small cabin in the woods.\nThere aren't any lights on and one of the windows are smashed in.", "Go up to the house", "Head to the exit", "lll");
			
		//Go up to the house
			l.add("You hear a scream from inside the house!", "Help the person who screamed!", "Turn and run!", "llll");
			
			l.add("In the house there is an upstairs and basement. \nWhere do you go?", "Look upstairs", "Look in the basement", "lllll");
		//Basement
			l.add("The basement is dimly lit.  You see a figure leaning against the wall in the corner of the room...", "Get out of this creepy house!", "Check on the figure", "lllllr");
			l.add("You creep slowly to the figure to find a dead woman!  Get out of this creepy house!", null, "Next", "lllllrr");
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllllrrr");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "lllllrrrr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "lllllrrrrl");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllllrrrrll");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "lllllrrrrr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllllrrrrrr");
		//Get out of basement
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", "Next", null, "lllllrl");
			l.add("You turn around and see a masked figure with a knife!", "Turn and fight!", "Try to break out!", "lllllrll");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", null, "Next", "lllllrllr");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllllrllrr");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", "Next", null, "lllllrlll");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllllrllll");
		
			
		//Upstairs
			l.add("The stairs going up only lead to one room, and it is empty.", "Head downstairs to the basement", "This seems sketchy! Leave the house!", "llllll");
			
		//Leave the house
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "llllllr");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "llllllrr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "llllllrrl");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "llllllrrll");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "llllllrrr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "llllllrrrr");
			
		//Upstairs to basement
			l.add("The basement is dimly lit.  You see a figure leaning against the wall in the corner of the room...", "Check on the figure", "Get out of this creepy house!", "lllllll");
			
		//Get out of the house
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllllllr");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "lllllllrr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "lllllllrrl");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllllllrrll");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "lllllllrrr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllllllrrrr");
			
		//Done with "Go up to house"
			
		//"Head to the exit"
		//Don't go in the cabin
			l.add("You are almost to the exit of the woods, when you suddenly hear a scream, \ncoming from the eerie cabin from before.", "Run back to the cabin and help!", "Screw who that was. Not my problem", "lllr");
			
		//Back to cabin
			l.add("In the house there is an upstairs and basement. \nWhere do you go?", "Look in the basement", "Look upstairs", "lllrl");
		//Basement
			l.add("The basement is dimly lit.  You see a figure leaning against the wall in the corner of the room...", "Get out of this creepy house!", "Check on the figure", "lllrll");
			l.add("You creep slowly to the figure to find a dead woman!  Get out of this creepy house!", null, "Next", "lllrllr");
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllrllrr");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "lllrllrrr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "lllrllrrrl");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrllrrrll");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "lllrllrrrr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrllrrrrr");
		//Get out of basement
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", "Next", null, "lllrlll");
			l.add("You turn around and see a masked figure with a knife!", "Turn and fight!", "Try to break out!", "lllrllll");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", null, "Next", "lllrllllr");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrllllrr");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", "Next", null, "lllrlllll");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrllllll");
		
			
		//Upstairs
			l.add("The stairs going up only lead to one room, and it is empty.", "Head downstairs to the basement", "This seems sketchy! Leave the house!", "lllrlr");
			
		//Leave the house - Upstairs
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllrlrr");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "lllrlrrr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "lllrlrrrl");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrlrrrll");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "lllrlrrrr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrlrrrrr");
			
		//Upstairs to basement
			l.add("The basement is dimly lit.  You see a figure leaning against the wall in the corner of the room...", "Check on the figure", "Get out of this creepy house!", "lllrlrl");
			
		//Get out of the house
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllrlrlr");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "lllrlrlrr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "lllrlrlrrl");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrlrlrrll");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "lllrlrlrrr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrlrlrrrr");
			
			l.add("You creep slowly to the figure to find a dead woman!  Get out of this creepy house!", null, "Next", "lllrlrll");
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllrlrllr");
			l.add("You turn around and see a masked figure with a knife!", "Turn and fight!", "Try to break out!", "lllrlrllrr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", null, "Next", "lllrlrllrrr");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrlrllrrrr");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", "Next", null, "lllrlrllrrl");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrlrllrrll");
		//Done with "Head to the exit"
			
			
		//Turn and run
			l.add("Upon exiting the woods, you are tackled to the ground!  A woman is on top of you screaming about helping her friend!\nShe holds you at knife-point and asks if you heard the scream.", "Admit to hearing the scream", "Lie saying you didn't hear the scream", "llllr");
			
			//Lie
			l.add("She calls you a liar!  She stands you up and leads you back in to the woods with the knife at your back.\nNow you have to go into the cabin.", null, "Next", "llllrr");
			l.add("You walk forward into the dark hallway, feeling the wall as you go so you don't trip.\nYou pause... You don't hear the woman behind you.  You turn around and she isn't there anymore...", "Go to the back door! Get out!", "Look for the woman", "llllrrr");
			
			//Look for the woman
			l.add("In the house there is an upstairs and basement. \nWhere do you go?", "Look upstairs", "Look in the basement", "llllrrrr");
			//basement - look
		l.add("The basement is dimly lit.  You see a figure leaning against the wall in the corner of the room...", "Check on the figure", "Get out of this creepy house!", "llllrrrrr");
			//get out of basement - look
		l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "llllrrrrrr");
		l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "llllrrrrrrr");
		l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "llllrrrrrrrr");
		l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "llllrrrrrrrrr");
		l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "llllrrrrrrrl");
		l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "llllrrrrrrrll");
			//check figure
		l.add("You creep slowly to the figure to find a dead woman!  Get out of this creepy house!", null, "Next", "llllrrrrrl");
		l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "llllrrrrrlr");
		l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "llllrrrrrlrr");
		l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "llllrrrrrlrrr");
		l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "llllrrrrrlrrrr");
		l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "llllrrrrrlrrl");
		l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "llllrrrrrlrrll");
		
			//upstairs - look
		l.add("The stairs going up only lead to one room, and it is empty.", "Head downstairs to the basement", "This seems sketchy! Leave the house!", "llllrrrrl");
			//get out of house - upstairs
		l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "llllrrrrlr");
		l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "llllrrrrlrr");
		l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "llllrrrrlrrr");
		l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "llllrrrrlrrrr");
		l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "llllrrrrlrrl");
		l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "llllrrrrlrrll");
		
			//upstairs to basement
		l.add("The basement is dimly lit.  You see a figure leaning against the wall in the corner of the room...", "Check on the figure", "Get out of this creepy house!", "llllrrrrll");
			//get out of basement after upstairs
		l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "llllrrrrllr");
		l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "llllrrrrllrr");
		l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "llllrrrrllrrr");
		l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "llllrrrrllrrrr");
		l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "llllrrrrllrrl");
		l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "llllrrrrllrrll");
			//check figure
		l.add("You creep slowly to the figure to find a dead woman!  Get out of this creepy house!", null, "Next", "llllrrrrlll");
		l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "llllrrrrlllr");
		l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "llllrrrrlllrr");
		l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "llllrrrrlllrrr");
		l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "llllrrrrlllrrrr");
		l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "llllrrrrlllrrl");
		l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "llllrrrrlllrrll");
			
			//Lie - Get out of the house
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", "Next", null, "llllrrrl");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "llllrrrll");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "llllrrrlll");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "llllrrrllll");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "llllrrrllr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "llllrrrllrr");
			
			//Truth
			l.add("She tells you that you have to help her go find her friend.  \nShe stands you up and leads you back in to the woods with the knife at your back.  You are forced to go into the cabin.", "Next", null, "llllrl");
			l.add("You walk forward into the dark hallway, feeling the wall as you go so you don't trip.\nYou pause... You don't hear the woman behind you.  You turn around and she isn't there anymore...", "Go to the back door! Get out!", "Look for the woman", "llllrll");
			
			//Look for the woman
			l.add("In the house there is an upstairs and basement. \nWhere do you go?", "Look upstairs", "Look in the basement", "llllrllr");
				//basement - look
			l.add("The basement is dimly lit.  You see a figure leaning against the wall in the corner of the room...", "Check on the figure", "Get out of this creepy house!", "llllrllrr");
				//get out of basement - look
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "llllrllrrr");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "llllrllrrrr");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "llllrllrrrrr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "llllrllrrrrrr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "llllrllrrrrl");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "llllrllrrrrll");
				//check figure
			l.add("You creep slowly to the figure to find a dead woman!  Get out of this creepy house!", null, "Next", "llllrllrrl");
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "llllrllrrlr");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "llllrllrrlrr");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "llllrllrrlrrr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "llllrllrrlrrrr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "llllrllrrlrrl");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "llllrllrrlrrll");
			
				//upstairs - look
			l.add("The stairs going up only lead to one room, and it is empty.", "Head downstairs to the basement", "This seems sketchy! Leave the house!", "llllrllrl");
				//get out of house - upstairs
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "llllrllrlr");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "llllrllrlrr");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "llllrllrlrrr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "llllrllrlrrrr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "llllrllrlrrl");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "llllrllrlrrll");
			
				//upstairs to basement
			l.add("The basement is dimly lit.  You see a figure leaning against the wall in the corner of the room...", "Check on the figure", "Get out of this creepy house!", "llllrllrll");
				//get out of basement after upstairs
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "llllrllrllr");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "llllrllrllrr");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "llllrllrllrrr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "llllrllrllrrrr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "llllrllrllrrl");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "llllrllrllrrll");
				//check figure
			l.add("You creep slowly to the figure to find a dead woman!  Get out of this creepy house!", null, "Next", "llllrllrlll");
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "llllrllrlllr");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "llllrllrlllrr");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "llllrllrlllrrr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "llllrllrlllrrrr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "llllrllrlllrrl");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "llllrllrlllrrll");
			
			//Truth - Leave house
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "llllrlll");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "llllrlllr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "llllrlllrl");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "llllrlllrll");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "llllrlllrr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "llllrlllrrr");

			
		//"Screw them"
			l.add("Upon exiting the woods, you are tackled to the ground!  A woman is on top of you screaming about helping her friend!\nShe holds you at knife-point and asks if you heard the scream.", "Admit to hearing the scream", "Lie saying you didn't hear the scream", "lllrr");
			
		//Lie
			l.add("She calls you a liar!  She stands you up and leads you back in to the woods with the knife at your back.\nNow you have to go into the cabin.", null, "Next", "lllrrr");
			l.add("You walk forward into the dark hallway, feeling the wall as you go so you don't trip.\nYou pause... You don't hear the woman behind you.  You turn around and she isn't there anymore...", "Go to the back door! Get out!", "Look for the woman", "lllrrrr");
			
		//Look for her - Lie
			l.add("In the house there is an upstairs and basement. \nWhere do you go?", "Look upstairs", "Look in the basement", "lllrrrrr");
			
		//Basement
			l.add("The basement is dimly lit.  You see a figure leaning against the wall in the corner of the room...", "Check on the figure", "Get out of this creepy house!", "lllrrrrrr");
			
			//Get out of the house - Basement
				l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllrrrrrrr");
				l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "lllrrrrrrrr");
				l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "lllrrrrrrrrl");
				l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrrrrrrrrll");
				l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "lllrrrrrrrrr");
				l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrrrrrrrrrr");
				
				l.add("You creep slowly to the figure to find a dead woman!  Get out of this creepy house!", "Next", null, "lllrrrrrrl");
				l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllrrrrrrll");
				l.add("You turn around and see a masked figure with a knife!", "Turn and fight!", "Try to break out!", "lllrrrrrrllr");
				l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", null, "Next", "lllrrrrrrllrr");
				l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrrrrrrllrrr");
				l.add("As you charge towards the masked figure you stumble and fall onto the floor...", "Next", null, "lllrrrrrrllrl");
				l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrrrrrrllrll");
	
		//Upstairs
			l.add("The stairs going up only lead to one room, and it is empty.", "Head downstairs to the basement", "This seems sketchy! Leave the house!", "lllrrrrrl");
			
		//Leave the house
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllrrrrrlr");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "lllrrrrrlrr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "lllrrrrrlrrl");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrrrrrlrrll");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "lllrrrrrlrrr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrrrrrlrrrr");
			
		//Upstairs to basement
			l.add("The basement is dimly lit.  You see a figure leaning against the wall in the corner of the room...", "Check on the figure", "Get out of this creepy house!", "lllrrrrrll");
			
		//Get out of the house
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllrrrrrllr");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "lllrrrrrllrr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "lllrrrrrllrrl");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrrrrrllrrll");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "lllrrrrrllrrr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrrrrrllrrrr");
			
			l.add("You creep slowly to the figure to find a dead woman!  Get out of this creepy house!", null, "Next", "lllrrrrrlll");
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllrrrrrlllr");
			l.add("You turn around and see a masked figure with a knife!", "Turn and fight!", "Try to break out!", "lllrrrrrlllrr");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", null, "Next", "lllrrrrrlllrrr");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrrrrrlllrrrr");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", "Next", null, "lllrrrrrlllrrl");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrrrrrlllrrll");
			
		//Lie - Get out of the house
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", "Next", null, "lllrrrrl");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "lllrrrrll");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "lllrrrrlll");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrrrrllll");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "lllrrrrllr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrrrrllrr");
			
		//Truth
			l.add("She tells you that you have to help her go find her friend.  \nShe stands you up and leads you back in to the woods with the knife at your back.  You are forced to go into the cabin.", "Next", null, "lllrrl");
			l.add("You walk forward into the dark hallway, feeling the wall as you go so you don't trip.\nYou pause... You don't hear the woman behind you.  You turn around and she isn't there anymore...", "Go to the back door! Get out!", "Look for the woman", "lllrrll");
			
		//Truth - look for her	
			l.add("In the house there is an upstairs and basement. \nWhere do you go?", "Look upstairs", "Look in the basement", "lllrrllr");
			
			//Basement
				l.add("The basement is dimly lit.  You see a figure leaning against the wall in the corner of the room...", "Check on the figure", "Get out of this creepy house!", "lllrrllrr");
				
				//Get out of the house - Basement
					l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllrrllrrr");
					l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "lllrrllrrrr");
					l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "lllrrllrrrrl");
					l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrrllrrrrll");
					l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "lllrrllrrrrr");
					l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrrllrrrrrr");
					
					l.add("You creep slowly to the figure to find a dead woman!  Get out of this creepy house!", "Next", null, "lllrrllrrl");
					l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllrrllrrll");
					l.add("You turn around and see a masked figure with a knife!", "Turn and fight!", "Try to break out!", "lllrrllrrllr");
					l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", null, "Next", "lllrrllrrllrr");
					l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrrllrrllrrr");
					l.add("As you charge towards the masked figure you stumble and fall onto the floor...", "Next", null, "lllrrllrrllrl");
					l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrrllrrllrll");
				
		
			//Upstairs
				l.add("The stairs going up only lead to one room, and it is empty.", "Head downstairs to the basement", "This seems sketchy! Leave the house!", "lllrrllrl");
				
			//Leave the house
				l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllrrllrlr");
				l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "lllrrllrlrr");
				l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "lllrrllrlrrl");
				l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrrllrlrrll");
				l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "lllrrllrlrrr");
				l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrrllrlrrrr");
				
			//Upstairs to basement
				l.add("The basement is dimly lit.  You see a figure leaning against the wall in the corner of the room...", "Check on the figure", "Get out of this creepy house!", "lllrrllrll");
				
			//Get out of the house
				l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllrrllrllr");
				l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "lllrrllrllrr");
				l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "lllrrllrllrrl");
				l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrrllrllrrll");
				l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "lllrrllrllrrr");
				l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrrllrllrrrr");
				
				l.add("You creep slowly to the figure to find a dead woman!  Get out of this creepy house!", null, "Next", "lllrrllrlll");
				l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", null, "Next", "lllrrllrlllr");
				l.add("You turn around and see a masked figure with a knife!", "Turn and fight!", "Try to break out!", "lllrrllrlllrr");
				l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", null, "Next", "lllrrllrlllrrr");
				l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrrllrlllrrrr");
				l.add("As you charge towards the masked figure you stumble and fall onto the floor...", "Next", null, "lllrrllrlllrrl");
				l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrrllrlllrrll");
		
		//Truth - Leave house
			l.add("You make it to the back door but it is locked from the outside.\nYou hear a creak in the floorboards from behind you...", "Next", null, "lllrrlll");
			l.add("You turn around and see a masked figure with a knife!", "Try to break out!", "Turn and fight!", "lllrrllll");
			l.add("As you are panicking and trying to escape the house from the killer, \nyou bust out of the door and stumble onto the back porch...", "Next", null, "lllrrlllll");
			l.add("You try crawling away off of the porch, and suddenly feel a shooting pain in your back.\nThe masked murderer has stabbed you in the spine, leaving you paralyzed and to die on the back porch...", null, null, "lllrrllllll");
			l.add("As you charge towards the masked figure you stumble and fall onto the floor...", null, "Next", "lllrrllllr");
			l.add("You roll over and see the masked figure with the knife above you!\nYou see the knife come down towards you, and everything goes black...", null, null, "lllrrllllrr");
		//Done with "Screw Them"
			
			
	//Woods story
			l.add("Walking through the woods, the path starts to become unclear.  \nYou hear rustling in the bushes behind you.", "Keep walking", "Turn and look for the noise", "llr");
			l.add("You hear the noise getting closer and louder!  \nYou turn around and see a giant silhouette towering over you!", null, "Next", "llrl");
			l.add("The beast hears you! You try and run but you aren't fast enough. \nThe creature mauls you, leaving you to die in the woods", null, null, "llrlr");

			l.add("The creature mauls you, leaving you to die in the woods...", null, null, "llrlr");
			l.add("You see a silhouette of a large furry creature walking behind some nearby trees.", "Turn and run!", "Crouch in the bushes and hide", "llrr");
			l.add("The beast walks off. You wait a little longer to be sure, and continue into the woods, searching for a safe place", null, "Next", "llrrr");
			l.add("As you are searching for a safe place, you hear a loud crack, and a shooting pain in your leg!\nYou look down and see you stepped in a bear trap!", null, "Next", "llrrrr");
			l.add("You can't move without your leg hurting.  The teeth from the trap dug deep into your leg.\nNothing can save you, and you bleed out in the woods...", null, null, "llrrrrr");
			l.add("The beast hears you! You try and run but you aren't fast enough. \nThe creature mauls you, leaving you to die in the woods", null, null, "llrrl");
			
			newRoom("Travel to the West, heading to the unknown lands", "Keep going", "Turn Around", l, "");
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
		
		if(buttonL == null){
			pane.getChildren().remove(buttL);
		}
		if(buttonR == null){
			pane.getChildren().remove(buttR);
		}

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