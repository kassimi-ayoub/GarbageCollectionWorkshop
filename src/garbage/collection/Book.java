package garbage.collection;

public class Book {

    private int ID;

    private String name;

    private String author;

    private static int nextID = 1;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.ID = nextID++;
    }

    public void show()
    {
        System.out.println("Id=" + ID + "\nName=" + name
                + "\nAuthor=" + author);
    }
    public void showNextId()
    {
        System.out.println("Next Book id will be="
                + nextID);
    }

    //If you want to see what happens without garbage collection try to comment this mehod
    protected void finalize(){
        nextID--;
    }
}

