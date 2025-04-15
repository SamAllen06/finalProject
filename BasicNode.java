import java.util.*;

class BasicNode{
	String nodeName;
	String dataType;
	int intData;
	String stringData;
	Date dateData;
	ResultingInt resultData;
	BasicNode nextNode;
	BasicNode previousNode;
	NodeList allBasicNodes;

	BasicNode(NodeList nodeList){
		this.nodeName = "";
		this.dataType = "";
		this.intData = 0;
		this.stringData = "";
		this.dateData = null;
		this.resultData = null;
		this.nextNode = null;
		this.previousNode = null;
		this.allBasicNodes = nodeList;
		nodeList.addBasicNode(this);
	}//end constructor

	public void setName(String nodeName){
		this.nodeName = nodeName;
	}//end setter def

	public String getName(){
		return this.nodeName;
	}//end getter

	public String getNodeInfo(){
		String tempNodeInfo = "Node Name: " + this.getName() + "\nNext Node: " + this.nextNode.getName() + "\nPrevious Node: " + this.previousNode.getName();
		return tempNodeInfo;
	}//end getter def

	public void setDataType(String dataType){
		this.dataType = dataType;
	}//end setter
	
	public String getDataType(){
		return this.dataType;
	}//end getter

	public void setNext(BasicNode node){
		this.nextNode = node;
	}//end setter

	public BasicNode getNext(){
		return this.nextNode;
	}//end getter def
	
	public void setPrevious(BasicNode node){
		this.previousNode = node;
	}//end setter

	public BasicNode getPrevious(){
		return this.previousNode;
	}//end setter def

	public void setNodeData(String data){
		ArrayList<BasicNode> dependenciesList = new ArrayList();
		if (this.dataType.equalsIgnoreCase("int")){
			this.intData = Integer.parseInt(data);
		} else if (this.dataType.equalsIgnoreCase("String")){
			this.stringData = data;
		} else if (this.dataType.equalsIgnoreCase("Date")){
			dateData.setDate(data);
		} else if (this.dataType.equalsIgnoreCase("ResultingInt")){
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
			System.out.println("Error");
		}//end if def
	}//end setter def

	public String getNodeData(){
		if (this.dataType.equalsIgnoreCase("int")){
			return String.valueOf(this.intData);
		} else if (this.dataType.equalsIgnoreCase("String")){
			return this.stringData;
		} else if (this.dataType.equalsIgnoreCase("Date")){
			return this.dateData.getDate();
		} else if (this.dataType.equalsIgnoreCase("ResultingInt")){
			return String.valueOf(this.resultData.getResultingInt());
		} else{
			String error = "Error";
			return error;
		}//end if
	}//end getter def	
}//end Node class def
