package checkGroup;

import java.awt.Point;

/**
 * @author Noah Sibai, Logan Greer, Paul Lamine, Bradley Davis, Zachary Casavant
 * @fileName Node.java
 * @version 1.0
 */

public class Node {

	String message;
	String choiceR;
	String choiceL;
	Point pos;

	public Node(String m, String one, String two, Point pos) {
		if (one.equals("null"))
			one = null;
		if (two.equals("null"))
			two = null;

		this.message = m;
		this.choiceR = two;
		this.choiceL = one;
		this.pos = new Point(pos);
	}

	public Point getPos() {
		return pos;
	}

	public String getButtonL() {
		return choiceL;
	}

	public String getButtonR() {
		return choiceR;
	}

	public String getMessage() {
		return message;
	}

	public String toString() {
		return (message + " " + choiceR + " " + choiceL + pos.toString());
	}

	public boolean equals(Point p) {
		return this.pos.equals(p);
	}

}