import java.util.*;

public class ResultingInt{
	String operationType;
	ArrayList<BasicNode> dependencies = new ArrayList();
	int resultingInt;

	public ResultingInt(){
		this.operationType = "";
		this.resultingInt = 0;	
	}//end constructor def
	
	public void setOperationType(String operationType){
		this.operationType = operationType;
	}//end setter def

	public String getOperationType(){
		return this.operationType;
	}//end getter def

	public void setDependencies(ArrayList<BasicNode> dependencies){
		this.dependencies = dependencies;
	}//end setter def

	public String getDependencies(){
		String tempString = "";
		for (BasicNode dependency: dependencies){
			tempString = tempString + dependency + ", ";
		}//end for loop
		return tempString;
	}//end getter def

	public void setResultingInt(){
		int tempProduct = 1;
		int tempSum = 0;
		int tempInt = 0;
		int i = 0;
		if (this.operationType.equalsIgnoreCase("multiplication")){
			try{
				for (BasicNode dependency: dependencies){
					tempInt = Integer.parseInt(dependency.getNodeData());
					if (tempInt != 0){
						if (i<2){
							tempProduct = tempProduct * tempInt;
						}//end if
						i +=1;
					}//end if
				}//end for loop
				this.resultingInt = tempProduct;
			} catch(Exception e){
				System.out.println(e);
			}//end try
		} else if (this.operationType.equalsIgnoreCase("addition")){
			try{
				for (BasicNode dependency: dependencies){
					tempInt = Integer.parseInt(dependency.getNodeData());
					tempSum = tempSum + tempInt;
				}//end for looop
				this.resultingInt = tempSum/2;
			}catch(Exception e){
				System.out.println(e);
			}//end try
		} else{
			this.resultingInt = 0;
		}//end if 
	}//end setResultingInt def

	public int getResultingInt(){
		return this.resultingInt;
	}//end getter def
}//end class def
