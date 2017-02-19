package com.luxoft.hospital.service;

import com.luxoft.hospital.patient.Patient;
import com.luxoft.hospital.staff.Doctor;

import java.util.List;

/**
 * Created by Ukropchik on 19.02.2017.
 */
public interface HospitalService {
    List<Doctor> findAllDoctors();

    Doctor findDoctorById(int id);

    void addPatient(Patient p);

    void updatePerson(Patient p);

    List<Patient> listPatients();

    void removePatient(int id);
}
