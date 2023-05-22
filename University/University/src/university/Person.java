package university;

public class Person {
	
	private String surname;
    private String firstName;
    private String phone;
    private String email;

 
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public Person(String surname, String firstName, String phone, String email) {
	        this.surname = surname;
	        this.firstName = firstName;
	        this.phone = phone;
	        this.email = email;
	    }

	@Override
	public String toString() {
		return "Person [surname=" + surname + ", firstName=" + firstName + ", phone=" + phone + ", email=" + email
				+ "]";
	}
    

}
