public class HeaderLinkedList{
	HeaderNode headerHead;
	HeaderNodeList allHeaderNodes;

	public void HeaderLinkedList(HeaderNodeList nodeList){
		this.headerHead = null;
		this.allHeaderNodes = nodeList;
	}//end constructor

	public void setHeaderHead(HeaderNode node){
		this.headerHead = node;
	}//end setter def

	public HeaderNode getHeaderHead(){
		return this.headerHead;
	}//end getter

	public void createHeaderList(){
		this.headerHead = new HeaderNode(this.allHeaderNodes);
	}//end creator def

	public void deleteHeaderList(HeaderNode node){
                while (node != null){
                        deleteBasicList(node.getResults().getBasicHead());
                        deleteBasicList(node.getData().getBasicHead());
			
			HeaderNode tempNode = node.getNext();
			
			node.deleteNode();
			node = tempNode;
                }//end while loop
        }//end deleteHeaderList def
	
	public void deleteBasicList(BasicNode node){
		while (node != null){
			BasicNode tempNode = node.getNext();

			node.deleteNode();
			node = tempNode;
		}//end while loop
	}//end deleteBasicList def
}//end class def
