/**
 * Node
 *
 * 		A memeber of a linked list, holds an integer value 
 * 		and a link to another node
 */
public class Node {
	
	private int value;
	private Node next;

	/**
	 * Constructors
	 */
	public Node(int value, Node next){
		setValue(value);
		setNextNode(next);
	}

	public Node(){
		this(0, null);
	}

	public Node(int value){
		this(value, null);
	}

	/**
	 *
	 * Getters and Setters
	 * 
	 */
	public int getValue(){
		return this.value;
	}
	public void setValue(int value){
		this.value = value;
	}
	public Node getNextNode(){
		return this.next;
	}
	public void setNextNode(Node next){
		this.next = next;
	}
}