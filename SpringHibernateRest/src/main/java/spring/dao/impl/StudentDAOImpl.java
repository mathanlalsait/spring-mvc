package spring.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.dao.StudentDAO;
import spring.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	@Autowired
	SessionFactory sessionFactory;
    
	@Override
	public void createStudent(Student student) {
		Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(student);
			tx.commit();
			session.close();
		
	}
	/*@Override
	public Student getStudent(Student student) {
		Session session = sessionFactory.openSession();
		Criteria criteria = null;
		Student stu = null;
		try {
			criteria = session.createCriteria(Student.class);
			Criterion criterion = Restrictions.eq("Password", student.getPassword());
			
					
			
			criteria.add(criterion);
			

			criteria.setMaxResults(1);
			stu = (Student) criteria.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return stu;
	}
	*/
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAllStudent(){
     
		Session session=sessionFactory.openSession();
		
		List<Student> listStudent = session.createQuery("from Student").list();
		session.close();
		return listStudent;
		
	}
   
	@Override
	public Student getSingleStudent(long id) {
	
		return (Student) sessionFactory.openSession().get(Student.class, id);
	}

	@Override
	public void deleteStudent(long id) {
		Session session = sessionFactory.openSession();
		Student student = (Student) session.load(Student.class,id);
		
		if (null != student) {
            session.delete(student);
       }
		
	}
	@Override
	public void updateStudent(Student student) {
		//Session session = sessionFactory.openSession();
		Session session=sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
		session.update(student);
		System.out.println(student.getUsername());
		//tx.commit();
		//session.close();
	
		
		
	}
	@Override
	public Student updatePartially(Student student, long id) {
		 Session session = sessionFactory.openSession();
		     Student stu = getSingleStudent(id);
			stu.setPassword(student.getPassword());
          return stu;
			
	       
	}
	
	

	



}

	


