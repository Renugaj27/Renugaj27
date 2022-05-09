package JAPHibernate.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Member {
	
	
	@ManyToMany
	List <Book> book;	

	@Id
	private int memberId;
	private String firstName;
	private String lastName;
	private String phone;
	
	
	public Member(int memberId, String firstName, String lastName, String phone) 
	{
		super();
		this.memberId = memberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Member [book=" + book + ", memberId=" + memberId + ", firstName=" + firstName + ", LastName=" + lastName
				+ ", phone=" + phone + "]";
	}
	public Member(List<Book> book, int memberId, String firstName, String lastName, String phone) {
		super();
		this.book = book;
		this.memberId = memberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
