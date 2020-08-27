package spring.service;

import java.util.List;

import spring.model.Student;

public interface StudentService {
	
	public void createStudent(Student student);
	/*public Student getStudent(Student student);*/
	public List<Student> getAllStudent();
	public Student getSingleStudent(long id);
	public void deleteStudent(long id);
	public void updateStudent(Student student);
	public Student updatePartially(Student student,long id);
	



}
