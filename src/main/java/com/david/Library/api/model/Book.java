package com.david.Library.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Random;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String isbn = generateIsbn();

    private String title;

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;

    private Category category;


    //FIXME: this doesn't generate unique values
    private String generateIsbn(){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < 13 ; i++){
            s.append(new Random().nextInt(10));
        }
        return s.toString();
    }

}
