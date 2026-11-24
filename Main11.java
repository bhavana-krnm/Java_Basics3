class Book{
    int bookId;
    String title;
    String author;

    Book(int bookId,String title){
        this(bookId,title,"Unknown Author");
    }

    Book(int bookId,String title,String author){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
    }

    void displayBook(){
        System.out.println("Book Id:" +bookId);
        System.out.println("Title:" +title);
        System.out.println("Author:" +author);
    }
}

public class Main11{
    public static void main(String[] args){
        Book b1=new Book(1021, "Java");
        Book b2=new Book(2102, "BootStrap", "Cherry");
        b1.displayBook();
        b2.displayBook();
    }
}