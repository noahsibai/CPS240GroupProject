import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

class CreateOwn implements EventHandler<ActionEvent> {

	Pane pane = Main.pane;
	Rectangle2D primaryScreenBounds = Main.primaryScreenBounds;

	private String fileName;
	public PrintWriter pw;

	public String getfName() {
		return fileName;
	}

	public void setfName(String f) {
		this.fileName = f;
	}

	@Override
	public void handle(ActionEvent arg0) {
		Main.pane.getChildren().clear();

		TextField nameField = new TextField();
		Text fName = new Text("Name of Story");

		nameField.setLayoutX((primaryScreenBounds.getWidth() / 3));
		nameField.setLayoutY((primaryScreenBounds.getWidth() / 3));
		fName.setLayoutX((primaryScreenBounds.getWidth() / 3) - 75);
		fName.setLayoutY((primaryScreenBounds.getWidth() / 3));

		Button createStory = new Button("Create Story");

		pane.getChildren().addAll(nameField, fName, createStory);

		setfName(nameField.getText());

		createStory.setOnAction(new newStory());
	}

	class newStory implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {

			System.out.println("Its trying its best");

			for (javafx.scene.Node n : pane.getChildren()) {
				if (n instanceof TextField) {
					setfName(((TextField) n).getText() + ".txt");
				}
			}
			pane.getChildren().clear();
			System.out.println(getfName());
			Button b = new Button("Enter");

			pane.getChildren().add(b);

			b.setOnAction(new add());

			try {
				pw = new PrintWriter(new File(getfName()));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}
	}

	class add implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent arg0) {

			pane.getChildren().clear();
			//
			// TextField nameField = new TextField();
			// Text fName = new Text("Name of Story");
			//
			// nameField.setLayoutX((primaryScreenBounds.getWidth() / 3));
			// nameField.setLayoutY((primaryScreenBounds.getWidth() / 3));
			// fName.setLayoutX((primaryScreenBounds.getWidth() / 3) - 75);
			// fName.setLayoutY((primaryScreenBounds.getWidth() / 3));
			//
			//
			//
			// Button createStory = new Button("Create Story");
			// createStory.setOnAction(new add());
			//
			// pane.getChildren().addAll(nameField, fName, createStory);

			pane.getChildren().clear();

			TextField message = new TextField();
			Text mes = new Text("Enter message");

			TextField rButton = new TextField();
			Text rBut = new Text("Choice 1");

			TextField lButton = new TextField();
			Text lBut = new Text("Choice 2");

			Button submit = new Button("Create");
			submit.setLayoutX((primaryScreenBounds.getWidth() / 3));
			submit.setLayoutY((primaryScreenBounds.getWidth() / 3) + 100);

			message.setLayoutX((primaryScreenBounds.getWidth() / 3));
			message.setLayoutY((primaryScreenBounds.getWidth() / 3) - 100);
			mes.setLayoutX((primaryScreenBounds.getWidth() / 3) - 65);
			mes.setLayoutY((primaryScreenBounds.getWidth() / 3) - 100);

			rButton.setLayoutX((primaryScreenBounds.getWidth() / 3));
			rButton.setLayoutY((primaryScreenBounds.getWidth() / 3) - 200);
			rBut.setLayoutX((primaryScreenBounds.getWidth() / 3) - 55);
			rBut.setLayoutY((primaryScreenBounds.getWidth() / 3) - 200);

			lButton.setLayoutX((primaryScreenBounds.getWidth() / 3));
			lButton.setLayoutY((primaryScreenBounds.getWidth() / 3) - 300);
			lBut.setLayoutX((primaryScreenBounds.getWidth() / 3) - 55);
			lBut.setLayoutY((primaryScreenBounds.getWidth() / 3) - 300);

			pane.getChildren().addAll(message, rButton, lButton, mes, rBut, lBut, submit);

			submit.setOnAction(new add());

		}
	}
}
