package conversion;

public class StringToObjectExample1 {

	public static void main(String[] args) throws Exception{
		
		Class c = Class.forName("java.lang.String");
		System.out.println("class name:" +c.getName());
		System.out.println("Suoer class name: "+c.getSuperclass().getName());

	}

}
