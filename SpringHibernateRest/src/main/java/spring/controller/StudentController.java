package spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import spring.model.Student;
import spring.service.StudentService;


//@Controller
@RestController   // since spring 4.0 || @RestController  = @Controller + @ResponseBody
public class StudentController {

	@Autowired StudentService studentService;
	/**
	*create : POST
	*update : PUT
	*delete : delete
	*get    : GET
	*partial : PATCH
	*/
	
	//@ResponseBody    // before spring 4.0
	@PostMapping("/addStudent")   // since spring 4.3   = @RequestMapping(value="" , method=)
   public ResponseEntity<Student> savestudent(@RequestBody Student student)
	{
	   studentService.createStudent(student);
	   return  new ResponseEntity<Student>(student, HttpStatus.CREATED);  // 201
    }
	
	
	@GetMapping("getStudent/{id}")
	public  ResponseEntity<Student> getCountryById(@PathVariable int id) {
		Student student =  studentService.getSingleStudent(id);
		if(student==null){
		return  new ResponseEntity<Student>(student, HttpStatus.NOT_FOUND);	
		}
		return  new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	@GetMapping("listStudent")
	public ResponseEntity<List<Student>> viewdata()
	{
		List<Student> listofStudent =  studentService.getAllStudent();
		if(listofStudent.isEmpty())
		{
			return  new ResponseEntity<List<Student>>( HttpStatus.NO_CONTENT);  // 204
		}
		return  new ResponseEntity<List<Student>>(listofStudent, HttpStatus.OK);	 // 200
	}
	
	@DeleteMapping("deleteStudent/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") long id){
	  Student stu =  studentService.getSingleStudent(id);
	   if(stu==null){
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	      studentService.deleteStudent(id); 
	       return new  ResponseEntity<Void>(HttpStatus.GONE);
   }
  
	@PutMapping("updateStudent")
   public  ResponseEntity<Void>  updateStudent(@RequestBody Student student){
	   Student stu = studentService.getSingleStudent(student.getId());
	   if(stu==null){
	       return new  ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	   }
	   studentService.updateStudent(student);
	      return new ResponseEntity<Void>(HttpStatus.OK);
}
	
	
	
	@PatchMapping("singleupdateStudent/{id}")
   public ResponseEntity<Student>  singleupdateStudent(@PathVariable("id") long id, @RequestBody Student student){
	if(student==null){
		studentService.getSingleStudent(id);
		return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);	
	}
	 Student stu =  studentService.updatePartially(student, id);
	return  new ResponseEntity<Student>(HttpStatus.OK); 
}   
   
}



