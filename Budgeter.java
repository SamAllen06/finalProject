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
				int i;
				Scanner input = new Scanner(System.in);
				System.out.println("What row would you like to edit?");
				String rowNumberString = input.nextLine();
				try {
					int rowNumber = Integer.parseInt(rowNumberString) - 1;
				} catch (NumberFormatException e){
					System.out.println("Invalid input");
				}//end try
				if (rowNumber <= this.headerList.getHeaderHead().getResults().getBasicNodeListLength()){
					for (HeaderNode node: this.headerList){
						BasicNode tempNode = new BasicNode(this.basicNodeList);
						for (i=0; i<rowNumber; i++){

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
