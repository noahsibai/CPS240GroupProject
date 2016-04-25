package groupProject;

import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tree {

	ArrayList<Node> root = new ArrayList<Node>();
	Scanner s;
	
	public Tree(File f) throws FileNotFoundException {
		s = new Scanner(f);
		s.useDelimiter("/|\\n");
		
		while(s.hasNextLine()){
			String message = s.next();
			String choiceR = s.next();
			String choiceL = s.next();
			Point pos = convert(s.next());
			root.add(new Node(message, choiceR, choiceL, pos));
		}
		s.close();
	}
	
	public Node getNode(Point pos){
		for(Node n: root){
			if(n.equals(pos)){
				return n;
			}
		}
		return root.get(0);
	}
	
	public Point convert(String s){
		 int x = 0;
		 int y = 0;
		 
		 if (s.length() == 1){
			 if(s.equals("l")){
				 x++;
				 y+=y;
			 }
			 else if(s.equals("r")){
				 x++;
				 y+=y+1; 
			 }
		 }
		 else if(s.length() > 1){
			 for(int i = 0; i < s.length(); i++){
				 if(s.charAt(i) == 'l'){
					 x++;
					 y+=y;
				 }
				 else if(s.charAt(i) == 'r'){
					 x++;
					 y+=y+1;
				 }
			 } 
		 }
		 
		 return new Point(x,y);
	}
}
