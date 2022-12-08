package com.nology.RS3DB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@CrossOrigin
public class StatsController {

    @Autowired
    StatsService statsService;
    @Autowired
    private StatsRepository statsRepository;

    @ExceptionHandler
    public ResponseEntity<String> handleExceptions(StatsNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }


    // READ

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello World!");
    }

    @GetMapping("/stats")
    public ResponseEntity<List<Stats>> getStats(@RequestParam(defaultValue = "30") int limit) {
        return ResponseEntity.status(HttpStatus.OK).body(statsService.getAllStats(limit));
    }

    @GetMapping("stats/all")
    public ResponseEntity<Object> getAllStatsNoLimit() {
        return ResponseEntity.status(HttpStatus.OK).body(statsService.getAllStatsNoLimit());
    }

    @GetMapping("/stats/ids")
    public ResponseEntity<List<Long>> getStatsIds() {
        return ResponseEntity.status(HttpStatus.OK).body(statsService.getStatsIds());
    }

    @GetMapping("/stats/{type}")
    public ResponseEntity<List<Stats>> getStatsByType(@PathVariable String type) {
        return ResponseEntity.status(HttpStatus.OK).body(statsService.getStatsByType(type));
    }

    @GetMapping("/stats/random")
    public ResponseEntity<Stats> getRandomStats() {
        return ResponseEntity.status(HttpStatus.OK).body(statsService.getRandomStats());
    }

    @GetMapping("/stats/gear/{name}")
    public ResponseEntity <List<Stats>> getStatsByName(@PathVariable String name) {
        return ResponseEntity.status(HttpStatus.OK).body(statsService.getStatsByName(name));
    }

    @GetMapping("/stats/material/{material}")
    public ResponseEntity <List<Stats>> getStatsByMaterial(@PathVariable String material) {
        return ResponseEntity.status(HttpStatus.OK).body(statsService.getStatsByMaterial(material));
    }

    //CREATE

    @PostMapping("/stat")
    public ResponseEntity<Stats> createStat(@RequestBody Stats stats) {
        statsService.addStats(stats);
        return ResponseEntity.status(HttpStatus.CREATED).body(stats);
    }

    // UPDATE

    @PutMapping("/greeting/{id}")
    public ResponseEntity<Stats> updateStats(@RequestBody Stats newStats, @PathVariable long id) {
        newStats.setId(id);
        statsService.updateStats(newStats, id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(newStats);
    }

    //DELETE

    @DeleteMapping("/stats/{id}")
    @Transactional
    public ResponseEntity<String> deleteStatsById(long id) {
        statsService.deleteStatsById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Deleted Greeting");
    }
}
