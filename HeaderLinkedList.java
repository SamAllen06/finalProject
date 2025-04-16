public class HeaderLinkedList{
	HeaderNode headerHead;
	NodeList allHeaderNodes;

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
		this.headerHead = new HeaderNode();
	}//end creator def

	public void deleteHeaderList(HeaderNode node){
                while (node.getNext() != null){
                        deleteBasicList(node.results.getHead());
                        deleteBasicList(node.data.getHead());
                        deleteHeaderList(node.getNext());
                        node.getNext.deleteHeaderNode();
                }//end while loop
                node.deleteHeaderNode();
        }//end deleteHeaderList def
