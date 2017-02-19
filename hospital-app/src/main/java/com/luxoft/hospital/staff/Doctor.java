package com.luxoft.hospital.staff;


import javax.persistence.*;

/**
 * Created by Ukropchik on 18.02.2017.
 */
@Entity
@Table(name= "DOCTORS")
public class Doctor {
    @Id
    private int id;
    private String name;
    private String specialization;
    private int workload;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", workload=" + workload +
                ", email='" + email + '\'' +
                '}';
    }
}
