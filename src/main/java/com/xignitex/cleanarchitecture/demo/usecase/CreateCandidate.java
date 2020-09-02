package com.xignitex.cleanarchitecture.demo.usecase;

import com.xignitex.cleanarchitecture.demo.model.Candidate;
import com.xignitex.cleanarchitecture.demo.gateway.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCandidate implements UseCase<String,Candidate> {

    @Autowired
    private CandidateRepository candidateRepository;


    @Override
    public Candidate execute(String request) {
        return new Candidate();
    }
}
