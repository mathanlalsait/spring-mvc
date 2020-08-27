package spring.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.dao.StudentDAO;
import spring.model.Student;
import spring.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDAO studentDAO;
	

	public void createStudent(Student student) {
		studentDAO.createStudent(student);
		
		
	}

	/*public Student getStudent(Student student) {
		


		return studentDAO.getStudent(student);
	}*/

	@Override
	public List<Student> getAllStudent() {
		
		return studentDAO.getAllStudent();
	}

	@Override
	public Student getSingleStudent(long id) {
				
		
		return studentDAO.getSingleStudent(id);
	}

	@Override
	public void deleteStudent(long id) {
		studentDAO.deleteStudent(id);
		
	}

	

	@Override
	public void updateStudent(Student student) {
		
		studentDAO.updateStudent(student);
	}

	@Override
	public Student updatePartially(Student student, long id) {
		
		return studentDAO.updatePartially(student, id);
		
	}

	

}
