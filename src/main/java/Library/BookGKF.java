package Library;

public class BookGKF{

    private String title;
    private String author;
    private String ISBN;
    private boolean isCheckedOut;

    public BookGKF(){
        title = "";
        author = "";
        ISBN = "";
        isCheckedOut = false;
    }

    public BookGKF(String t, String a, String i, boolean c){
        title = t;
        author = a;
        ISBN = i;
        isCheckedOut = c;
    }

    public BookGKF(BookGKF b){
        this(b.title, b.author, b.ISBN, b.isCheckedOut);
    }

    //Setters
    public void setTitle(String t){
        title = t;
    }
    
    public void setAuthor(String a){
        author = a;
    }

    public void setISBN(String i){
        ISBN = i;
    }

    public void setIsCheckedOut(boolean c){
        isCheckedOut = c;
    }

    //Getters
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getISBN(){
        return ISBN;
    }

    public boolean getIsCheckedOut(){
        return isCheckedOut;
    }

    //toString
    public String toString(){
        return "Book Title: " + title + 
        "\nAuthor: " + author +
        "\nISBN: " + ISBN +
        "\nChecked Out: " + isCheckedOut;
    }

}