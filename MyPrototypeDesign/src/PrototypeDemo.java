import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Company Name : ");
		String cname = br.readLine();
		
		System.out.println("Enter Company Location : ");
		String clocation = br.readLine();
		
		CompanyDetails c1 = new CompanyDetails(cname, clocation);
		System.out.println("Find below Original records");
		c1.showDetails();
		System.out.println("/n");
		CompanyDetails c2 = (CompanyDetails)c1.getClone();
		System.out.println("Find below Cloned records");
		c2.showDetails();

	}

}
