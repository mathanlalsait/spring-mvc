package spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentList")
public class Student {
	
		@Id
		@Column(name = "Id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		
		private long id;
		
		@Column(name = "username")
		private String username;
		
		@Column(name = "password")
		private String password;
		
		@Column(name = "cpassword")
		private String cpassword;
		
		@Column(name = "gender")
		private String gender;
		
		@Column(name = "qualification")
		private String qualification;
		
		@Column(name = "email")
		private String email;
		
		@Column(name = "mobileno")
		private String mobileno;

		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getCpassword() {
			return cpassword;
		}


		public void setCpassword(String cpassword) {
			this.cpassword = cpassword;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getQualification() {
			return qualification;
		}


		public void setQualification(String qualification) {
			this.qualification = qualification;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getMobileno() {
			return mobileno;
		}


		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
		}
		
	

	}



