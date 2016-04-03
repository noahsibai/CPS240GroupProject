public class Node {

	String message;
	String choiceR;
	String choiceL;
	String pos;


	Node lChild;
	Node rChild;

	public Node( String m, String one, String two, String pos)
	{
		this.message = m;
		this.choiceR = one;
		this.choiceL = two;
		this.pos = pos;

		lChild = null;
		rChild = null;

	}


	public String toString()
	{
		return(message+" "+ choiceR +" "+ choiceL + pos);
	}
}
