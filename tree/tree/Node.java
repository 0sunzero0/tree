package tree.tree;

import java.util.ArrayList;

public class Node
{
	private int item;
	private ArrayList<Node> children = new ArrayList<>();

	public Node(int item) { this.item = item; }
	public void setItem(int item) { this.item = item; }
	public int getItem() { return this.item; }
	
	public void insertNode(Node child) { children.add(child); }
	public int getNumOfChildren() { return children.size(); }
	public ArrayList<Node> getChildren() { return this.children; }
}


