class HeaderNode{
	String nodeName;
	String nodeData;
	HeaderNode nextHeader;
	HeaderNode previousHeader;
	BasicLinkedList results;
	BasicLinkedList data;
	HeaderNodeList allHeaderNodes;

	HeaderNode(HeaderNodeList nodeList){
		this.nodeName = "";
		this.nodeData = "";
		this.nextHeader = null;
		this.previousHeader = null;
		this.results.createBasicList();
		this.data.createBasicList();
		this.nodeName = "";
		this.allHeaderNodes = nodeList;
		nodeList.addNode(this);
	}//end constructor

	public void setName(String nodeName){
		this.nodeName = nodeName;
	}//end setter def

	public String getName(){
		return this.nodeName;
	}//end getter

	public String getNodeInfo(){
		String tempNodeInfo = "Node Name: " + this.getName() + "\nNext Node: " + this.nextHeader.getName() + "\nPrevious Node: " + this.previousHeader.getName();
		return tempNodeInfo;
	}//end getter def

	public void setNext(HeaderNode node){
		this.nextHeader = node;
	}//end setter

	public HeaderNode getNext(){
		return this.nextHeader;
	}//end getter

	public void setPrevious(HeaderNode node){
		this.previousHeader = node;
	}//end setter def
	
	public HeaderNode getPrevious(){
		return this.previousHeader;
	}//end getter
	
	public void setNodeData(String data){
		this.nodeData = data;
	}//end setter def

	public String getNodeData(){
		return this.nodeData;
	}//end getter def

	public BasicLinkedList getData(){
		return this.data;
	}//end getter def

	public BasicLinkedList getResults(){
		return this.results;
	}//end getter

	public void deleteNode(){
		this.getPrevious().setNext(null);
		this.getNext().setPrevious(null);
		this.nextHeader = null;
		this.previousHeader = null;
		this.allHeaderNodes.removeNode(this);
	}//end deleteNode def
}//end Node class def
