package com.example.basiccrud.controller;

import com.example.basiccrud.entity.Sample;
import com.example.basiccrud.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private SampleService service;

    @PostMapping("/save")
    public void saveTask(@RequestBody Sample sample){
        service.save(sample);
        System.out.println("Sample saved successfully");
    }
    @GetMapping("/find/{id}")
    public Sample findById(@PathVariable long id){
        return service.findById(id);
    }
    @GetMapping("/all")
    public List<Sample> getAllTasks(){
        return service.getAllSamples();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteTaskById(@PathVariable long id){
        service.deleteSampleById(id);
    }
    @DeleteMapping("/all")
    public void deleteAllTasks(){
        service.deleteAllSamples();
    }
}
