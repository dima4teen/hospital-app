package com.luxoft.hospital.patient;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Ukropchik on 18.02.2017.
 */
@Entity
@Table(name="PATIENTS")
public class Patient {
    @Id
    private int id;
    private String name;
    private String diagnosis;
    private String email;

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient{" +

                "id=" + id +
                ", name='" + name + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
