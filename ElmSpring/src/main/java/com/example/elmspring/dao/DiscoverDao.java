package com.example.elmspring.dao;

import com.example.elmspring.model.Discover;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DiscoverDao {
    List<Discover> getAllDiscover();
}
