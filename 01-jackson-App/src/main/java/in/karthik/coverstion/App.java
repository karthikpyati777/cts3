package in.karthik.coverstion;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.karthik.binding.Employee;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		App app=new App();
		app.convertObjectToJson();
		app.convertjsonToObject();

	}

	
	public void convertObjectToJson() throws Exception {
		
		Employee employee=new Employee(101,"karthik","bangalore");
		
		ObjectMapper mapper=new ObjectMapper();
		
		mapper.writeValue(new File("employee.json"), employee);
		
		System.out.println("it is converted from object to json format..!!!!!!");
		
		
		
	}
	
	
	public void convertjsonToObject() throws Exception {
		
		ObjectMapper mapper=new ObjectMapper();
		
		Employee readValue = mapper.readValue(new File("employee.json"), Employee.class);
		
		System.out.println(readValue);
	}
}
