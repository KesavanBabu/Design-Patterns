
public class CompanyDetails implements MyPrototypeInterface{

	
	private String name;
	private String location;
	
	public CompanyDetails(){
		
	}
	
	public CompanyDetails(String name, String location){
		this();
		this.name= name;
		this.location = location;
		
	}
	
	public void showDetails(){
		System.out.println(name+"\t"+location);
	}
	@Override
	public MyPrototypeInterface getClone() {
		// TODO Auto-generated method stub
		return new CompanyDetails(name, location);
	}
	
	

}
