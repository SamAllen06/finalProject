public class HeaderLinkedList{
	HeaderNode headerHead;
	HeaderNodeList allHeaderNodes;

	public HeaderLinkedList(BasicNodeList allBasicNodes, HeaderNodeList allHeaderNodes){
		this.allHeaderNodes = allHeaderNodes;
		this.headerHead = new HeaderNode(allBasicNodes, allHeaderNodes);
	}//end constructor

	public void setNames(){
		this.headerHead.setName(1);
		HeaderNode tempNode = this.headerHead;
		int i;
		for (i = 2; i <= getListLength(); i++){
			tempNode.getNext().setName(i);
			tempNode = tempNode.getNext();
		}//end for loop
	}//end setNames

	public int getListLength(){
		int i = 1;
		HeaderNode tempNode = this.headerHead;
		boolean keepGoing = true;
		while (keepGoing){
			tempNode = tempNode.getNext();
			if (tempNode == null){
				keepGoing = false;
			} else {
				i++;
			}//end if
		}//end while loop
		return i;
	}//end getListLength

	public void addHeaderNode(HeaderNode node){
		HeaderNode tempNode = this.headerHead;
		while (tempNode.getNext() != null){
			tempNode = tempNode.getNext();
		}//end whil loop
		tempNode.setNext(node);
		node.setPrevious(tempNode);
	}//end addBasicNode def

	public void setHeaderHead(HeaderNode node){
		this.headerHead = node;
	}//end setter def

	public HeaderNode getHeaderHead(){
		return this.headerHead;
	}//end getter
/*
	public void createHeaderList(){
		this.headerHead = new HeaderNode(this.allHeaderNodes);
	}//end creator def
*/
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
