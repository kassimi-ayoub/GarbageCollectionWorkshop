package garbage.collection;

public class Main {

    public static void main(String[] args) {
	//Iitializing bought books
        Book book1 =  new Book("Alchimiste", "Paulo Coelho");
        Book book2 =  new Book("The power of Habit", "Charles Duhigg");
        book1.show();
        book2.show();
        book1.showNextId();
        book2.showNextId();



        {
            //block dedicated to rent books
            Book book3 =  new Book("Who Moved My Cheese?", "Spencer Johnson");
            Book book4 =  new Book("The 4-Hour Workweek", "Tim Ferriss");
            book3.show();
            book4.show();
            book3.showNextId();
            book4.showNextId();
            book3 = null;
            book4 = null;
            System.gc();
            System.runFinalization();
        }
        System.out.println("=====Check the next Id for aquired books:");
        book1.showNextId();

    }
}
