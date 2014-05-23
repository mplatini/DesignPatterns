package main;

import java.util.ArrayList;

public class FlyweightFactory {

	 protected ArrayList<CaracterFlyweight> flyweights;
	 
	 public enum Vogais{
		 A, B, C, D, E;
	 }
	 
	 
	    public FlyweightFactory() {
	        flyweights = new ArrayList<CaracterFlyweight>();
	        flyweights.add(new Caracter("A"));
	        flyweights.add(new Caracter("B"));
	        flyweights.add(new Caracter("C"));
	        flyweights.add(new Caracter("D"));
	        flyweights.add(new Caracter("E"));
	        flyweights.add(new Caracter("*"));
	    }
	 
	    
	    public CaracterFlyweight getFlyweight(Vogais vogal) {
	    	
	    	if(vogal.equals(Vogais.A)) 
	    		return flyweights.get(0);
	    	else if(vogal.equals(Vogais.B))
	    		return flyweights.get(1);
	    	else if(vogal.equals(Vogais.C))
	    		return flyweights.get(2);
	    	else if(vogal.equals(Vogais.D)) 
	    		return flyweights.get(3);
	    	else if(vogal.equals(Vogais.E)) 
	    		return flyweights.get(4);
	    	
	    	return flyweights.get(5);
	    }	
}//end_class...