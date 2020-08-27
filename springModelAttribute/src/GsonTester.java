
import com.google.gson.Gson;  

public class GsonTester { 
   public static void main(String args[]) { 
      Gson gson = new Gson(); 
     
      Address a=new Address();
      a.setCity("Chennai");
      a.setStreet("Shanthi nagar");
      
      Student student = new Student(); 
      student.setAge(10); 
      student.setName("Mahesh"); 
      student.setAdd(a);
      
      
      
      String jsonString = gson.toJson(student);          
      System.out.println(jsonString); 
      
    /*  Student student1 = gson.fromJson(jsonString, Student.class); 
      System.out.println(student1); */
   }   
} 
class Student { 
   private String name; 
   private int age; 
   private Address add;
   
   
   public Address getAdd() {
	return add;
}

public void setAdd(Address add) {
	this.add = add;
}

public Student(){} 
   
   public String getName() { 
      return name; 
   } 
   public void setName(String name) { 
      this.name = name; 
   } 
   public int getAge() { 
      return age; 
   } 
   public void setAge(int age) { 
      this.age = age; 
   } 
   public String toString() { 
      return "Student [ name: "+name+", age: "+ age+ " ]"; 
   }  
}


class Address
{
	String street;
	String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}


