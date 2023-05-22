package university;

import java.util.ArrayList;
import java.util.List;


public class UniversityManagement {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		List<Department> departments = new ArrayList<>();
		List<Subject> subjects = new ArrayList<>();

		List<Teacher> teachers = new ArrayList<>();

		Classroom classroomMath = new Classroom("B1", 40);
		Classroom classroomPhysics = new Classroom("B2", 50);
		Classroom classroomEnglish = new Classroom("B3", 30);

		Subject mathSubject = new Subject("Mathematics", classroomMath);
		Subject physicsSubject = new Subject("Physics", classroomPhysics);
		Subject englishSubject = new Subject("English", classroomEnglish);

		subjects.add(englishSubject);
		subjects.add(mathSubject);
		subjects.add(physicsSubject);

		Teacher mathTeacher = new Teacher("Tlili", "Sadek", "123456789", "Sadek@example.com", "2022-01-01", 1,
				mathSubject);
		Teacher mathTeacher2 = new Teacher("Tarek", "Kamel", "458976288", "kamel@example.com", "2021-10-11", 2,
				mathSubject);

		Teacher physicsTeacher = new Teacher("Salem", "Hamed", "987654321", "Hamed@example.com", "1998-12-09", 2,
				physicsSubject);

		Teacher englishTeacher = new Teacher("Derouich", "Najwa", "223654321", "Najwa@example.com", "2000-03-12", 2,
				englishSubject);

		mathSubject.addTeacher(mathTeacher);
		mathSubject.addTeacher(mathTeacher2);
		physicsSubject.addTeacher(physicsTeacher);
		englishSubject.addTeacher(englishTeacher);

		teachers.add(englishTeacher);
		teachers.add(physicsTeacher);
		teachers.add(mathTeacher2);
		teachers.add(mathTeacher);

		Department scienceDepartment = new Department("Science Department", mathTeacher);
		scienceDepartment.addTeacher(mathTeacher2);
		scienceDepartment.addTeacher(physicsTeacher);

		Department literatureDepartment = new Department("literature Department", englishTeacher);

		departments.add(scienceDepartment);
		departments.add(literatureDepartment);

		Student student1 = new Student("Ben Salem", "Lina", "58101391", "lina@example.com", 2022);

		student1.addSubjectMark("Mathematics", 18);
		student1.addSubjectMark("Physics", 14);
		student1.addSubjectMark("English", 16);

		Student student2 = new Student("Ben Salem", "Ali", "22652365", "Houssaien@example.com", 2022);

		student2.addSubjectMark("Mathematics", 10);
		student2.addSubjectMark("Physics", 12);
		student2.addSubjectMark("English", 8);

		Student student3 = new Student("Ben Salem", "Yasmin", "94034500", "Yasmin@example.com", 2022);
		student3.addSubjectMark("Mathematics", 18);
		student3.addSubjectMark("Physics", 14);
		student3.addSubject("English");

		Student student4 = new Student("Ben Salem", "Yakin", "97801233", "Yakin@example.com", 2022);
		student4.addSubjectMark("English", 8);
		student4.addSubject("Mathematics");
		student4.addSubject("Physics");

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

		Canteen canteen = new Canteen();
		canteen.addDish("Pasta");
		canteen.addDish("Salad");
		canteen.setDailyMenu("Pasta, Salad");

		// scienceDepartment.inter(students);
		// DisplayAverageMarkBySubject2(students);

		System.out.println(" \n\n\u001B[1m "
				+ " ****************************************************** Departement Info ****************************************************************************************\n");

		for (Department department : departments) {
			department.departmentInfo(department, students); // display the info of each department
		}

		System.out.println(" \n\n\u001B[1m "
				+ " ****************************************************** Subject Info ********************************************************************************************\n");

		student1.DisplayAverageMarkBySubject(students);

		System.out.println(
				"\n ******************************************************* Student Info ********************************************************************************************\n");

		for (Student student : students) {

			student.studentInfo(student); // display the info of each student
		}

		
		
		System.out.println(
				"\n ******************************************************* Update Student Info **************************************************************************************\n");
		
		student1.StudentBasicInfo(student1);
		student1.updateStudentInfo("Naffetti", "Lilia", "98101101", "lilia@gmail.com", 1991);
		student1.StudentBasicInfo(student1);
		
		
		// Display information canteen

		System.out.println(
				"\n **************************************************** Canteen Info ************************************************************************************************\n");
		canteen.canteenInfo(canteen);
		System.out.println("\n");
		// Display information library

		System.out.println(

				" ***************************************************** Library Info ***********************************************************************************************\n");
		Library library = new Library();

		// Adding books to the library
		Book book1 = new Book("The Pragmatic Programmer", "Author 1", "ISBN-1");
		Book book2 = new Book("Python,keras and tensorflow", "Author 2", "ISBN-2");
		library.addBook(book1);
		library.addBook(book2);

		// Searching for a book
		String searchTitle = "The Pragmatic Programmer";
		Book foundBook = library.searchBook(searchTitle);
		if (foundBook != null) {
			System.out.println("	- Book found: " + foundBook.getTitle());
		} else {
			System.out.println("	- Book not found: " + searchTitle);
		}

		// Lending a book
		Book lendBook = book1; // Assume book1 is to be lent
		library.lendBook(lendBook);

		// Returning a book
		Book returnBook = book1; // Assume book1 is to be returned
		library.returnBook(returnBook);
		

		
	}

}
