
public class MySingletonClass {
	
	private static MySingletonClass obj;
	
	static{
		obj = new MySingletonClass();
	}
	
	private MySingletonClass(){
		
	}
	
	public static MySingletonClass getInstance(){
		return obj;
	}
	
	public void testSingleton(){
		System.out.println("I am a singleton");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingletonClass s = getInstance();
		s.testSingleton();
		

	}

}
