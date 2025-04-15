public class LinkedList{
//	HeaderNode headerHead;
	BasicNode basicHead;
	NodeList allBasicNodes;

	public void LinkedList(NodeList nodeList){
//		this.headerHead = null;
		this.basicHead = null;
		this.allBasicNodes = nodeList;
	}//end constructor

/*	public void setHeaderHead(HeaderNode node){
		this.headerHead = node;
	}//end setHeaderHead def

	public HeaderNode getHeaderHead(){
		return this.headerHead;
	}//end getter
*/
	public void setBasicHead(BasicNode node){
		this.basicHead = node;
	}//end setBasicHead def

	public BasicNode getBasicHead(){
		return this.basicHead;
	}//end getBasicHead def

	public void createBasicList(){
		this.basicHead = new BasicNode(this.allBasicNodes);
	}//end createBasicList def

/*	public void createHeaderList(){
		this.headerHead = new HeaderNode();
	}//end createHeaderList def
*/
	public void deleteBasicList(BasicNode node){
		while (node.getNext() != null){
			deleteBasicList(node.getNext());
			this.deleteBasicNode(node.getNext());
		}//end while loop
		this.deleteBasicNode(node);
	}//end deleteBasicList def
			
/*	public void deleteHeaderList(HeaderNode node){
		while (node.getNext() != null){
			deleteHeaderList(node.getNext());
			deleteBasicList(node.results.getHead());
			deleteBasicList(node.data.getHead());
			node.getNext.deleteHeaderNode();
		}//end while loop
		node.deleteHeaderNode();
	}//end deleteHeaderList def
*/
	public void deleteBasicNode(BasicNode node){
		node.getPrevious().setNext(node.getNext());
		node.getNext().setPrevious(node.getPrevious());
		node.allBasicNodes.removeBasicNode(node);
	}//end deleteBasicNode def

/*	public void deleteHeaderNode(HeaderNode node){
		node.getPrevious.setNext(node.getNext());
		node.getNext.setPrevious(node.getPrevious());
		node.deleteBasicList(node.getBasicHeader());
		node.allHeaderNodes.removeHeaderNode(node);
	}//end deleteHeaderNode def
*/
	public int getBasicNodeListLength(BasicNode node){
		int length = 0;
		while (node.getNext() != null){
			getBasicNodeListLength(node.getNext());
			length += 1;
		}//end while loop
		return length;
	}//end getBasicNodeListLength def

	public void insertBasicNode(int position, BasicNode node){
		if (position == 1){
			BasicNode tempNode = this.basicHead;
			this.setBasicHead(node);
			node.setNext(tempNode);
			tempNode.setPrevious(node);
		} else{
			int i;
			BasicNode tempNode = this.basicHead;
			for (i = 1; i < position; i +=1){
				if (i+1 == position){
					node.setPrevious(tempNode);
					tempNode = tempNode.getNext();
					node.setNext(tempNode);

					node.getPrevious().setNext(node);
					node.getNext().setPrevious(node);
				} else{
					tempNode = tempNode.getNext();
				}//end if
			}//end for loop
		}//end if
	}//end insertBasicNode def

	public void addBasicNode(BasicNode node){
		BasicNode tempNode = this.basicHead;
		while (tempNode.getNext() != null){
			tempNode = tempNode.getNext();
		}//end whil loop
		tempNode.setNext(node);
		node.setPrevious(tempNode);
	}//end addBasicNode def

	public String getLinkedListString(){
		BasicNode tempNode = this.basicHead;
		String linkedListString = "";
		linkedListString = linkedListString + tempNode.getName() + ": " + tempNode.getNodeData() +"\n";
		while (tempNode.getNext() != null){
			tempNode = tempNode.getNext();
			linkedListString = linkedListString + tempNode.getName() + ": " + tempNode.getNodeData() +"\n";
		}//end while loop
		return linkedListString;
	}//end getArrayListString

	public String getBasicNodeData(int position){
		BasicNode tempNode = this.basicHead;
		String nodeData = "";
		int i;
		for (i = 1; i <= position; i += 1){
			if (i == position){
				 nodeData = tempNode.getDataType() + ": " + tempNode.getNodeData() + "\n";
			} else {
				tempNode = tempNode.getNext();
			}//end if
		}//end for loop
		return nodeData;
	}//end getBasicNodeData
}//end class def
