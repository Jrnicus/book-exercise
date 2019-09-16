/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Steve Cate)
 * @version (9/16/2019)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        courseText = bookCourseText;
    }
    /**
     * Method to get the author of the book
     */
    public String getAuthor()
    {
        return author;
    }
    /**
     * Method to get the title of the book
     */
    public String getTitle()
    {
        return title;
    }
    /**
     * Method to print the author of the book
     */
    public void printAuthor()
    {
        System.out.println("The author of the book is " + author);
    }
    /**
     * Method to print the title of the book
     */
    public void printTitle()
    {
        System.out.println("The title of the book is " + title);
    }
    /**
     * Method to get the number of pages in the book
     */
    public int getPages()
    {
        return pages;
    }
    /**
     * This method will print the details about the book
     * The following details about the book will be printed
     * Author, title, number of pages, refrence number,
     * and how many times a book has been barrowed
     */
    public void printDetails()
    {
        System.out.println("These are the details for the book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Barrowed: " + borrowed);
        
        if(refNumber.length() > 0){        
            System.out.println("Refrence Number: " + refNumber);
        }
        else{
            System.out.println("ZZZ");
        }
    }
    /**
     * This method will allow us to enter a refrence number
     * for the book.
     * The refrence number must be atleast 3 charecters long
     */
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3){
            refNumber = ref;
        }
        else{
            System.out.println("Error the refrence number must" +
            "be atleast 3 charecters long");
        }
    }
    /**
     * This method will get the refrence number for the book
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    /**
     * This method will add one to barrowed each time
     * a book gets barrowed to keep track of how many total 
     * time this book has been barrowed
     */
    public void borrow()
    {
        borrowed++;
    }
    /**
     * This method will return how many times a book
     * has been barrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    /**
     * This method will retuern if the book is
     * a text book or not
     */
    public boolean isCourseText()
    {
        return courseText;
    }
    
        
    // Add the methods her
}