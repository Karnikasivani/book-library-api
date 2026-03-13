package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NotesController {
    static private List<Notes> contentOfNotes = new ArrayList<>();

    @PostMapping("/display")
    public String display(@RequestBody Notes notes) {
        for(Notes record : contentOfNotes) {
            if(record.getTitle().equals(notes.getTitle())) {
                record.getContent().addAll(notes.getContent());
                return "Another Content Added Successfully";
            }
        }
        contentOfNotes.add(notes);
        return "New title added";
    }

    @GetMapping("/display")
    public List<Notes> displayFunc() {
        return contentOfNotes;
    }

}
