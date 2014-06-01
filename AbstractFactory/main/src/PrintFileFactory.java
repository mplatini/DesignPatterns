package src;

public class PrintFileFactory extends AbstractPrintFactory {

	public Print print(String HelloWorld){
		
		return new PrintFileImp(HelloWorld);
	}
	
}//end_class...
