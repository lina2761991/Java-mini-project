package university;

import java.util.List;

public class Teacher extends Person{
	
	
	    private String dateOfTakingOffice;
	    private int index;
	    private Subject subject; // each teacher has only one subject
	    
	    
	    
	    
	    
	    public String getDateOfTakingOffice() {
			return dateOfTakingOffice;
		}



		public void setDateOfTakingOffice(String dateOfTakingOffice) {
			this.dateOfTakingOffice = dateOfTakingOffice;
		}



		public int getIndex() {
			return index;
		}




		public void setIndex(int index) {
			this.index = index;
		}




		public Subject getSubject() {
			return subject;
		}




		public void setSubject(Subject subject) {
			this.subject = subject;
		}



		


		public Teacher(String surname, String firstName, String phone, String email, String dateOfTakingOffice, int index, Subject subject) {
	        super(surname, firstName, phone, email);
	        this.dateOfTakingOffice = dateOfTakingOffice;
	        this.index = index;
	        this.subject = subject;
	    }



		@Override
		public String toString() {
			return "Teacher [dateOfTakingOffice=" + dateOfTakingOffice + ", index=" + index + ", subject=" + subject
					+ "]";
		}



		 static Teacher getTeacherBySubjectName(String subjectName,List<Teacher> teachers) {
		        // Iterate over your list of teachers and find the teacher associated with the subject name
		        for (Teacher teacher : teachers) {
		            if (teacher.getSubject().equals(subjectName)) {
		                return teacher;
		            }
		        }
		        return null; // Return null if teacher is not found for the subject name
		    }




}
