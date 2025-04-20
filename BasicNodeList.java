import java.util.*;

public class BasicNodeList{
	ArrayList<BasicNode> basicNodes;

	public void BasicNodeList(){
		basicNodes = new ArrayList();
	}//end constructor

	public void setNodes(ArrayList<BasicNode> nodes){
		this.basicNodes = nodes;
	}//end setter

	public String getNodeString(){
		String tempString = "";
		for (BasicNode node: this.basicNodes){
			tempString = tempString + node.getName() + ", ";
		}//end for loop
		return tempString;
	}//end getter

	public ArrayList<BasicNode> getNodeList(){
		return this.basicNodes;
	}//end getter

	public void addNode(BasicNode node){
		this.basicNodes.add(node);
	}//end addNode def
	
	public void removeNode(BasicNode node){
		this.basicNodes.remove(node);
	}//end removeNode def
}//end class def
