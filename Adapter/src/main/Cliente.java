package main;

public class Cliente {

	public static void main(String [] args){
	
		Adaptee adaptee = new Adaptee();
		Adapter adapter = new Adapter(adaptee);
		
		//apesar de usar "request" que � o que o cliente sabe usar, � chamado "specificRequest()" da nova api...
		adapter.request();
		
	}
}//end_class...
