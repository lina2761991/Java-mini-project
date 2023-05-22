package university;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private String name;
	private Classroom classroom;
	private List<Teacher> teachers;

	public Subject(String name, Classroom classroom) {
		this.name = name;
		this.classroom = classroom;
		this.teachers = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public void removeTeacher(Teacher teacher) {
		teachers.remove(teacher);
	}

}
