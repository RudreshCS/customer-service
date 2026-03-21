package com.example.demo.controller;

import com.example.demo.model.Registration;
import com.example.demo.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
@CrossOrigin("*")
public class RegistrationController {

    @Autowired
    private RegistrationService service;

    @PostMapping
    public Registration create(@RequestBody Registration r) {
        return service.save(r);
    }

    @GetMapping
    public List<Registration> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Registration getById(@PathVariable String id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        service.delete(id);
        return "Deleted Successfully";
    }
}