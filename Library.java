package librarySystem;

public class Library {
    private int bookSize;
    private static int booksMax = 200;
    private int userSize;
    private static int usersMax = 200;
    private Book[] booksDatabase;
    private User[] usersDatabase;
    private Book[] checkOutBook;
    private Book[] returningBook;

    // Constructor

    Library(){
        booksDatabase = new Book[booksMax];
        bookSize=0;
        usersDatabase = new User[usersMax];
        userSize=0;
        checkOutBook = new Book[booksMax];
        returningBook = new Book[booksMax];
    }


    // Functions to access values of variables
    public int getBookSize(){
        return bookSize;
    }

    public Book getBooksDatabase(int i){
        return booksDatabase[i];
    }


    public Book getCheckoutBook(int j){
        return checkOutBook[j];
    }

    public Book getReturningBook(int j){
        return returningBook[j];
    }


    // Function to add book
    public void addBook(Book book){ 
        if (booksDatabase[bookSize]== null){
            booksDatabase[bookSize] = book;
            bookSize++;
        }
        else
            System.out.println("Book storage is full.");
    }


    // Function to add user
    public void addUser(User user){
        if (usersDatabase[userSize]== null){
            usersDatabase[userSize] = user;
            userSize++;
        }
        else
            System.out.println("User storage is full.");
    }


    // Function to checkout book
    public void outBook(String bookID_b){
       
        for (Book b: booksDatabase){
            if (b!= null && bookID_b==b.getBookID() && b.available()){
                b.setStatus(false);
            }
        }
    }


    // Function to return book
    public void returnBook(Book book){

        for (Book b: booksDatabase){
            if (b!= null && b.getBookID()==book.getBookID() && !b.available()){
                b.setStatus(true);
            }
        }
    }


    // Functions to search books

    public Book searchByBook(String title) {
        for (Book book : booksDatabase) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
            else if (book != null && book.getAuthor().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    public User searchByUser(String find){
        for (User user: usersDatabase){
            if (user != null && user.getUserID().equalsIgnoreCase(find)){
                return user;
            }
        }
        return null;
    }

    // Helper function to check if book exists in returningBook array
    private boolean isPresentInReturning(Book book) {
        for (Book b : returningBook) {
            if (b != null && b.getBookID().equals(book.getBookID())) {
                return true;
            }
        }
        return false;
    }

    public void display(){
        System.out.println("Book(s) found:");
        for (Book book: booksDatabase){
            if (book != null && book.available() && !isPresentInReturning(book)) { // Check if book is not in returningBook
                System.out.println(book.getTitle()+" by "+ book.getAuthor());
            }
        }
    }
    
    
}    

