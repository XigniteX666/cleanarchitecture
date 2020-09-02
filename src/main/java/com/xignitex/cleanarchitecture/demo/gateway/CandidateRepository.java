package com.xignitex.cleanarchitecture.demo.gateway;

import com.xignitex.cleanarchitecture.demo.model.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CandidateRepository extends MongoRepository<Candidate, String> {

    Optional<Candidate> findByEmail(String email);
    List<Candidate> findByExpGreaterThanEqual(double exp);
    List<Candidate> findByExpBetween(double from, double to);
}
