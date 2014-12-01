
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Library {
    private ArrayList<Book> book;
    
    public Library() {
        this.book = new ArrayList();
    }
    
    public void addBook(Book newBook) {
        this.book.add(newBook);
    }
    
     public void printBooks() {
         for(Book t : this.book){
             System.out.println(t);
         }
     }
     
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> t = new ArrayList<Book>();
        for(Book i: this.book) {
            if(StringUtils.included(i.title(), title)) {
                t.add(i);
            }
        }
        return t;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> t = new ArrayList<Book>();
        for(Book i: this.book) {
            if(StringUtils.included(i.publisher(), publisher)) {
                t.add(i);
            }
        }
        return t;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> t = new ArrayList<Book>();
        for(Book i: this.book) {
            if(i.year() == year) {
                t.add(i);
            }
        }
        return t;
    }
     
     
}
