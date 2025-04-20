class Budgeter{
	HeaderLinkedList headerList;
	HeaderNodeList headerNodeList;
	BasicNodeList basicNodeList;

	public void Budgeter(){
		this.headerList = new HeaderLinkedList;
		this.headerNodeList = new HeaderNodeList;
		this.basicNodeList = new BasicNodeList;
	}//end constructor def

	public void setHeaderList(HeaderLinkedList list){
		this.headerList = list;
	}//end setter

	public HeaderLinkedList getHeaderList(){
		return this.headerList;
	}//end getter

	public String menu(){
		String response = "";
		Scanner input = new Scanner(System.in);
		System.out.print("0: Exit \n1: Edit Record \n2: Edit Fund Allocation \n3: Save Budget \n4: Load Budget \n5: Receive an explanation \nEnter your choice: ");
		response = input.nextLine();
		return response;
	}//end menu def

	public void start(){
		String response = menu();
		boolean keepGoing = true;
		
		while (keepGoing){
			if (response.equals("0")){
				keepGoing = false;
				System.out.println("Exiting program");
			} else if (response.equals("1")){
				String response2 = budgetingMenu();
				recordStart(response2);
			} else if (response.equals("2")){
				String response3 = budgetingMenu();
				allocationStart(response3);
			} else if (response.equals("3")){
				String response4 = savingMenu();
				savingStart(response4);
			} else if (response.equals("4")){
				String response5 = loadingMenu();
				loadingStart(response5);
			} else if (response.equals("5")){
				System.out.println("The budgeting system is divided into 2 sections, the Allocation section and the Record section. \nThe Record section is meant to be for recording your purchase history. \nThe Allocation section is set up to be customizable. \nMy recommendation would be to set it up so you input how much you made and make it automatically subtract any monthly costs and multiply the remainder by the percentage you want going to each section. \nThe data is set up in rows and columns. There are three main sections, the Header row, which contains the title of each row, the Results rows, which contain information regarding what to do with the below data, and the Data rows, which will use the values you put in and the rules you have set up. \nInserting a row will put it between two existing rows. Appending a row will add a new row at the very bottom. ");
			} else {
				System.out.println("Error. Enter a valid number");
			}//end if
		}//end while loop
	}//end start def

	public String budgetingMenu(){
		String response = "";
		Scanner input = new Scanner(System.in);
		System.out.print("0: Exit \n1: Insert a new row \n2: Append a new row \n3: Edit past row \n4: Print a row \nEnter your choice: ");
		response = input.nextLine();
		return response;
	}//end budgetingMenu def

	public void recordStart(String response){
		boolean keepGoing = true;

		while (keepGoing){
			if (response.equals("0")){
				keepGoing = false;
				System.out.println("Exiting Record");
			} else if (response.equals("1")){
				Scanner input = new Scanner(System.in);
				System.out.println("Which row would you like to insert at? (This will move that row and all rows below it down one. You cannot insert at row 1) ");
				String rowNumberString = input.nextLine();
				try {
					int rowNumber = Integer.parseInt(rowNumberString) - 1;
				} catch (NumberFormatException e) {
					System.out.println("Not a valid integer");
				if (rowNumber == 0){
					System.out.println("Cannot insert a row here");
				} else if (rowNumber <= this.headerList.getHeaderHead().getResults().getBasicNodeListLength()){
					for (HeaderNode node: this.headerList){
						BasicNode newNode = new BasicNode(this.basicNodeList);
						node.results.insertBasicNode(rowNumber, newNode);
					}//end for loop
				} else if (rowNumber <= this.headerList.getHeaderHead().getResults().getBasicNodeListLength() + this.headerList.getHeaderHead().getData().getBasicNodeListLength()){
					for (HeaderNode node: this.headerList){
						BasicNode newNode = new BasicNode(this.basicNodeList);
						node.data.insertBasicNode(rowNumber, newNode);
					}//end for loop
				} else {
					for (HeaderNode node: this.headerList){
						BasicNode newNode = new BasicNode(this.basicNodeList);
						node.data.addBasicNode(newNode);
					}//end for loop
				}//end if
			} else if (response.equals("2")){
				for (HeaderNode node: this.headerList){
					BasicNode newNode = new BasicNode(this.basicNodeList);
					node.data.addBasicNode(newNode);
				}//end for loop
			} else if (response.equals("3")){
				int rowNum = 0;
				int columnNum = 0;
				Scanner input = new Scanner(System.in);
				System.out.println("What row would you like to edit?");
				String rowNumberString = input.nextLine();
				try {
					int rowNumber = Integer.parseInt(rowNumberString) - 1;
				} catch (NumberFormatException e){
					System.out.println("Invalid input");
				}//end try
				if (rowNumber <= this.headerList.getHeaderHead().getResults().getBasicNodeListLength()){
					
				} else if (rowNumber <= this.headerList.getHeaderHead().getResults().getBasicNodeListLength() + this.headerList.getHeaderHead().getData().getBasicNodeListLength()){
					for (HeaderNode headerNode: this.headerList){
						columnNum += 1;
						for (BasicNode basicNode: headerNode){	
							rowNum += 1;
							if (rowNum == rowNumber){
								System.out.print("Do you want row " + String.valueOf(rowNumber + 1) + ", column " + String.valueOf(columnNum) + " to be (1) an integer, (2) a string, (3) a date, or (4) an integer dependent on other data? )"
								String dataType = input.nextLine();
								if (dataType.equals("1")){
									basicNode.setDataType("int");
								} else if (dataType.equals("2")){
									basicNode.setDataType("String");
								} else if (dataType.equals("3")){
									basicNode.setDataType("Date");
								} else if (dataType.equals("4")){
									basicNode.setDataType("ResultingInt");
								} else {
									System.out.println("Invalid input");
								}// end if
								System.out.print("What is the data that you want " +String.valueOf(rowNumber + 1) + ", column " +String.valueOf(columnNum) + " to be ? (In the case of option 4, put in the row and column numbers of all the cells that you want this cell to use in its calculations in this format: '0x0, 0x1, 0x2, etc'" );
								String data = input.nextLine();
								try {
									basicNode.setNodeData(data);
								} catch (Exception e) {
									System.out.println("Error: " + e.getMessage());
								}//end try
							}//end if
						}//end for loop
					}//end for loop
				}//end if
			} else if {
				response.equals("4"){
					System.out.println("What line would you like to print? ");
					Scanner input = new Scanner(System.in);
					String lineNumString = input.nextLine();
					try {
						int lineNum = String.valueOf(lineNumString);
					} catch (Exception e){
						System.out.println("Invalid input");
					}//end try

			} else{
				System.out.println("Invalid input");
			}//end if 

	}//end recordStart def

	public void allocationStart(String response){

	}//end allocationStart def

	public String savingMenu(){

	}//end savingMenu def

	public void savingStart(String response){

	}//end savingStart def

	public String loadingMenu(){

	}//end loadingMenu def

	public void loadingStart(String response){

	}//end loadingStart def
}//end class def
