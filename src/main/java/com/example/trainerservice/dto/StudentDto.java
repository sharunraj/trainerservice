package com.example.trainerservice.dto;

public class StudentDto {
    private String studentId;
    private String name;
    private String trainerId;

    public StudentDto() {

    }
    public StudentDto(String studentId, String name, String trainerId) {
        this.studentId = studentId;
        this.name = name;
        this.trainerId = trainerId;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTrainerId() {
        return trainerId;
    }
    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }
    @Override
    public String toString() {
        return "StudentDto{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", trainerId='" + trainerId + '\'' +
                '}';
    }
}
