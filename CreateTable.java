package Hibernareprogrms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Student")
public class CreateTable {
	@Id
	int Student_id;
	@Column(nullable=false)
	String Name;
	@Column(nullable=false, unique = true)
	Long Phone;
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Long getPhone() {
		return Phone;
	}
	public void setPhone(Long phone) {
		Phone = phone;
	}
	
}

