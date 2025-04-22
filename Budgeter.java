import java.util.*;

class Budgeter{
	HeaderLinkedList headerList;
	HeaderNodeList headerNodeList;
	BasicNodeList basicNodeList;

	public Budgeter(){
		this.headerNodeList = new HeaderNodeList();
		this.basicNodeList = new BasicNodeList();
		this.headerList = new HeaderLinkedList(this.basicNodeList, this.headerNodeList);
		start();
	}//end constructor def

	public static void main(String[] args){
		Budgeter budgeter = new Budgeter();
	}//end main

	public void setHeaderList(HeaderLinkedList list){
		this.headerList = list;
	}//end setter

	public HeaderLinkedList getHeaderList(){
		return this.headerList;
	}//end getter

	public String menu(){
		String response = "";
		Scanner input = new Scanner(System.in);
		System.out.print("0: Exit \n1: Edit Budget \n2: Save Budget \n3: Load Budget \n4: Receive an explanation \nEnter your choice: ");
		response = input.nextLine();
		return response;
	}//end menu def

	public void start(){
		boolean keepGoing = true;
		
		while (keepGoing){
			resetNames();

			String response = menu();
			if (response.equals("0")){
				keepGoing = false;
				System.out.println("Exiting program");
			} else if (response.equals("1")){
				budgetingStart();
			} else if (response.equals("2")){
				System.out.println("Saving budget");
				//savingStart();
			} else if (response.equals("3")){
				System.out.println("Loading budget");
				//loadingStart();
			} else if (response.equals("4")){
				System.out.println("The budgeting system is made to be very customizable. I would recommend creating 2 sections in the Header list, the Allocation section and the Record section. \nThe Record section could be for recording your purchase history. \nThe Allocation section could be set up so you input how much you made and make it automatically subtract any monthly costs and multiply the remainder by the percentage you want going to each section. \nThe data is set up in rows and columns. There are three main sections, the Header row, which contains the title of each row, the Results rows, which contain information regarding what to do with the below data, and the Data rows, which will use the values you put in and the rules you have set up. \nInserting a row will put it between two existing rows. Appending a row will add a new row at the very bottom. ");
			} else {
				System.out.println("Error. Enter a valid number");
			}//end if
		}//end while loop
	}//end start def

	public void resetNames(){
		HeaderNode tempHeaderNode = this.headerList.getHeaderHead();
		int i = 1;
		while (tempHeaderNode != null){
			tempHeaderNode.setName(i);
			BasicNode tempBasicNode = tempHeaderNode.getResults().getBasicHead();
			int j = 1;
			while (tempBasicNode != null){
				tempBasicNode.setName(j);
				tempBasicNode = tempBasicNode.getNext();
				j++;
			}//end while loop
			int w = j + 1;
			tempBasicNode = tempHeaderNode.getData().getBasicHead();
			while (tempBasicNode != null){
				tempBasicNode.setName(j);
				tempBasicNode = tempBasicNode.getNext();
				j++;
			}//end while loop
			tempHeaderNode = tempHeaderNode.getNext();
			i++;
		}//end while loop
	}//end resetNames def

	public String budgetingMenu(){
		String response = "";
		Scanner input = new Scanner(System.in);
		System.out.print("0: Exit \n1: Insert a new row \n2: Append a new row \n3: Edit past row \n4: Print a row \n5: Append a new column \n6: Print all rows \nEnter your choice: ");
		response = input.nextLine();
		return response;
	}//end budgetingMenu def

	public void budgetingStart(){
		boolean keepGoing = true;

		while (keepGoing){
			resetNames();
			String response = budgetingMenu();
			if (response.equals("0")){
				keepGoing = false;
				System.out.println("Exiting Record");
			} else if (response.equals("1")){
				Scanner input = new Scanner(System.in);
				System.out.println("Which row would you like to insert at? (This will move that row and all rows below it down one. You cannot insert at row 1) ");
				String rowNumberString = input.nextLine();
				try {
					int rowNumber = Integer.parseInt(rowNumberString) - 1;
					if (rowNumber == 0){
						System.out.println("Cannot insert a row here");
					} else if (rowNumber <= this.headerList.getHeaderHead().getResults().getBasicNodeListLength()){
						for (HeaderNode node: this.headerNodeList.getNodeList()){
							BasicNode newNode = new BasicNode(this.basicNodeList, this.headerNodeList);
							node.results.insertBasicNode(rowNumber, newNode);
						}//end for loop
					} else if (rowNumber <= this.headerList.getHeaderHead().getResults().getBasicNodeListLength() + this.headerList.getHeaderHead().getData().getBasicNodeListLength()){
						for (HeaderNode node: this.headerNodeList.getNodeList()){
							BasicNode newNode = new BasicNode(this.basicNodeList, this.headerNodeList);
							node.data.insertBasicNode(rowNumber, newNode);
						}//end for loop
					} else {
						for (HeaderNode node: this.headerNodeList.getNodeList()){
							BasicNode newNode = new BasicNode(this.basicNodeList, this.headerNodeList);
							node.data.addBasicNode(newNode);
						}//end for loop
					}//end if
				} catch (NumberFormatException e) {
					System.out.println("Not a valid integer");
				}//end try 
			} else if (response.equals("2")){
				for (HeaderNode node: this.headerNodeList.getNodeList()){
					BasicNode newNode = new BasicNode(this.basicNodeList, this.headerNodeList);
					node.data.addBasicNode(newNode);
				}//end for loop
			} else if (response.equals("3")){
				int columnNum = 0;
				Scanner input = new Scanner(System.in);
				System.out.println("What row would you like to edit?");
				String rowNumberString = input.nextLine();
				try {
					int rowNumber = Integer.parseInt(rowNumberString);
//					if (rowNumber <= this.headerList.getHeaderHead().getResults().getBasicNodeListLength()){
//						
//					} else if (rowNumber <= this.headerList.getHeaderHead().getResults().getBasicNodeListLength() + this.headerList.getHeaderHead().getData().getBasicNodeListLength()){
					HeaderNode tempHeaderNode = this.headerList.getHeaderHead();
					while (tempHeaderNode != null){
						//System.out.println("TempHeaderNode isn't null");
						columnNum += 1;
						BasicNode tempBasicNode = tempHeaderNode.getData().getBasicHead();
						while (tempBasicNode != null){	
						//	System.out.println("tempBasicNode isn't null");
						//	System.out.println(String.valueOf(tempBasicNode.getName()) + ", " + String.valueOf(rowNumber));
							if (tempBasicNode.getName() == rowNumber){
						//		System.out.println("tempBasicNode.getName() working");
								System.out.print("Do you want row " + String.valueOf(rowNumber) + ", column " + String.valueOf(columnNum) + " to be (1) an integer, (2) a string, (3) a date, or (4) an integer dependent on other data? If you don't want it to change, just press enter");
								String dataType = input.nextLine();
								if (dataType.equals("1")){
									tempBasicNode.setDataType("int");
								} else if (dataType.equals("2")){
									tempBasicNode.setDataType("String");
								} else if (dataType.equals("3")){
									tempBasicNode.setDataType("Date");
								} else if (dataType.equals("4")){
									tempBasicNode.setDataType("ResultingInt");
								} else if (dataType.equals("")){
									System.out.println("Did not change the existing setting");
								} else {
									System.out.println("Invalid input");
								}// end if
								System.out.print("What is the data that you want " +String.valueOf(rowNumber) + ", column " +String.valueOf(columnNum) + " to be ? (In the case of option 4, put in the row and column numbers of all the cells that you want this cell to use in its calculations in this format: 'row1, column1, row2, column2, etc'" );
								String data = input.nextLine();
								try {
									tempBasicNode.setNodeData(data);
								} catch (Exception e) {
									System.out.println("Error: " + e.getMessage());
								}//end try
							}//end if
							tempBasicNode = tempBasicNode.getNext();
						}//end loop
						tempHeaderNode = tempHeaderNode.getNext();
					}//end loop
//					}//end if
				} catch (NumberFormatException e){
					System.out.println("Invalid input");
				}//end try
			} else if (response.equals("4")){
				System.out.println("What line would you like to print? ");
				Scanner input = new Scanner(System.in);
				String lineNumString = input.nextLine();
				int lineNum = Integer.parseInt(lineNumString);
				printLines(lineNum);
			} else if (response.equals("5")){
				HeaderNode newNode = new HeaderNode(this.basicNodeList, this.headerNodeList);
				this.headerList.addHeaderNode(newNode);
			} else if (response.equals("6")){
				BasicNode tempNode = this.headerList.getHeaderHead().getData().getBasicHead();
				int i = 2;
				while (tempNode != null){
					printLines(i);
					i++;
					tempNode = tempNode.getNext();
				}//end while loop			
			} else {
				System.out.println("Invalid input");
			}//end if 
		}//end while loop


	}//end recordStart def

	public void printLines(int lineNum){
		int j = 0;
		HeaderNode tempNode = this.headerList.getHeaderHead();
		while (tempNode != null){			int w = 0;
			BasicNode tempBasicNode = tempNode.getData().getBasicHead();
			while (tempBasicNode != null){
				//for (w = 0; j < tempNode.getData().getBasicNodeListLength(); w++){
				if (tempBasicNode.getName() == lineNum){
					System.out.print(tempBasicNode.getNodeData() + ", ");
				}//end if
				tempBasicNode = tempBasicNode.getNext();
			}//end loop
			tempNode = tempNode.getNext();
			}//end for loop
		System.out.println();
	}//end printLines def

/*
	public String savingMenu(){
		
	}//end savingMenu def

	public void savingStart(String response){

	}//end savingStart def

	public String loadingMenu(){

	}//end loadingMenu def

	public void loadingStart(String response){

	}//end loadingStart def
*/
}//end class def
