class BasicNode{
	int intData;
	String stringData;
	Date dateData;
	ResultingInt resultData;
	Node nextNode;
	Node previousNode;

	Node(){
		this.intData = 0;
		this.stringData = "";
		this.dateData = null;
		this.resultData = null;
		this.nextNode = null;
		this.previousNode = null;
	}//end constructor

	public void abstract setNode(String previousNode){

	}	

	public void setNodeData(String dataType, String data){
		if (dataType.equalsIgnoreCase("int")){
			this.intData = Integer.parseInt(data);
		} else if (dataType.equalsIgnoreCase("String")){
			this.stringData = data;
		} else if (dataType.equalsIgnoreCase("Date")){
			dateData.setDate(data);
		} else if (dataType.equalsIgnoreCase("ResultingInt")){
			resultData.setDependencies(data);
			resultData.setResultingInt();
		} else {
			System.out.println("Wrong dataType passed to setNodeData");
		}//end if def
	}//end setter def

	public String getNodeData(String dataType){
		if (dataType.equalsIgnoreCase("int")){
			return String.valueOf(this.intData);
		} else if (dataType.equalsIgnoreCase("String")){
			return this.stringData;
		} else if (dataType.equalsIgnoreCase("Date")){
			return this.dateData.getDate();
		} else if (dataType.equalsIgnoreCase("ResultingInt")){
			return String.valueOf(this.resultData.getResultingInt());
		} else{
			String error = "Incorrect dataType passed to getNodeData";
			return error;
		}//end if
	}//end getter def	
}//end Node class def
