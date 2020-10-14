package singleton;

//our class is final, no one can inherit (extend) it.
public final class Singleton {
	
	//our singleton instance is a constant instead of variable
	private static final Singleton INSTANCE = new Singleton();
	
	//hiding our constructor via private access level
	private Singleton() {}
	
	//finally, getting our unique instance without even instantiation needed. 
	public static Singleton getInstance() {
        return INSTANCE;
    }
}