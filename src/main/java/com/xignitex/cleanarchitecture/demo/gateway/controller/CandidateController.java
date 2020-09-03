package com.xignitex.cleanarchitecture.demo.gateway.controller;

import com.xignitex.cleanarchitecture.demo.error.ResourceNotFoundException;
import com.xignitex.cleanarchitecture.demo.model.Candidate;
import com.xignitex.cleanarchitecture.demo.gateway.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidate")
public class CandidateController {


    @Autowired
    private CandidateRepository candidateRepository;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Candidate add(@RequestBody Candidate candidate){
        return candidateRepository.save(candidate);
    }

    @PutMapping(value = "/{id}")
    public Candidate update(@PathVariable String id, @RequestBody Candidate updateCandidate){
        Candidate candidate = candidateRepository.findById(id).orElseThrow(()->new ResourceNotFoundException());
        candidate.setName(updateCandidate.getName());
        candidate.setEmail(updateCandidate.getEmail());
        candidate.setExp(updateCandidate.getExp());
        return candidateRepository.save(candidate);
    }

    @DeleteMapping(value="/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void delete(@PathVariable String id){
        Candidate candidate = candidateRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException());
        candidateRepository.delete(candidate);
    }

    @GetMapping
    public List<Candidate> getAll(){
        return candidateRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public Candidate getOne(@PathVariable String id){
        return candidateRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException());
    }

}
