package checkGroup;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Noah Sibai, Logan Greer, Paul Lamine, Bradley Davis, Zachary Casavant
 * @fileName Tree.java
 * @version 1.0
 */

public class Tree {
	private String name;
	ArrayList<Node> root = new ArrayList<Node>();
	Scanner s;

	public Tree(File f) throws FileNotFoundException {
		s = new Scanner(f);
		
		name = s.nextLine();
		s.useDelimiter("/|\\n");
		
		while (s.hasNextLine()) {
			String message = s.next();
			message = SplitString(message, 30);
			String choiceR = s.next();
			String choiceL = s.next();
			Point pos = convert(s.next());
			root.add(new Node(message, choiceR, choiceL, pos));
		}
		s.close();
	}
	
	public String getName(){
		return name;
	}

	public Node getNode(Point pos) {
		for (Node n : root) {
			if (n.equals(pos)) {
				return n;
			}
		}
		return root.get(0);
	}

	public Point convert(String s) {
		int x = 0;
		int y = 0;

		if (s.length() == 1) {
			if (s.equals("l")) {
				x++;
				y += y;
			} else if (s.equals("r")) {
				x++;
				y += y + 1;
			}
		} else if (s.length() > 1) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'l') {
					x++;
					y += y;
				} else if (s.charAt(i) == 'r') {
					x++;
					y += y + 1;
				}
			}
		}

		return new Point(x, y);
	}

	public String SplitString(String s, int l) {
		String words = "";
		String[] w;
		int total = 0;

		w = s.split(" ");

		for (String x : w) {
			words += x + " ";
			total += x.length();
			if (total >= l) {
				words += "\n";
				total = 0;
			}
		}

		return words;
	}

}