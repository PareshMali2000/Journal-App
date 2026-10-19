package org.paresh.controller;

import org.paresh.entity.JournalEntry;
import org.paresh.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class JournalEntryController {


    private Map<Long,JournalEntry> entry = new HashMap();
    @Autowired
    private JournalEntryService journalEntryService;
    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(entry.values());
    }

@PostMapping
public boolean createEntry(@RequestBody JournalEntry myEntry){
    //entry.put(myEntry.getId(),myEntry);
    journalEntryService.saveEntry(myEntry);
    return true;
}

@GetMapping("id/{myId}")
    public JournalEntry getEntry(@PathVariable("myId") long myId){
       return entry.get(myId);
}

@PutMapping("id/{myId}")
public JournalEntry updateById(@PathVariable("myId") long myId, JournalEntry myentry){
        return entry.put(myId,myentry);
}


}
