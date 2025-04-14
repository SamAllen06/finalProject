import java.util.*;

public class NodeList{
	ArrayList<BasicNode> basicNodes;
	ArrayList<HeaderNode> headerNodes;

	public void NodeList(){
		basicNodes = new ArrayList();
		headerNodes = new ArrayList();
	}//end constructor

	public void setBasicNodes(ArrayList<BasicNode> nodes){
		this.basicNodes = nodes;
	}//end setter

	public void setHeaderNodes(ArrayList<HeaderNode> nodes){
		this.headerNodes = nodes;
	}//end setter

	public String getBasicNodeString(){
		String tempString = "";
		for (BasicNode node: this.basicNodes){
			tempString = tempString + node.getName() + ", ";
		}//end for loop
		return tempString;
	}//end getter

	public String getHeaderNodeString(){
		String tempString = "";
		for (HeaderNode node: this.headerNodes){
			tempString = tempString + node.getName() + ", ";
		}//end for loop
		return tempString;
	}//end getter

	public ArrayList<BasicNode> getBasicNodeList(){
		return this.basicNodes;
	}//end getter

	public ArrayList<HeaderNode> getHeaderNodeList(){
		return this.headerNodes;
	}//end getter

	public void addBasicNode(BasicNode node){
		this.basicNodes.add(node);
	}//end addBasicNode def

	public void addHeaderNode(HeaderNode node){
		this.headerNodes.add(node);
	}//end addHeaderNode def

	public void removeBasicNode(BasicNode node){
		this.basicNodes.remove(node);
	}//end removeBasicNode def

	public void removeHeaderNode(HeaderNode node){
		this.headerNodes.remove(node);
	}//end removeHeaderNode def
}//end class def
