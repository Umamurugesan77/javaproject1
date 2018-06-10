public class StudentDetails {
	public void StuDetails(Student stu) {
		System.out.println(stu);
	}
	
	public static void main(String args[]) {
		Student stu=new Student();
		stu.setStudentId(7);
		stu.setFirstName("uma");
		stu.setLastName("M");
		stu.setGender("female");
		stu.setDept("Ece");
		StudentDetails data=new StudentDetails();
		data.StuDetails(stu);
		
	}
		
		
	}

