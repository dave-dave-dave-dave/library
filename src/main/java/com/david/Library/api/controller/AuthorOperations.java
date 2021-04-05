package com.david.Library.api.controller;

import com.david.Library.api.model.Author;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/library")
public interface AuthorOperations {

    @PostMapping("/author")
    Author saveAuthor(@RequestBody Author author);

}
