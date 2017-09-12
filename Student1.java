
import java.util.Date;
import java.util.Scanner;
import java.util.hashset;
import java.util.hashmap;
import java.lang.string;
import java.lang.comparable;
/**
 * Class that stores information about the concrete student
 * 
 * DO NOT REMOVE given methods, but you can add new methods/fields/constructor
 * and change the given methods implementation. For example you can change implementation for equals()
 * or hashCode() method
 * 
 */
public class Student implements Comparable {

	/**
	 * student id
	 */
	private int student.id;

	/**
	 * student name and surname separated by the whitespace for example:
	 * fullName = "David Luis";
	 */
	private String Student.fullName;

	/**
	 * student date of birth in "yyyy-MM-dd" format
	 */
	private Date student.birthDate;

	/**
	 * student average mark
	 */
	private double student.avgMark;

	public student.Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.avgMark = avgMark;
	}

	public int student.getId() {
		Scanner in= new scanner(System.in);
		Id=in.nextInt();
		return id;
	}

	public void Student.setId(int id) {
		this.id = id;
	}

	public String student.getFullName() {
		Scanner in=new scanner(System.in);
		Fullname=in.nextInt();
		return fullName;
	}

	public void Student.setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date Student.getBirthDate() {
		Scanner in=new scanner(System.in);
		BirthDate=in.nextInt();
		return birthDate;
	}

	public void Student.setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double Student.getAvgMark() {
		Scanner in=new scanner(System.in);
		Avgmark=in.nextInt();
		return avgMark;
	}

	public void student.setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}

	@Override
	public int Student.hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean student.equals(Object obj) {
		return super.equals(obj);
	}
	
	
	/**
	 * DO NOT change this method it will be used during the task check
	 */
	@Override
	public int student.compareTo(Object obj) {
		Student other = (Student) obj;
		return (this.fullName.compareTo(other.fullName));
	}
}
