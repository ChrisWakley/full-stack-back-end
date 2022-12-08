package com.nology.RS3DB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatsRepository extends JpaRepository<Stats, Long> {
    //READ

    List<Stats> getAllByType(String type);

    List<Stats> getStatsByName(String name);

    List<Stats> getStatsByMaterial(String material);

    List<Stats> getAllStatsNoLimit();

    @Query(value="SELECT DISTINCT id FROM stats ", nativeQuery = true)
    List<Long> getDistinctIds();

    @Query(value = "SELECT * FROM stats ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Stats getRandomStats();

    @Query(value = "SELECT DISTINCT type FROM stats ", nativeQuery = true)
    List<String> getDistinctTypes();

    // DELETE

    void deleteStatsById(long id);
}