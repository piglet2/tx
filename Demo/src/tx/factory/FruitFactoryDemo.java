package tx.factory;

import java.lang.reflect.Method;

public class FruitFactoryDemo {

	public static void main(String[] args) {
		Fruit f=FruitFactory.getInstance("tx.factory.Apple");
		f.eat();
		
		try {
			Class<?> cls=Class.forName("tx.factory.Apple");
			System.out.println("!!!!"+cls.getSimpleName());
			Method met[]=cls.getMethods();
			for(int i=0;i<met.length;i++){
				System.out.println(met[i]);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
