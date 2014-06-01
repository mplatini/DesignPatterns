package src;

import java.util.Scanner;

public class PrintFactoryTest {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		AbstractPrintFactory factory = null;
		String type = null; //file...
		String helloWorld= null;
		
		
		System.out.println("Choose your output (screen ou file): ");
		type = input.nextLine();
		
		
		while(!(type.equals("screen")) && !(type.equals("file"))){
			System.out.println("Wrong Answer! Type again, Bitch! ");
			type = input.nextLine();	
		}
		
		
		if(type.equals("screen"))
			factory = new PrintScreenFactory();
		else
			factory = new PrintFileFactory();
	
		System.out.println("Type a text...");
		helloWorld = input.nextLine();		
		
		Print print = factory.print(helloWorld);
		print.getPrint();
	}
	
}//end_class...