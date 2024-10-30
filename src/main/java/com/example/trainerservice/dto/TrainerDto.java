package com.example.trainerservice.dto;

import java.util.List;

public class TrainerDto {
    private String trainerId;
    private String trainerName;
    private String trainerEmail;
    private String expertise;
    private List<StudentDto> students;

    public TrainerDto() {
    }
    public TrainerDto(String trainerId, String trainerName, String trainerEmail, String expertise, List<StudentDto> students) {
        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.trainerEmail = trainerEmail;
        this.expertise = expertise;
        this.students = students;
    }
    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainerEmail() {
        return trainerEmail;
    }

    public void setTrainerEmail(String trainerEmail) {
        this.trainerEmail = trainerEmail;
    }

    public List<StudentDto> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDto> students) {
        this.students = students;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
}
