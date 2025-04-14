class HeaderNode{
	String nodeName;
	String data;
	HeaderNode nextHeader;
	HeaderNode previousHeader;
	LinkedList results;
	LinkedList data;
	NodeList allHeaderNodes;

	HeaderNode(NodeList nodeList){
		this.data = "";
		this.nextHeader = null;
		this.previousHeader = null;
		this.results.createBasicList();
		this.data.createBasicList();
		this.nodeName = "";
		this.allHeaderNodes = nodeList;
		nodeList.addHeaderNode(this);
	}//end constructor

	public void setNode(String nodeName, HeaderNode nextNode, HeaderNode previousNode){
		this.setName(nodeName);
		this.nextHeader = nextNode;
		this.previousHeader = previousNode;
	}//end setter def

	public String getNode(){
		String tempNodeInfo = "Node Name: " + this.getName() + "\nNext Header Node: " + this.nextHeader.getName() + "\nPrevious Header Node: " + this.previousHeader.getName();
		return tempNodeInfo;
	}//end getter def

	public void setName(String nodeName){
		this.nodeName = nodeName;
	}//end setter def

	public String getName(){
		return this.nodeName;
	}//end getter def

	public void setNodeData(String data){
		this.data = data;
	}//end setter def

	public String getNodeData(){
		return this.data;
	}//end getter def
}//end Node class def
