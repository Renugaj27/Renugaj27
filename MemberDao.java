package JPAHibernate.Dao;


import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import JAPHibernate.Entity.Book;
import JAPHibernate.Entity.Member;




public class MemberDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("LibraryPU");
	EntityManager em=emf.createEntityManager();

	
	public void setMemberValues(int mId, String fname, String lname, String phone) {
		Member m1=new Member();
		m1.setMemberId(mId);
		m1.setFirstName(fname);
		m1.setLastName(lname);
		m1.setPhone(phone);
		
		em.getTransaction().begin();
		em.persist(m1);
		em.getTransaction().commit();
		
		
		System.out.println("Member details are added successfully!");
		
	}


	public void showMembers() {
	
		Query showMem=em.createQuery("SELECT m.memberId,m.firstName FROM Member m");
		List<Object []> member=showMem.getResultList();
		
		for(Object [] obj:member) {
			System.out.println(obj[0]+" "+obj[1]);
		}
		
	}
}




