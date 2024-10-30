package com.example.trainerservice.service;

import com.example.trainerservice.dto.StudentDto;
import com.example.trainerservice.dto.TrainerDto;
import com.example.trainerservice.model.Trainer;
import com.example.trainerservice.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class TrainerService {
    @Autowired
    private TrainerRepository trainerRepository;

    @Autowired
    private WebClient.Builder webClientBuilder;

    public Trainer saveTrainer(Trainer trainer) {
        return trainerRepository.save(trainer);
    }


    public List<StudentDto> getTrainerWithStudents(String trainerId) {
        Trainer trainer = trainerRepository.findById(trainerId)
                .orElseThrow(() -> new RuntimeException("Trainer not found"));

        // Fetch students from the Student Service
         return  webClientBuilder.build()
                .get()
                .uri("http://localhost:9091/api/students/bytrainer/" + trainerId)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<StudentDto>>() {})
                .block();

        // Map Trainer to TrainerDto and set students
    }
    public Trainer getTrainerById(String trainerId) {
        return trainerRepository.findById(trainerId).orElse(null);
    }

}
