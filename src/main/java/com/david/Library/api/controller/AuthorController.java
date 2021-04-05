package com.david.Library.api.controller;

import com.david.Library.api.model.Author;
import com.david.Library.api.service.AuthorService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController implements AuthorOperations {


    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @Override
    public Author saveAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }
}
