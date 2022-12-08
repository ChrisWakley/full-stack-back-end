package com.nology.RS3DB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StatsService {
    @Autowired
    StatsRepository statsRepository;

    public StatsService(StatsRepository statsRepository) {
        this.statsRepository = statsRepository;
    }

    // READ

    public Stats getStatsIds(long id) {
        Optional<Stats> stats = statsRepository.findById(id);
        if (stats.isEmpty()) {
            throw new StatsNotFoundException();
        }
        return stats.get();
    }

    public Stats getRandomStats() {
        return statsRepository.getRandomStats();
    }

    public List<Long> getStatsIds() {
        return statsRepository.getDistinctIds();
    }

    public List<String> getTypes() {
        return statsRepository.getDistinctTypes();
    }

    public List<Stats> getStatsByMaterial(String material) {
        return statsRepository.getStatsByMaterial(material);
    }

    public List<Stats> getAllStats(int limit) {
        return statsRepository
                .findAll()
                .stream()
                .limit(limit)
                .collect(Collectors.toList());
    }

    public Object getAllStatsNoLimit() {
        return statsRepository.findAll();
    }

    public List<Stats> getStatsByType(String type) {
        return statsRepository.getAllByType(type);
    }

    public List<Stats> getStatsByName(String name) {
        return statsRepository.getStatsByName(name);
    }

    //CREATE

    public void addStats(Stats stats) {
        statsRepository.save(stats);
    }

    //UPDATE

    public void updateStats(Stats newStats, long id) {
        if (!statsRepository.existsById(id)) {
            throw new StatsNotFoundException();
        }

        newStats.setId(id);

        statsRepository.save(newStats);
    }

    //DELETE

    @Transactional
    public void deleteStatsById(long id) {
        if (!statsRepository.existsById(id)) {
            throw new StatsNotFoundException();
        }

        statsRepository.deleteStatsById(id);
    }

}
