Date.class: Date.java
	javac -g Date.java

ResultingInt.class: ResultingInt.java
	javac -g ResultingInt.java

BasicNode.class: BasicNode.java ResultingInt.class Date.class
	javac -g BasicNode.java

HeaderNode.class: HeaderNode.java BasicNode.class LinkedList.class
	javac -g HeaderNode.java

LinkedList.class: LinkedList.java HeaderNode.class BasicNode.class
	javac -g LinkedList.java

clean: 
	rm *.class

run : 
	java Budgeter
