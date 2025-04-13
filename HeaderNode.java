class HeaderNode{
	String data;
	Node nextHeader;
	Node previousHeader;
	LinkedList results;
	LinkedList data;

	Node(){
		this.data = "";
		this.nextHeader = null;
		this.previousHeader = null;
		this.results.createList();
		this.data.createList();
	}//end constructor

	public void abstract setNode(String previousNode){

	}	

	public void setNodeData(String data){
		this.data = data;
	}//end setter def

	public String getNodeData(){
		return this.data;
	}//end getter def	
}//end Node class def
