class LibraryBook{

    int bookid;
    String title;
    int avilability;

    LibraryBook(int bookid,String title,int avilabiltiy){

        if(bookid<=0){
        throw new IllegalArgumentException("Invalid Book ID");
        }
        if(title==null){
            throw new IllegalArgumentException("Invalid Book Title");
        }
        if(avilabiltiy<=0){
            throw new IllegalArgumentException("Invalid Book Availability");
        }

        this.bookid=bookid;
        this.title=title;
        this.avilability=avilabiltiy;
    }    

    void display(){
        System.out.println("book id: "+bookid+" title is "+title+" avilability is "+avilability);
    }
    }


public class Test2 {
    public static void main(String[] args) {
        LibraryBook b = new LibraryBook(10,"pooja mam special" ,10);
        LibraryBook b1 = new LibraryBook(200, "data science" ,0);
        b.display();
        b1.display();


    }
}
