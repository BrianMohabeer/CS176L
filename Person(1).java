/**
   A person is represented by the name and a birth year.
   You must enter the class name, instance variable(s), and constructor below
*/
class Person{
	String name;
	int birthYear;
	public Person() {
		setName(name);
		setBirthYear(birthYear);
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
		
	
/**
      Returns the string representation of the object.
      @return a string representation of the object
*/
   public String toString()
   {
      return "Person[name=" + name + ",birthYear=" + birthYear + "]";
   }
}