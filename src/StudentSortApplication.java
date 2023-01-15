import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class StudentSortApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileService fs = new FileService();
		Student[] students = fs.getFileData();
		try {
			File course1 = new File("course1.csv");
			course1.createNewFile();
			File course2 = new File("course2.csv");
			course2.createNewFile();
			File course3 = new File("course3.csv");
			course3.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Arrays.sort(students);
		System.out.println(fs.header);
		for (Student st: students) {
			
			  System.out.println(st.getStudentID());
			  System.out.println(st.getStudentName());
			  System.out.println(st.getCourse());
			  System.out.println(st.getGrade()); 
			 
		}
		
	}

}
