

public class ArrayListTest {

	 public static void main(String[] args) {  
		 try {
			UserInfo userInfo=(UserInfo)Class.forName("UserInfo").newInstance();
			System.out.println(userInfo.getClass().getName());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
	 
	 }

}
