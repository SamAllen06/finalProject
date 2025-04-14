import java.util.*;

class BasicNode{
	String nodeName;
	int intData;
	String stringData;
	Date dateData;
	ResultingInt resultData;
	BasicNode nextNode;
	BasicNode previousNode;
	NodeList allBasicNodes;

	BasicNode(NodeList nodeList){
		this.nodeName = "";
		this.intData = 0;
		this.stringData = "";
		this.dateData = null;
		this.resultData = null;
		this.nextNode = null;
		this.previousNode = null;
		this.allBasicNodes = nodeList;
		nodeList.addBasicNode(this);
	}//end constructor

	public void setNode(String nodeName, BasicNode nextNode, BasicNode previousNode){
		this.setName(nodeName);
		this.nextNode = nextNode;
		this.previousNode = previousNode;
	}//end setter def

	public String getNode(){
		String tempNodeInfo = "Node Name: " + this.getName() + "\nNext Node: " + this.nextNode.getName() + "\nPrevious Node: " + this.previousNode.getName();
		return tempNodeInfo;
	}//end getter def

	public BasicNode getNext(){
		return this.nextNode();
	}//end getter def
	
	public void setName(String nodeName){
		this.nodeName = nodeName;
	}//end setter def

	public String getName(){
		return this.nodeName;
	}//end getter def

	public void setNodeData(String dataType, String data){
		ArrayList<BasicNode> dependenciesList = new ArrayList();
		if (dataType.equalsIgnoreCase("int")){
			this.intData = Integer.parseInt(data);
		} else if (dataType.equalsIgnoreCase("String")){
			this.stringData = data;
		} else if (dataType.equalsIgnoreCase("Date")){
			dateData.setDate(data);
		} else if (dataType.equalsIgnoreCase("ResultingInt")){
			String[] dependencies = data.split(", ");
			for (String dependency: dependencies){
				for (BasicNode node: allBasicNodes.getBasicNodeList()){
					if (dependency.equalsIgnoreCase(node.getName())){
						dependenciesList.add(node);
					}//end if
				}//end for loop
			}//end for loop
			resultData.setDependencies(dependenciesList);
			resultData.setResultingInt();
		} else {
			System.out.println("Wrong dataType passed to setNodeData");
		}//end if def
	}//end setter def

	public String getNodeData(String dataType){
		if (dataType.equalsIgnoreCase("int")){
			return String.valueOf(this.intData);
		} else if (dataType.equalsIgnoreCase("String")){
			return this.stringData;
		} else if (dataType.equalsIgnoreCase("Date")){
			return this.dateData.getDate();
		} else if (dataType.equalsIgnoreCase("ResultingInt")){
			return String.valueOf(this.resultData.getResultingInt());
		} else{
			String error = "Incorrect dataType passed to getNodeData";
			return error;
		}//end if
	}//end getter def	
}//end Node class def
