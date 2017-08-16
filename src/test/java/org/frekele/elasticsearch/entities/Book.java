package org.frekele.elasticsearch.entities;

import org.frekele.elasticsearch.annotations.ElasticDocument;
import org.frekele.elasticsearch.annotations.ElasticField;
import org.frekele.elasticsearch.annotations.ElasticFields;
import org.frekele.elasticsearch.enums.FieldType;

@ElasticDocument("book")
public class Book {

    @ElasticField(type = FieldType.LONG)
    private Long id;

    @ElasticField(type = FieldType.TEXT)
    private String name;

    @ElasticFields(type = FieldType.TEXT, fields = {
        @ElasticField(type = FieldType.KEYWORD)}
    )
    private String description;

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
