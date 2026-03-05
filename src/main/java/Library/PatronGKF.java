package Library;

import java.util.ArrayList;
public class PatronGKF {
    
    private String name;
    private ArrayList<String> books;

    public PatronGKF(){
        name = "";
        books = new ArrayList<String>();
    }

    public PatronGKF(String n, ArrayList<String> b){
        name = n;
        books = b;
    }

    public PatronGKF(PatronGKF p){
        this(p.name, p.books);
    }

    //Setters
    public void setName(String n){
        name = n;
    }

    public void setBooks(ArrayList<String> b){
        books = b;
    }

    public void addBook(String t){
        books.add(t);
    }
    
    public void removeBook(String t){
    for (int i = 0; i < books.size(); i++){
        if (books.get(i).strip().toLowerCase().equals(t.strip().toLowerCase())){
            books.remove(i);
            break;
        }
    }
    }

    //Getters
    public String getName(){
        return name;
    }

    public ArrayList<String> getBooks(){
        return books;
    }

    //toString
    public String toString(){
        return "Name: " + name +
        "\nBooks: " + books;
    }
}
