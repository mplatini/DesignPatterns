package src;

public class PrintFileImp implements Print {

	String str;
	
	
	PrintFileImp(String str){
		this.str = str;
	}
	
	public String getStr(){
		return this.str;
	}
	
	public void getPrint(){
		
		System.out.println("Imprimindo em arquivo...");
		System.out.println(getStr());
	}
	
	
}//end_class...