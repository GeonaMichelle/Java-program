package ticketcounter;

public class Stack
{
private Person[] arr;
private int top;
private int capacity;

	    // Constructor 1: Empty stack with given size
	    Stack(int size) {
	        capacity = size;
	        arr = new Person[capacity];
	        top = -1;
	    }

	    // Constructor 2: Initialize stack directly from array
	    Stack(Person[] inputArr) {
	        capacity = inputArr.length;
	        arr = new Person[capacity];
	        top = -1;
	        for (Person p : inputArr) {
	            push(p);
	        }
	    }

	    // Push single Person
	    void push(Person p) {
	        if (top == capacity - 1) {
	            System.out.println("Stack Overflow! Cannot push more Persons.");
	            return;
	        }
	        arr[++top] = p;
	        System.out.println("Pushed:");
	        p.displayPerson();
	    }

	    // Overloaded Push: Push 2 Persons
	    void push(Person p1, Person p2) {
	        push(p1);
	        push(p2);
	    }

	    // Pop single Person
	    Person pop() {
	        if (top == -1) {
	            System.out.println("Stack Underflow! No Persons to pop.");
	            return null;
	        }
	        Person p = arr[top--];
	        System.out.println("Popped:");
	        return p;
	    }

	    // Overloaded Pop: Pop n Persons
	    void pop(int n) {
	        if (n > top + 1) {
	            System.out.println("Stack Underflow! Only " + (top + 1) + " Persons in stack.");
	            return;
	        }
	        System.out.println("Popped Persons:");
	        for (int i = 0; i < n; i++) {
	            Person p = pop();
	            if (p != null)
	                p.displayPerson();
	        }
	    }

	    // Display all Persons
	    void display() {
	        if (top == -1) {
	            System.out.println("Stack is empty.");
	            return;
	        }
	        System.out.println("Stack contents:");
	        for (int i = top; i >= 0; i--) {
	            arr[i].displayPerson();
	        }
	    }

	    // Overloaded Display: Show top n Persons
	    void display(int n) {
	        if (top == -1) {
	            System.out.println("Stack is empty.");
	            return;
	        }
	        if (n > top + 1) {
	            System.out.println("Only " + (top + 1) + " Persons available in stack. Displaying all.");
	            n = top + 1;
	        }
	        System.out.println("Top " + n + " Persons:");
	        for (int i = top; i > top - n; i--) {
	            arr[i].displayPerson();
	        }
	    }
	}

