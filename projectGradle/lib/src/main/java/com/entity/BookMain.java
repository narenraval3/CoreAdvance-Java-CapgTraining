package com.entity;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class BookMain {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setBookName("Java");
		b1.setBookAuthor("James");
		
		Book b2 = new Book();
		b2.setBookName("Python");
		b2.setBookAuthor("Ambrose");
		
		Book b3 = new Book();
		b3.setBookName("Capgemini");
		b3.setBookAuthor("Sergey");

		EntityManagerFactory eManFact = Persistence.createEntityManagerFactory("projectGradle");
		EntityManager eManager = eManFact.createEntityManager();
		
		//To persist or insert-------------------------
/*		eManager.getTransaction().begin();
		eManager.persist(b1);
		eManager.persist(b2);
		eManager.persist(b3);
		eManager.getTransaction().commit();*/
		
		//To Retrieve book by Id-------------------------
/*		eManager.getTransaction().begin();
		Book b = eManager.find(Book.class, 12);
		System.out.println("---------Book Name----------"+b.getBookName()+"--------------------");
		eManager.getTransaction().commit();*/
		
		//To Retrieve all the books-------------------------
		eManager.getTransaction().begin();
		TypedQuery<Book> tq = eManager.createQuery("select b from Book b", Book.class);
		List<Book> books =tq.getResultList();
		System.out.println("------Book------ : " +books+"--------"+"Book Size: " +books.size());
		eManager.getTransaction().commit();
		
		//To update the record-------------------------
	/*	Book bok = new Book();
		bok.setBookId(12);
		bok.setBookName("MySQL");
		bok.setBookAuthor("Oracle");
		
		eManager.getTransaction().begin();
		eManager.merge(bok);
		eManager.getTransaction().commit();*/
		
		//To Delete the data-------------------------
/*		eManager.getTransaction().begin();
		eManager.remove(b);
		eManager.getTransaction().commit();*/
		
		//Retrieve the book by name-------------------------
		eManager.getTransaction().begin();
		TypedQuery<Book> tqbook = eManager.createQuery("select book from Book book where book.bookName=:name AND book.bookAuthor=:author", Book.class);
		tqbook.setParameter("name", "Python");
		tqbook.setParameter("author", "Ambrose");
		List<Book> lBook = tqbook.getResultList();
		System.out.println("Book---------- : "+lBook+"-------------Book Size: " +lBook.size());
		eManager.getTransaction().commit();
		
		//To Retrieve all book using native query-------------------------
		eManager.getTransaction().begin();
		javax.persistence.Query qry = eManager.createNativeQuery("select * from book");
		List<Book> bk = qry.getResultList();
		System.out.println("---------List of Books-------------"+bk+"------------------------");
		eManager.getTransaction().commit();
		
		eManager.getTransaction().begin();
		javax.persistence.Query query = eManager.createNativeQuery("select * from book",Book.class);
		List<Book> bks = query.getResultList();
		System.out.println("-----------------------"+bks+"------------------------");
		eManager.getTransaction().commit();
			
		//To Retrieve all books using named query
		eManager.getTransaction().begin();
		javax.persistence.Query qy = eManager.createNamedQuery("getAllBooks");
		List<Book> bookList = qy.getResultList();
		System.out.println("*----------getAllBooks-----------------*"+bookList+"------------------------");
		
		javax.persistence.Query qeyBybName = eManager.createNamedQuery("getBookByName");
		qeyBybName.setParameter("name", "Java");
		Book boookList = (Book) qeyBybName.getSingleResult();
		System.out.println("*-----*-----getBookByName--------*---------*"+boookList+"------------------------");
		eManager.getTransaction().commit();
		
		
	}

}
