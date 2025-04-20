import java.util.*;

public class HeaderNodeList{
	ArrayList<HeaderNode> headerNodes;

	public void HeaderNodeList(){
		headerNodes = new ArrayList();
	}//end constructor

	public void setNodes(ArrayList<HeaderNode> nodes){
		this.headerNodes = nodes;
	}//end setter

	public String getNodeString(){
		String tempString = "";
		for (HeaderNode node: this.headerNodes){
			tempString = tempString + node.getName() + ", ";
		}//end for loop
		return tempString;
	}//end getter

	public ArrayList<HeaderNode> getNodeList(){
		return this.headerNodes;
	}//end getter
	
	public void addNode(HeaderNode node){
		this.headerNodes.add(node);
	}//end addNode def

	public void removeNode(HeaderNode node){
		this.headerNodes.remove(node);
	}//end removeNod def
}//end class def
