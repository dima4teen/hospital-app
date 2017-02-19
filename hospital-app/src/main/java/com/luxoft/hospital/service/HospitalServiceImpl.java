package com.luxoft.hospital.service;

import com.luxoft.hospital.dao.Dao;
import com.luxoft.hospital.patient.Patient;
import com.luxoft.hospital.staff.Doctor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ukropchik on 19.02.2017.
 */
@Service
public class HospitalServiceImpl implements HospitalService {

    private Dao dao;

    public HospitalServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    @Transactional
    public void addPatient(Patient p) {
        this.dao.addPatient(p);
    }

    @Override
    @Transactional
    public void updatePerson(Patient p) {
        this.dao.updatePatient(p);
    }

    @Override
    public List<Patient> listPatients() {
        return null;
    }

    @Override
    public void removePatient(int id) {

    }

    @Override
    public List<Doctor> findAllDoctors() {
        return null;
    }

    @Override
    public Doctor findDoctorById(int id) {
        return null;
    }

}
