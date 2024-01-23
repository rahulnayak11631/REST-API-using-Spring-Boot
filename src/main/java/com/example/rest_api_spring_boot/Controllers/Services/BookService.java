package com.example.rest_api_spring_boot.Controllers.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest_api_spring_boot.Entities.Book;
import com.example.rest_api_spring_boot.dao.BookRepository;

@Service
public class BookService {
    //  private static List<Book> book_list = new ArrayList<>() ;

    // static{
    //     book_list.add(new Book(1,"Harry Potter and The Sorcer's Stone","J.K.Rowling"));
    //     book_list.add(new Book(2,"Harry Potter and The Goblet of Fire","J.K.Rowling"));
    //     book_list.add(new Book(3,"Harry Potter and The Chamber of Secret","J.K.Rowling"));
    //     book_list.add(new Book(4,"Harry Potter and The Deathly Hallows","J.K.Rowling"));

    // }
    
    @Autowired
    private BookRepository bookrepository;

    public List<Book> get_allBooks()
    {
        List<Book> book_list = (List<Book>)this.bookrepository.findAll();
        return book_list;
    }

    public Book get_book_by_id(int id)
    {  
        // Book book = null;
    //    book = book_list.stream().filter(b-> b.getId()==id).findFirst().get();
    //    return book;
            return this.bookrepository.findById(id);
    }

    public Book addBook(Book b)
    {
        // book_list.add(b);
        // return b;
        Book book = this.bookrepository.save(b);
        return book;

    }

    public void del_book(int id)
    {
        // book_list = book_list.stream().filter(b-> b.getId()!= id).collect(Collectors.toList());
        this.bookrepository.deleteById(id);

    }

    public void update_book_details(Book book, int id)
    {
    //     book_list = book_list.stream().map(b->{
    //         if(b.getId()==id)
    //         {
    //             b.setAuthor(book.getAuthor());
    //             b.setBook_Name(book.getBook_Name());
    //         }return b;

    //     }).collect(Collectors.toList());
        book.setId(id);
        this.bookrepository.save(book);

    }
}
