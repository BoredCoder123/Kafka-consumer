package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int id;
    private String name;
    private String author;

    @Override
    public String toString(){
        return "id: "+this.id+", name: "+this.name+", author:  "+this.author;
    }
}
