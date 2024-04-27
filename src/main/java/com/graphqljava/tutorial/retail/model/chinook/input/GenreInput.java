package com.graphqljava.tutorial.retail.model.chinook.input;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GenreInput {
    private Integer GenreId;
    private String Name;
    private int limit;
}
