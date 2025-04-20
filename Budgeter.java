class Budgeter{
	HeaderLinkedList headerList;

	public void Budgeter(){
		this.headerList = new HeaderLinkedList;
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
		System.out.print("0: Exit \n1: Edit Record \n2: Edit Fund Allocation \n3: Save Budget \n4: Load Budget \nEnter your choice: ");
		response = input.nextLine();
		return response;
	}//end menu def

	public void start(){
		String response = menu();
		boolean keepGoing = true;
		
		while (keepGoing){
			if (response.equals("0"){
				keepGoing = false;
				System.out.println("Exiting program");
			} else if (response.equals("1"){
				String response2 = budgetingMenu();
				recordStart(response2);
			} else if (response.equals("2"){
				String response3 = budgetingMenu();
				allocationStart(response3);
			} else if (response.equals("3"){
				String response4 = savingMenu();
				savingStart(response4);
			} else if (response.equals("4"){
				String response5 = loadingMenu();
				loadingStart(response5);
			} else {
				System.out.println("Error. Enter a valid number");
			}//end if
		}//end while loop
	}//end start def

	public String budgetingMenu(){
		String response = "";
		Scanner input = new Scanner(System.in);
		System.out.print("0: Exit \n1: Add new row \n2: Edit past row \n3: Print a row \nEnter your choice: ");
		response = input.nextLine();
		return response;
	}//end budgetingMenu def

	public void recordStart(String response){

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
