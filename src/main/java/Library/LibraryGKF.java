package Library;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class LibraryGKF {
    
    private ArrayList<BookGKF> books;
    private ArrayList<PatronGKF> patrons;

    public LibraryGKF(){
        books = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    public LibraryGKF(ArrayList<BookGKF> b, ArrayList<PatronGKF> p){
        books = b;
        patrons = p;

    }

    public LibraryGKF(LibraryGKF l){
        this(l.books, l.patrons);
    }

    //Getters
    public ArrayList<BookGKF> getBooks(){
        return books;
    }

    public ArrayList<PatronGKF> getPatrons(){
        return patrons;
    }

    //Setters
    public void setBooks(ArrayList<BookGKF> b){
        books = b;
    }

    public void setPatrons(ArrayList<PatronGKF> p){
        patrons = p;
    }

    //Methods
    public void printBooks(){
        for (int i = 0; i<books.size(); i++){
            System.out.println(books.get(i).toString() + "\n");
        }
    }

    public void printPatrons(){
        for (int i = 0;i<patrons.size();i++){
            System.out.println(patrons.get(i).toString() + "\n");
        }
    }

    public void addBook(BookGKF b){
        books.add(b);
    }

    public void removeBook(BookGKF b){
        if (b.getIsCheckedOut() == true){
            for (int i = 0; i<patrons.size(); i++){
                for (int k = 0; k<patrons.get(i).getBooks().size(); k++){
                    if (patrons.get(i).getBooks().get(k).equals(b.getTitle())){
                        this.returnBook(patrons.get(i).getBooks().get(k), patrons.get(i).getName());
                    }
                }
            }
        }
        books.remove(b);
    }

    public void addPatron(PatronGKF p){
        patrons.add(p);
    }

    public void removePatron(String p){
        String patronName = "";
        for (int i = 0; i<patrons.size(); i++){
            if (patrons.get(i).getName().strip().toLowerCase().equals(p.strip().toLowerCase())){
                patronName = patrons.get(i).getName();
                for (int k = 0; k<patrons.get(i).getBooks().size(); k++){
                    this.returnBook(patrons.get(i).getBooks().get(k), patrons.get(i).getName());
                }
                patrons.remove(i);
                break;
            }
        }
        if (patronName.equals("")){
            System.out.println("Invalid Patron Name");
        }
        
    }

    public void checkOutBook(String t, String p){
        t = t.strip().toLowerCase();
        p = p.strip().toLowerCase();
        String book = "";
        for (int i = 0; i<books.size(); i++){
            if (books.get(i).getTitle().strip().toLowerCase().equals(t) && books.get(i).getIsCheckedOut() == false){
                books.get(i).setIsCheckedOut(true);
                book = books.get(i).getTitle();
                break;
            }
        }
        if (book.equals("")){
            System.out.println("\nInvalid Book Title or Book is already checked out\n");
        }
        else {
            for (int k = 0; k<patrons.size(); k++){
                if (patrons.get(k).getName().strip().toLowerCase().equals(p)){
                patrons.get(k).addBook(book);
                break;
                }
                else if (k == patrons.size()){
                    System.out.println("Invalid Patron");
                }
        }
        }
    }

    public void returnBook(String t, String p){
        p = p.strip().toLowerCase();
        t = t.strip().toLowerCase();
        String patron = "";
        for (int i = 0; i<patrons.size();i++){
            if (patrons.get(i).getName().strip().toLowerCase().equals(p)){
                patron = patrons.get(i).getName().strip().toLowerCase();
                patrons.get(i).removeBook(t);
                break;
            }
        }
        if (patron.equals("")){
            System.out.println("Invalid Patron");
        }
        else{
            for (int k = 0; k<books.size();k++){
                if (books.get(k).getTitle().strip().toLowerCase().equals(t)){
                    books.get(k).setIsCheckedOut(false);
                    break;
                }
            }
        }
    }

    public static void main(String[] args){
        String bookName = "";
        String bookAuthor = "";
        String bookISBN = "";

        LibraryGKF lib = new LibraryGKF();
        Scanner sc = new Scanner(System.in);
        boolean stopped = false;

        while(!stopped){
            System.out.println("1. Add a Patron");
            System.out.println("2. Remove a Patron");
            System.out.println("3. Add a Book");
            System.out.println("4. Add a File of Books");
            System.out.println("5. Remove a Book");
            System.out.println("6. Check out a Book");
            System.out.println("7. Return a Book");
            System.out.println("8. Show Library");
            System.out.println("9. Clear Library");
            System.out.println("10. Quit");
            System.out.println("What would you like to do?: ");

            switch (sc.nextLine().strip().toLowerCase()){
                case "1","add a patron":
                    System.out.println("Name?: ");
                    lib.addPatron(new PatronGKF());
                    lib.getPatrons().get(lib.getPatrons().size()-1).setName(sc.nextLine());
                    break;
                case "2","remove a patron":
                    System.out.println("Name?: ");
                    lib.removePatron(sc.nextLine());
                    break;
                case "3","add a book":
                    System.out.println("Book Name?: ");
                    bookName = sc.nextLine();
                    System.out.println("Book Author?: ");
                    bookAuthor = sc.nextLine();
                    System.out.println("Book ISBN?: ");
                    bookISBN = sc.nextLine();
                    lib.addBook(new BookGKF(bookName, bookAuthor, bookISBN, false));
                    bookName = "";
                    bookAuthor = "";
                    bookISBN = "";
                    break;
                case "4", "add a file of books":
                    try {
                    System.out.println("Give a file Path: ");
                    File f = new File(sc.nextLine());
                    Scanner scan = new Scanner(f);
                    while (scan.hasNext()){
                        String line = scan.nextLine();
                        String[] data = line.split(",");
                        lib.addBook(new BookGKF(data[0].strip(), data[1].strip(), data[2].strip(), false));
                    }
                }
                catch (IOException e){
                    System.out.println("Invalid File");
                }
                    break;
                case "5","remove a book":
                    System.out.print("Book Name?: ");
                    bookName = sc.nextLine();
                    System.out.print("Book Author?: ");
                    bookAuthor = sc.nextLine();
                    System.out.print("Book ISBN?: ");
                    bookISBN = sc.nextLine();
                    for (int i = 0; i<lib.getBooks().size(); i++){
                        if (lib.getBooks().get(i).getTitle().strip().toLowerCase().equals(bookName.strip().toLowerCase()) && lib.getBooks().get(i).getAuthor().strip().toLowerCase().equals(bookAuthor.strip().toLowerCase()) && lib.getBooks().get(i).getISBN().strip().equals(bookISBN.strip())){
                            lib.removeBook(lib.getBooks().get(i));
                        }
                        else if (i == lib.getBooks().size()){
                            System.out.println("Invalid Book");
                        }
                    }
                    bookName = "";
                    bookAuthor = "";
                    bookISBN = "";
                    break;
                case "6","check out a book":
                    System.out.println("Book Title?: ");
                    bookName = sc.nextLine();
                    System.out.println("Patron?: ");
                    lib.checkOutBook(bookName, sc.nextLine());
                    bookName = "";
                    break;
                case "7","return a book":
                    System.out.println("Book Title?: ");
                    bookName = sc.nextLine();
                    System.out.println("Patron?: ");
                    lib.returnBook(bookName, sc.nextLine());
                    bookName = "";
                    break;
                case "8","show library":
                    System.out.println("\n");
                    System.out.println("Patrons:");
                    for (int p = 0; p<lib.getPatrons().size(); p++){
                        System.out.println(lib.getPatrons().get(p).toString());
                        System.out.println("");
                    }
                    System.out.println("\n");
                    System.out.println("Books: ");
                    for (int b = 0; b<lib.getBooks().size(); b++){
                        System.out.println(lib.getBooks().get(b).toString());
                        System.out.println("");
                    }
                    System.out.println("\n");
                    break;
                case "9","clear library":
                    lib.getBooks().clear();
                    lib.getPatrons().clear();
                    break;
                case "10","quit":
                    stopped = true;
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;



            }
        }

        

    }
}

