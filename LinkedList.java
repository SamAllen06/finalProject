public class LinkedList{
	HeaderNode headerHead;
	BasicNode basicHead;

	public void LinkedList(){
		this.headerHead = null;
		this.basicHead = null;
	}//end constructor

	public void getHead(){

	}//end getter

	public void createBasicList(){
		this.basicHead = new BasicNode;
	}//end createBasicList def

	public void createHeaderList(){
		this.headerHead = new HeaderNode;
	}//end createHeaderList def

	public void deleteBasicList(){
		while (basicHead.getNext() != null){
			deleteBasicList(basicHead.getNext());
			basicHead.getNext.deleteNode();
		}//end while loop
		basicHead.deleteNode();
	}//end deleteBasicList def
			
	public void deleteHeaderList(){
		while (headerHead.getNext() != null){
			deleteHeaderList(headerHead.getNext());
			deleteBasicList(headerHead.results.getHead());
			deleteBasicList(headerHead.data.getHead());
			headerHead.getNext.deleteNode();
		}//end while loop
		headerHead.deleteNode();
	}//end deleteHeaderList def
}//end class def
