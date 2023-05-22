package university;

import java.util.List;
import java.util.ArrayList;

public class Department {

	private String name;
	private Teacher headTeacher; // department has just one head teacher
	private List<Teacher> teachers; // department has multiple teachers

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getHeadTeacher() {
		return headTeacher;
	}

	public void setHeadTeacher(Teacher headTeacher) {
		this.headTeacher = headTeacher;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public Department(String name, Teacher headTeacher) {
		this.name = name;
		this.headTeacher = headTeacher;
		this.teachers = new ArrayList<>();
		this.teachers.add(headTeacher);
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public void removeTeacher(Teacher teacher) {
		teachers.remove(teacher);
	}

	public List<String> getSubjectsByDepartment(Department department) {
		List<String> departmentSubjects = new ArrayList<>();
		for (Teacher teacher : department.getTeachers()) {

			departmentSubjects.add(teacher.getSubject().getName());
		}
		return departmentSubjects;
	}

	public void departmentInfo(Department department, List<Student> students) {
		System.out.println("---------------------------------------------------- 	Department: " + department.getName()
				+ " 	-------------------------------------------------------------------------  ");

		System.out.println("	Head Teacher: " + department.getHeadTeacher().getFirstName() + " "
				+ department.getHeadTeacher().getSurname());

		System.out.println("	Teachers in the department:	");
		for (Teacher teacher : department.getTeachers()) {
			System.out.println("	- Teacher: " + teacher.getFirstName() + " " + teacher.getSurname()
					+ "        Subject:" + teacher.getSubject().getName() + "      Classroom: "
					+ teacher.getSubject().getClassroom().getName() + " 	 Phone: " + teacher.getPhone() + " 	Email: "
					+ teacher.getEmail() + " 	Date of Taking: " + teacher.getDateOfTakingOffice());
		}
		System.out.println(" ");
		System.out.println("	- Average of the Department :");
		

		List<String> departmentSubjects = getSubjectsByDepartment(department);
		double sum = 0.0;
		int count = 0;
		for (String subj : departmentSubjects) {

			Student student = new Student(null, null, null, null, 0);

			double a = student.DisplayAverageMarkByDepartment(students, subj);
			sum = sum + a;
			count = count + 1;

		}
		System.out.println("				       "+Math.round((sum / count) * 100.0) / 100.0);
		System.out.println(" ");

	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", headTeacher=" + headTeacher + ", teachers=" + teachers + "]";
	}

}
