import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileService {
	
	public Student[] students = new Student[100];
	public String header;
	
	public Student[] getFileData() {
		try (Scanner scanner = new Scanner(new File("student-master-list.csv"))) {
			int i = 0;
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (i == 0)
					header = line;
				//skip the first entry
				if (i!=0) {
					String[] studentInfo = line.split(",");
					Student student = new Student(Integer.valueOf(studentInfo[0]),studentInfo[1],studentInfo[2],Integer.valueOf(studentInfo[3]));
					students[i-1] = student;
				}
				i++;
			}
			return students;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void writeFileData(Student student, String file) {

		try (FileWriter fileWriter = new FileWriter(file, true)) {
			  fileWriter.write(student.getStudentID() + "," + student.getStudentName() + "," +
			  student.getCourse() + "," + student.getGrade() + "\n");
			  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

