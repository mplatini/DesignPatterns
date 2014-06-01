package src;

public class PrintScreenImp implements Print {

	private String str;
	
	
	PrintScreenImp(String str){
		this.str = str;
	}
	
	public String getStr(){
		return this.str;
	}
		
	public void getPrint(){
		
		System.out.println("Imprimindo na tela...");
		System.out.println(getStr());
	}	
	
}//end_class...
