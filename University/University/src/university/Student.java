package university;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Student extends Person {

	private int yearOfEntry;

	private Map<String, Integer> subjectMarks; // Subject and corresponding mark

	public int getYearOfEntry() {
		return yearOfEntry;
	}

	public void setYearOfEntry(int yearOfEntry) {
		this.yearOfEntry = yearOfEntry;
	}

	public Student(String surname, String firstName, String phone, String email, int yearOfEntry) {
		super(surname, firstName, phone, email);
		this.yearOfEntry = yearOfEntry;
		this.subjectMarks = new HashMap<>();

	}

	public Map<String, Integer> getSubjectMarks() {
		return subjectMarks;
	}

	public void setSubjectMarks(Map<String, Integer> subjectMarks) {
		this.subjectMarks = subjectMarks;
	}

	public Student(String firtName, String surname, String phone, String email, int yearOfEntry,
			Map<String, Integer> subjectMarks) {
		super(firtName, surname, phone, email);
		this.yearOfEntry = yearOfEntry;
		this.subjectMarks = subjectMarks;
	}

	public void addSubjectMark(String subject, int mark) {
		subjectMarks.put(subject, mark);
	}

	public void addSubject(String subject) {

		subjectMarks.put(subject, null);

	}
	
	public void StudentBasicInfo(Student student) {
		System.out.println("---------------------------------------------------- " + student.getFirstName() + " "
				+ student.getSurname()
				+ " 	------------------------------------------------------------------------------------------  ");

		System.out.println("	- Phone: " + student.getPhone() + "  Email: " + student.getEmail() + " 	Year Of Entry: "
				+ student.getYearOfEntry());
    }
	
	public void updateStudentInfo(String surname, String firstName, String phone, String email, int yearOfEntry) {
        setSurname(surname);
        setFirstName(firstName);
        setPhone(phone);
        setEmail(email);
        setYearOfEntry(yearOfEntry);
    }
	

	public void studentInfo(Student student) {
		System.out.println("---------------------------------------------------- " + student.getFirstName() + " "
				+ student.getSurname()
				+ " 	------------------------------------------------------------------------------------------  ");

		System.out.println("	- Phone: " + student.getPhone() + "  Email: " + student.getEmail() + " 	Year Of Entry: "
				+ student.getYearOfEntry());
		System.out.println("	- Marked Subjects:");

		for (Map.Entry<String, Integer> entry : student.getSubjectMarks().entrySet()) {
			String subject = entry.getKey();

			Integer mark = entry.getValue();
			if (mark != null) {
				System.out.println("		 	      " + subject + ": " + mark);
			}

		}
		System.out.println("");
		System.out.println("  	 - The genral average  is : " + student.calculateAverageStudent() + "\n");

		// for unmarked subjects
		System.out.println("	- Unmarked Subjects:");

		int count = 0; // count the number of unmarked subjects

		for (Map.Entry<String, Integer> entry : student.getSubjectMarks().entrySet()) {

			String subject = entry.getKey();

			Integer mark = entry.getValue();
			if (mark == null) {

				System.out.println("		 	      " + subject);
				count = count + 1;
			}

		}
		if (count == 0) {
			System.out.println("                             None");
		}

		System.out.println(" \n");
	}

	public double calculateAverageStudent() {
		double sum = 0;

		for (Integer mark : subjectMarks.values()) {
			if (mark != null) {
				sum += mark;
			}

		}

		return subjectMarks.size() > 0 ? Math.round(sum / subjectMarks.size() * 100.0) / 100.0 : 0; // to render of the
																									// round
	}

	public static Map<String, Double> calculateAverageMarksBySubject(List<Student> students) {
		Map<String, List<Integer>> subjectMarksMap = new HashMap<>();

		// Iterate students and their subject marks
		for (Student student : students) {
			Map<String, Integer> subjectMarks = student.getSubjectMarks();

			// Iterate each subject mark
			for (Map.Entry<String, Integer> entry : subjectMarks.entrySet()) {
				String subject = entry.getKey();
				Integer mark = entry.getValue();

				if (mark != null) {
					// Check if the subject is already present in the subject marks map
					if (subjectMarksMap.containsKey(subject)) {
						// If the subject is present, add the mark to the existing list
						List<Integer> marksList = subjectMarksMap.get(subject);
						marksList.add(mark);
					} else {
						// If the subject is not present, create a new list and add the mark
						List<Integer> marksList = new ArrayList<>();
						marksList.add(mark);
						subjectMarksMap.put(subject, marksList);
					}
				}
			}
		}

		// Calculate the average for each subject
		Map<String, Double> averageMarksBySubject = new HashMap<>();

		for (Map.Entry<String, List<Integer>> entry : subjectMarksMap.entrySet()) {
			String subject = entry.getKey();
			List<Integer> marksList = entry.getValue();

			if (!marksList.isEmpty()) {
				double sum = 0;
				int count = 0;

				for (Integer mark : marksList) {
					sum += mark;
					count++;
				}

				double average = sum / count;
				averageMarksBySubject.put(subject, average);
			}
		}

		return averageMarksBySubject;
	}

	public void DisplayAverageMarkBySubject(List<Student> students) {

		Map<String, Double> averageMarksBySubject = calculateAverageMarksBySubject(students);

		for (Map.Entry<String, Double> entry : averageMarksBySubject.entrySet()) {
			String subject = entry.getKey();
			Double average = entry.getValue();
			System.out.println("---------------------------------------------------------- Subject: " + subject
					+ " 	---------------------------------------------------------------------------------- ");

			System.out.println("	 - Average Mark: " + Math.round(average * 100.0) / 100.0);
		}

	}

	public double DisplayAverageMarkByDepartment(List<Student> students, String subj) {

		double k = 0.0;

		Map<String, Double> averageMarksBySubject = calculateAverageMarksBySubject(students);

		for (Map.Entry<String, Double> entry : averageMarksBySubject.entrySet()) {
			String subject = entry.getKey();
			Double average = entry.getValue();

			if (subject.equals(subj)) {

				k = Math.round(average * 100.0) / 100.0;

			}
		}
		return k;

	}

	@Override
	public String toString() {
		return "Student [yearOfEntry=" + yearOfEntry + ", subjectMarks=" + subjectMarks + "]";
	}

}