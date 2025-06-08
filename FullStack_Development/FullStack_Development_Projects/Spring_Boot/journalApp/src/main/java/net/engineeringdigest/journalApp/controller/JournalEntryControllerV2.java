package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {
    @Autowired
    private JournalEntryService journalEntryService;

private Map<Long, JournalEntry> journalEntries = new HashMap<>();

@GetMapping
public List<JournalEntry> getAll(){
    return new ArrayList<>(journalEntries.values());
}

@PostMapping
public boolean createEntry(@RequestBody JournalEntry myEntry){
    myEntry.setDate(LocalDateTime.now());
    journalEntryService.saveEntry(myEntry);
    return true;
}


@GetMapping("id/{myId}")
public JournalEntry getJournalEntryById(@PathVariable Long myId){
    return journalEntries.get(myId);
}

@DeleteMapping("id/{myId}")
public JournalEntry deleteJournalEntryById(@PathVariable Long myId){
    return journalEntries.remove(myId);
}

@PutMapping("id/{myId}")
public JournalEntry updateJournalById(@PathVariable Long myId, @RequestBody JournalEntry myEntry){
    return journalEntries.put(myId, myEntry);
}

}
