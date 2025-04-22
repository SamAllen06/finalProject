import java.util.*;

class BasicNode{
	int nodeName;
	String dataType;
	int intData;
	String stringData;
	Date dateData;
	ResultingInt resultData;
	BasicNode nextNode;
	BasicNode previousNode;
	BasicNodeList allBasicNodes;
	HeaderNodeList allHeaderNodes;

	public BasicNode(BasicNodeList allBasicNodes, HeaderNodeList allHeaderNodes){
		this.nodeName = 0;
		this.dataType = "";
		this.intData = 0;
		this.stringData = "";
		this.dateData = new Date();
		this.resultData = new ResultingInt();
		this.nextNode = null;
		this.previousNode = null;
		this.allBasicNodes = allBasicNodes;
		this.allHeaderNodes = allHeaderNodes;
		allBasicNodes.addNode(this);
	}//end constructor

	public void setName(int name){
		this.nodeName = name;
	}//end setter def

	public int getName(){
		return this.nodeName;
	}//end getter

	public String getNodeInfo(){
		String tempNodeInfo = "Node Name: " + this.getName() + "\nNext Node: " + String.valueOf(this.nextNode.getName()) + "\nPrevious Node: " + this.previousNode.getName();
		return tempNodeInfo;
	}//end getter def

	public void setDataType(String dataType){
		this.dataType = dataType;
	}//end setter
	
	public String getDataType(){
		return this.dataType;
	}//end getter

	public void setNext(BasicNode node){
		this.nextNode = node;
	}//end setter

	public BasicNode getNext(){
		return this.nextNode;
	}//end getter def
	
	public void setPrevious(BasicNode node){
		this.previousNode = node;
	}//end setter

	public BasicNode getPrevious(){
		return this.previousNode;
	}//end setter def

	public void setNodeData(String data){
		ArrayList<BasicNode> dependenciesList = new ArrayList();
		if (this.dataType.equalsIgnoreCase("int")){
			this.intData = Integer.parseInt(data);
		} else if (this.dataType.equalsIgnoreCase("String")){
			this.stringData = data;
		} else if (this.dataType.equalsIgnoreCase("Date")){
			dateData.setDate(data);
		} else if (this.dataType.equalsIgnoreCase("ResultingInt")){
			try{
				String[] stringDependencies = data.split(", ");
				int[] dependencies = new int[stringDependencies.length];
				int i = 0;
				for (String dependency: stringDependencies){
					dependencies[i] = Integer.parseInt(dependency);
					i++;
				}//end for loop
				i = 0;
				for (i = 0; i <= dependencies.length; i += 2){
					for (HeaderNode headerNode: allHeaderNodes.getNodeList()){
						if (dependencies[i] == headerNode.getName()){
							for (BasicNode basicNode: allBasicNodes.getNodeList()){
								if (dependencies[i+1] == basicNode.getName()){
									dependenciesList.add(basicNode);
								}//end if
							}//end for	
						}//end if
					}//end for loop
				}//end for loop
				resultData.setDependencies(dependenciesList);
				resultData.setResultingInt();
			} catch (Exception e){
				System.out.println("Error parsing dependencies to ints");
			}//end catch
		} else {
			System.out.println("Datatype not set");
		}//end if def
	}//end setter def

	public String getNodeData(){
		if (this.dataType.equalsIgnoreCase("int")){
			return String.valueOf(this.intData);
		} else if (this.dataType.equalsIgnoreCase("String")){
			return this.stringData;
		} else if (this.dataType.equalsIgnoreCase("Date")){
			return this.dateData.getDate();
		} else if (this.dataType.equalsIgnoreCase("ResultingInt")){
			return String.valueOf(this.resultData.getResultingInt());
		} else{
			String error = "Empty";
			return error;
		}//end if
	}//end getter def

	public void deleteNode(){
                this.getPrevious().setNext(null);
                this.getNext().setPrevious(null);
                this.nextNode = null;
                this.previousNode = null;
                this.allBasicNodes.removeNode(this);
        }//end deleteNode def
}//end Node class def
