package main;

import main.FlyweightFactory.Vogais;

public class Test {

	public static void main(String[] args) {
		
		FlyweightFactory factory = new FlyweightFactory();
		
		 
	    factory.getFlyweight(Vogais.A).desenharCaracter(new Ponto(10, 10));
		
	}

}//end_class...
