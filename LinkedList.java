public class LinkedList{
	HeaderNode headerHead;
	BasicNode basicHead;

	public void LinkedList(){
		this.headerHead = null;
		this.basicHead = null;
	}//end constructor

	public void setHeaderHead(HeaderNode node){
		this.headerHead = node;
	}//end setHeaderHead def

	public HeaderNode getHeaderHead(){
		return this.headerHead;
	}//end getter

	public void setBasicHead(BasicNode node){
		this.basicHead = node;
	}//end setBasicHead def

	public BasicNode getBasicHead(){
		return this.basicHead;
	}//end getBasicHead def

	public void createBasicList(){
		this.basicHead = new BasicNode;
	}//end createBasicList def

	public void createHeaderList(){
		this.headerHead = new HeaderNode;
	}//end createHeaderList def

	public void deleteBasicList(BasicNode node){
		while (node.getNext() != null){
			deleteBasicList(node.getNext());
			node.getNext.deleteBasicNode();
		}//end while loop
		node.deleteBasicNode();
	}//end deleteBasicList def
			
	public void deleteHeaderList(HeaderNode node){
		while (node.getNext() != null){
			deleteHeaderList(node.getNext());
			deleteBasicList(node.results.getHead());
			deleteBasicList(node.data.getHead());
			node.getNext.deleteHeaderNode();
		}//end while loop
		node.deleteHeaderNode();
	}//end deleteHeaderList def

	public void deleteBasicNode(BasicNode node){
		node.getPrevious.setNext(node.getNext());
		node.getNext.setPrevious(node.getPrevious());
		node.allBasicNodes.removeBasicNode(node);
	}//end deleteBasicNode def

	public void deleteHeaderNode(HeaderNode node){
		node.getPrevious.setNext(node.getNext());
		node.getNext.setPrevious(node.getPrevious());
		node.deleteBasicList(node.getBasicHeader());
		node.allHeaderNodes.removeHeaderNode(node);
	}//end deleteHeaderNode def

	public int getBasicNodeListLength(BasicNode node){
		int length = 0;
		while (node.next != null){
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
			BasicNode tempNode = basicHeader;
			for (i = 1, i < position, i +=1){
				if (i+1 == position){
					node.setPrevious(tempNode)
					tempNode = tempNode.getNext();
					node.setNext(tempNode)

					node.getPrevious.setNext(node);
					node.getNext.setPrevious(node);
				} else{
					tempNode = tempNode.getNext();
				}//end if
			}//end for loop
		}//end if
	}//end insertBasicNode def

	public void addBasicNode(BasicNode node){
		BasicNode tempNode = basicHeader;
		while (tempNode.getNext() != null){
			tempNode = tempNode.getNext();
		}//end whil loop
		tempNode.setNext(node);
		node.setPrevious(tempNode);
	}//end addBasicNode def

	public String getLinkedListString(){
		BasicNode tempNode = basicHeader;
		String linkedListString = "";
		linkedListString = linkedListString + tempNode.getName() + ": " tempNode.getData() +"\n";
		while (tempNode.getNext() != null){
			tempNode = tempNode.getNext();
			linkedListString = linkedListString + tempNode.getName() + ": " tempNode.getData() +"\n";
		}//end while loop
		return linkedListString;
	}//end getArrayListString

	public String getBasicNodeData(int position){
		BasicNode tempNode = basicHeader;
		String nodeData = "";
		for (i = 1, i <= position, i += 1){
			if (i == position){
				 nodeData = tempNode.getDataType() + ": " + tempNode.getData() + "\n";
			} else {
				tempNode = tempNode.getNext();
			}//end if
		}//end for loop
		return nodeData;
	}//end getBasicNodeData
}//end class def
