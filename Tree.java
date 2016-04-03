public class Tree {

	Node root;

	public Tree(String message, String choiceR, String choiceL, String pos) {
		root = new Node(message, choiceR, choiceL, pos);
	}

	public void add(String message, String choiceR, String choiceL, String pos) {
		Node NewNode = new Node(message, choiceR, choiceL, pos); // create new
																	// node to
																	// add
		Node parent;

		int len = pos.length();
		if (len <= 1) {
			parent = root;
			if (pos == "r") {
				parent.rChild = NewNode;
			} else if (pos == "l") {
				parent.lChild = NewNode;
			} else {
				System.out.println("Wrong Input");
			}
		} else {
			parent = get(pos.substring(0, len - 1)); // find parent based on
														// second to last r / l
														// position
					// System.out.println( "Adding: " + pos + "  to Parent: " + parent.pos);

			if (pos.charAt(len - 1) == 'l' && parent.lChild == null) {
				parent.lChild = NewNode;
			} else if (pos.charAt(len - 1) == 'r' && parent.rChild == null) {
				parent.rChild = NewNode;
			} else {
				System.out.println("Somthin screwed in add");

			}
		}
	}

	public Node get(String pos) {

		Node dad = root;
		int i = 0; // incremented to move up position

		while (true) {

			try {
				char p = pos.charAt(i); // traverse to left or right (r or l)
				// throws StringIndexOutOfBoundsException when at correct Node

				// System.out.println(p);
				if (p == 'r' && dad.rChild != null) { // go to right if
														// rightChild
														// is not empty
					dad = dad.rChild;
					i++;
				} else if (p == 'l' && dad.lChild != null) {
					dad = dad.lChild;
					i++;
				} else {
					// System.out.println("Found : " + dad);
					return dad;
				}
			}

			catch (StringIndexOutOfBoundsException ex) {
				return dad;
			}
		}
	}
}
