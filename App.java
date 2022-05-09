package MiniProject;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import JPAHibernate.Dao.BookDao;
import JPAHibernate.Dao.MemberDao;

public class App 
{
	static Scanner sc = new Scanner(System.in);
	static MemberDao mdao = new MemberDao();
	static BookDao bdao = new BookDao();
	
	
	public static void main(String[] args) {

		System.out.println("*************Library Management System***************");
		System.out.println("1.Register a New Member");
		System.out.println("2.Add new Book");
		System.out.println("3.Show all Members");
		System.out.println("4.Show all Books");
		System.out.println("5.Search books by Author Name");
		System.out.println("6.Exit");
		App app = new App();

		do {
			System.out.print("Enter your choice :");
			byte option = sc.nextByte();
			switch (option) {
			case 1:
				app.getMemberDetails();
				break;
			case 2:
				app.getBookDetails();
				break;
			case 3:
				mdao.showMembers();
				break;
			case 4:
				bdao.showBooks();
				break;
			case 5:
				System.out.print("Author name : ");
				String aname = sc.next();
				bdao.searchBooksUsingAuthor(aname);
				break;
			case 6:
				System.exit(0);
			default:
				System.err.println("Please enter 1-5");
				break;
			}

		} while (true);
	}

	private void getBookDetails() {
		System.out.println("****Book Registration****");
		System.out.print("Serial No : ");
		int sNo = sc.nextInt();
		System.out.print("Title : ");
		String title = sc.next();
		System.out.print("Author : ");
		String author = sc.next();
		System.out.print("Edition   : ");
		double edition = sc.nextDouble();
		bdao.setBookValues(sNo, title, author, edition);

	}

	private void getMemberDetails() {

		System.out.println("****Member Registration****");
		System.out.print("Member ID: ");
		int mId = sc.nextInt();
		System.out.print("Fist Name: ");
		String fname = sc.next();
		System.out.print("Last Name: ");
		String lname = sc.next();
		System.out.print("Phone    : ");
		String phone = sc.next();
		mdao.setMemberValues(mId, fname, lname, phone);

	}

    }
