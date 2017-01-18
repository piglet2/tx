package tx.factory;

public class FruitFactory implements BaseFactory{

	@Override
	public Fruit getFruit(String className) {
		Fruit f=null;
		try {
			f=(Fruit)Class.forName(className).newInstance();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return f;
	}
	
	
	

	public static Fruit getInstance(String className){
		Fruit f=null;
		try {
			f=(Fruit)Class.forName(className).newInstance();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return f;
	}
	
}
