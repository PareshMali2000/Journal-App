package org.paresh.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.RestController;

@Document
public class JournalEntry {

    @Id
    private String id;

    private String title;

    private String content;

    public String  getId(){
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(String id) {
        this.id = id;
    }
}
