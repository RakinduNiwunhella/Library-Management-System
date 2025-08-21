public class Book {
    private String isbn;  //International Standard Book Number
    private String title;
    private String author;
    private Boolean isAvailable;

//Constructor

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;  //New books are available by default
    }

    //Getters

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    //Setters for changing state
    public void setIsAvailable(Boolean available) {
        isAvailable = available;
    }




    //Books Info Display
    @Override
    public String toString() {
        return "Book{ "+
                "isbn='"+isbn+'\''+
                "title='"+title+'\''+
                "author='"+author+'\''+
                "isAvailable='"+isAvailable+
                '}';


    }


}

