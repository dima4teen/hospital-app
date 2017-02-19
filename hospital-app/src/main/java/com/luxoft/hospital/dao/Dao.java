package com.luxoft.hospital.dao;

import com.luxoft.hospital.patient.Patient;
import com.luxoft.hospital.staff.Doctor;

import java.util.List;

/**
 * Created by Ukropchik on 18.02.2017.
 */
public interface Dao {
    List<Doctor> findAllDoctors();

    Doctor findDoctorById(int id);

    void addPatient(Patient p);

    void updatePatient(Patient p);

    List<Patient> listPatients();

    void removePAtient(int id);
}
