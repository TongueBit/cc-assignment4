import java.io.File;
import java.io.FileWriter;
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
			FileWriter fr = new FileWriter(course1);
			fr.write(fs.header  + "\n");
			fr.close();
			File course2 = new File("course2.csv");
			course2.createNewFile();
			fr = new FileWriter(course2);
			fr.write(fs.header  + "\n");
			fr.close();
			File course3 = new File("course3.csv");
			course3.createNewFile();
			fr = new FileWriter(course3);
			fr.write(fs.header  + "\n");
			fr.close();
			
			Arrays.sort(students);
			
			for (Student student: students) {
				
				if (student.getCourse().contains("COMPSCI")) 
					fs.writeFileData(student,"course1.csv"); 
				else if (student.getCourse().contains("APMTH"))
				  fs.writeFileData(student, "course2.csv"); 
				else fs.writeFileData(student,"course3.csv");	 
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}

}
