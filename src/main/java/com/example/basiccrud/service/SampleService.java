package com.example.basiccrud.service;

import com.example.basiccrud.entity.Sample;
import com.example.basiccrud.entity.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {
    @Autowired
    private SampleRepository repo;

    public void save(Sample sample){
        repo.save(sample);
    }
    public List<Sample> getAllSamples(){
        return repo.findAll();
    }
    public Sample findById(long id){
        return repo.findById(id).orElse(null);
    }
    public void deleteSampleById(long id){
        repo.deleteById(id);
    }
    public void deleteAllSamples(){
        repo.deleteAll();
    }


}
