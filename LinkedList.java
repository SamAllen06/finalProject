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

	public void insertBasicNode(String place, BasicNode node){
		String[] stringPosition = place.split("x");
		ArrayList<int> position = new ArrayList();
		for (String string: stringPosition){
			int tempInt = Integer.parseInt(string);
			position.add(tempInt);
		}//end for loop
		 for (i = 0, i < position[1], i += 1){

	}//end insertBasicNode

	public void insertBasicNode(int place, BasicNode node){
		BasicNode tempNode = basicHeader.getNext();
		for (i = 0, i < position, i +=1){
			tempNode = tempNode.getNext();
		}//end for loop

	}//end class def
