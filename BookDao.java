package JPAHibernate.Dao;


import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import JAPHibernate.Entity.Book;



public class BookDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
	EntityManager em = emf.createEntityManager();

	public void setBookValues(int sNo, String title, String author, double version) {

		Book b1 = new Book();
		b1.setSerialNo(sNo);
		b1.setTitle(title);
		b1.setAuthor(author);
		b1.setEdition(version);
		
		em.getTransaction().begin();
		em.persist(b1);
		em.getTransaction().commit();
		
		System.out.println("Book details are added successfully!");

	}

	public void showBooks() {

		Query showBook = em.createQuery("select b.title,b.author from Book b");
		List<Object[]> book = showBook.getResultList();

		for (Object [] obj : book) {
			System.out.println(obj[0]+" "+obj[1]);
		}

	}

	

	public void searchBooksUsingAuthor(String aname) {
		
		Query showBooks=em.createQuery("SELECT b.title FROM Book b WHERE b.author= :aname");
		showBooks.setParameter("aname", aname);
		List<Book> book=showBooks.getResultList();
		
		for(Object b:book) {
			System.out.println(b);
		}
		
	}
}

