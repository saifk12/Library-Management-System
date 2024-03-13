// Book.java

package librarySystem;

public class Book {
    private String bookID, title, author, genre;
    private boolean status=true;
 
    Book(String a, String b, String c, String d, boolean e){
       this.bookID = a;
       this.title = b;
       this.author = c;
       this.genre = d;
       this.status = e;
    }
 
    public String getBookID(){
     return bookID;
    }
    public void setBookID(String bookID){
     this.bookID=bookID;
    }
 
    public String getTitle(){
     return title;
    }
    public void setTitle(String title){
     this.title=title;
    }
 
    public String getAuthor(){
     return author;
    }
    public void setAuthor(String author){
     this.author=author;
    }
 
    public String getGenre(){
     return genre;
    }
    public void setGenre(String genre){
     this.genre=genre;
    }
 
    public boolean available(){
     return status;
    }
    public void setStatus(boolean status){
     this.status=status;
    }
 
}
