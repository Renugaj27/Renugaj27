package JAPHibernate.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Book {

	@ManyToMany(mappedBy="book")
	//@JoinColumn(name="memberId")
	List <Member> member;
	
	
	public Book(int serialNo) {
		super();
		SerialNo = serialNo;
	}

	public Book(int serialNo, String title, String author, double edition) {
		super();
		this.SerialNo = serialNo;
		this.title = title;
		this.author = author;
		this.edition = edition;
	}

	public Book(List<Member> member, int serialNo, String title, String author, double edition) {
		super();
		this.member = member;
		this.SerialNo = serialNo;
		this.title = title;
		this.author = author;
		this.edition = edition;
	}
	
	public Book() {
		super();
	
	}

	@Override
	public String toString() {
		return "Book [member=" + member + ", SerialNo=" + SerialNo + ", title=" + title + ", author=" + author
				+ ", edition=" + edition + "]";
	}
	@Id
	private int SerialNo;
	@Column
	private String author;
	@Column
	private double edition;
	@Column
	private String title;
	public List<Member> getMember() {
		return member;
	}
	public void setMember(List<Member> member) {
		this.member = member;
	}
	public int getSerialNo() {
		return SerialNo;
	}
	public void setSerialNo1(int serialNo) {
		this.SerialNo = serialNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getEdition() {
		return edition;
	}
	public void setEdition(double edition) {
		this.edition = edition;
	}

	public void setSerialNo(int sNo) {
		
		
	}
}
