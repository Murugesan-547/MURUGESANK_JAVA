package project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProjectSerializer {
	ArrayList<Employee> elist1 = new ArrayList<>();
	ArrayList<Employee> elist2 = new ArrayList<>();
	ArrayList<Employee> elist3 = new ArrayList<>();

	Map<Project, ArrayList<Employee>> projectMap1 = new LinkedHashMap<>();
	Map<Project, ArrayList<Employee>> projectMap2 = new LinkedHashMap<>();
	Map<Project, ArrayList<Employee>> projectMap3 = new LinkedHashMap<>();

	synchronized public void serializeProjectDetails(Map<Project, ArrayList<Employee>> projectMap1) throws IOException {
		try {
			FileOutputStream fileOut = new FileOutputStream(
					"file1.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(projectMap1);
			out.close();
			fileOut.close();
			System.out.println("Serialized Map of Project Successfully...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}