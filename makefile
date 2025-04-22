Date.class: Date.java
	javac -g Date.java

ResultingInt.class: ResultingInt.java
	javac -g ResultingInt.java

BasicNode.class: BasicNode.java ResultingInt.class Date.class BasicNodeList.class HeaderNodeList.class
	javac -g BasicNode.java

HeaderNode.class: HeaderNode.java BasicLinkedList.class HeaderNodeList.class
	javac -g HeaderNode.java

HeaderLinkedList.class: HeaderLinkedList.java HeaderNode.class HeaderNodeList.class
	javac -g HeaderLinkedList.java

BasicLinkedList.class: BasicLinkedList.java BasicNode.class BasicNodeList.class HeaderNodeList.class
	javac -g BasicLinkedList.java

HeaderNodeList.class: HeaderNodeList.java 
	javac -g HeaderNodeList.java

BasicNodeList.class: BasicNodeList.java
	javac -g BasicNodeList.java

Budgeter.class: Budgeter.java HeaderLinkedList.class HeaderNodeList.class BasicNodeList.class
	javac -g Budgeter.java

run: Budgeter.class
	java Budgeter

debug: Budgeter.class
	jdb Budgeter

clean: 
	rm *.class
