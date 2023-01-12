import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileService {
	
	public void getFile() {
		try (Scanner scanner = new Scanner(new File("student-master-list.csv"))) {
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

