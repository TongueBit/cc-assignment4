
public class StudentSortApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileService fs = new FileService();
		Student[] student = fs.getFile();
		System.out.println(fs.header);
		for (Student st: student) {
			
			  System.out.println(st.getStudentID());
			  System.out.println(st.getStudentName());
			  System.out.println(st.getCourse());
			  System.out.println(st.getGrade()); 
			 
		}
		
	}

}
