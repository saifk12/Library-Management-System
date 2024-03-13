//User.java

package librarySystem;

public class User {
    private String userID, name, contactInfo;
    private int borrowedBooks;

    User(String userID, String name, String contactInfo, int borrowedBooks){
        this.userID=userID;
        this.name=name;
        this.contactInfo=contactInfo;
        this.borrowedBooks=borrowedBooks;
    }

    public String getUserID(){
        return userID;
       }
       public void setUserID(String userID){
        this.userID=userID;
       }
    
       public String getName(){
        return name;
       }
       public void setName(String name){
        this.name=name;
       }
    
       public String getContactInfo(){
        return contactInfo;
       }
       public void setContactInfo(String contactInfo){
        this.contactInfo=contactInfo;
       }
    
       public int getBorrowedBooks(){
        return borrowedBooks;
       }
       public void setBorrowedBooks(int borrowedBooks){
        this.borrowedBooks=borrowedBooks;
       }
}


