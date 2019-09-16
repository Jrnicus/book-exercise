/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
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
     * Author, title, and number of pages
     */
    public void printDetails()
    {
        System.out.println("These are the details for the book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
    
        
    // Add the methods her
}