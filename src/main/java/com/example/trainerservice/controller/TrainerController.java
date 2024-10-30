package com.example.trainerservice.controller;

import com.example.trainerservice.dto.StudentDto;
import com.example.trainerservice.dto.TrainerDto;
import com.example.trainerservice.model.Trainer;
import com.example.trainerservice.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/trainers")
public class TrainerController {
    @Autowired
    private TrainerService trainerService;

    @PostMapping
    public Trainer createTrainer(@RequestBody Trainer trainer) {
       return trainerService.saveTrainer(trainer);
    }

    @GetMapping("/students/{tid}")
    public List<StudentDto> getStudentsByTrainerId(@PathVariable String tid) {
        return trainerService.getTrainerWithStudents(tid);
    }


    @GetMapping("/{trainerId}")
    public Trainer getTrainerById(@PathVariable String trainerId) {
        return trainerService.getTrainerById(trainerId);
    }


}
