package org.paresh.service;

import org.paresh.entity.JournalEntry;
import org.paresh.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class JournalEntryService{

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }

}
