package main;

public class Adapter extends Target {

	private Adaptee adaptee;
	
	
	//não eh obrigatorio este construtor...
	public Adapter(){
		
	}
	
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	
	//chamando "specificRequeste" a partir de "request".
	public void request(){
		adaptee.specificRequest();
	}
	
	
}//end_class...
