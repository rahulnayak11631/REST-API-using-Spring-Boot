package com.example.rest_api_spring_boot.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest_api_spring_boot.Controllers.Services.BookService;
import com.example.rest_api_spring_boot.Entities.Book;



@RestController
public class BookController {
    
    // @RequestMapping(value = "/book",method = RequestMethod.GET)
    // @GetMapping("/book")
    //     public String Display_Msg() {
    //     return "Hello , This is a REST API Demo app!";
    // }

    // @GetMapping("book")
    // public Book Display_Books() {
    //     Book book = new Book();
    //     book.setId(1);
    //     book.setBook_Name("Harry Potter and the Sorcer's Stone");
    //     book.setAuthor("J.K. Rowling");
    //     return book;
        
    // }
    @Autowired
    private BookService bookservice;

    @GetMapping("/books")
    public List<Book> get_Books() {
        return this.bookservice.get_allBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id) {
        return this.bookservice.get_book_by_id(id);
    }
    
    @PostMapping("/books")
    public Book add_Book(@RequestBody Book b) {        
        Book book = this.bookservice.addBook(b);
        return book;
    }

    @DeleteMapping("/books/{id}")
    public void del_book(@PathVariable("id") int id)
    {
        this.bookservice.del_book(id);
    }

    @PutMapping("books/{id}")
    public Book update_book(@PathVariable("id") int id, @RequestBody Book book) {
        
        this.bookservice.update_book_details(book,id);        
        return book;
    }
    
    
}
