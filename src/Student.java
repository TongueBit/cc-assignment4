
public class Student implements Comparable<Student>{

	private Integer studentID;
	private String studentName;
	private String course;
	private Integer grade;
	
	public Student(Integer studentID, String studentName, String course, Integer grade) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.course = course;
		this.grade = grade;
	}

	
	public Integer getStudentID() {
		return studentID;
	}
	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	@Override
	public int compareTo(Student that) {
		
		if (this.grade > that.grade)
			return -1;
		else if (this.grade.equals(that.grade))
			return 0;
		else
			return 1;
	}
		
}
