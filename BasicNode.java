class BasicNode{
	String nodeName;
	int intData;
	String stringData;
	Date dateData;
	ResultingInt resultData;
	Node nextNode;
	Node previousNode;

	Node(){
		this.nodeName = "";
		this.intData = 0;
		this.stringData = "";
		this.dateData = null;
		this.resultData = null;
		this.nextNode = null;
		this.previousNode = null;
	}//end constructor

	public void setNode(String nodeName, String nextNode, String previousNode){
		this.nodeName.setName(nodeName);
		for (Node node: nodes){
			if (previousNode.equalsIgnoreCase(node.getName())){
				this.previousNode = previousNode;
			} else{
				System.out.println("Could not find a node with given previousNode name. Did not set previousNode");
			} if (nextNode.equalsIgnoreCase(node.getName())){
				this.nextNode = nextNode;
			} else{
				System.out.println("Could not find a node with given nextNode name. Did not set nextNode. ");
			}//end if
		}//end for loop
	}//end setter def

	public String getNode(){
		String tempNodeInfo = "Node Name: " + this.getName + "\nNext Node: " + this.nextNode.getName + "\nPrevious Node: " + this.previousNode.getName;
		return tempNodeInfo;
	}//end getter def
	
	public void setName(String nodeName){
		this.nodeName = nodename;
	}//end setter def

	public String getName(){
		return this.nodeName;
	}//end getter def

	public void setNodeData(String dataType, String data){
		if (dataType.equalsIgnoreCase("int")){
			this.intData = Integer.parseInt(data);
		} else if (dataType.equalsIgnoreCase("String")){
			this.stringData = data;
		} else if (dataType.equalsIgnoreCase("Date")){
			dateData.setDate(data);
		} else if (dataType.equalsIgnoreCase("ResultingInt")){
			resultData.setDependencies(data);
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
