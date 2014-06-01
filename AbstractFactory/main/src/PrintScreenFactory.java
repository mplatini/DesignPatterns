package src;

public class PrintScreenFactory extends AbstractPrintFactory {

	public Print print(String helloWorld){
		
		return new PrintScreenImp(helloWorld);
	}
	
}//end_class...
