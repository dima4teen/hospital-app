package com.luxoft.hospital.dao;

import com.luxoft.hospital.patient.Patient;
import com.luxoft.hospital.staff.Doctor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ukropchik on 18.02.2017.
 */
@Repository
public class DaoImpl implements Dao {

    private JdbcTemplate jdbcTemplate;
    private SessionFactory sessionFactory;

    public DaoImpl(JdbcTemplate jdbcTemplate, SessionFactory sessionFactory) {
        this.jdbcTemplate = jdbcTemplate;
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addPatient(Patient p) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(p);
    }

    @Override
    public void updatePatient(Patient p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(p);
    }

    @Override
    public List<Patient> listPatients() {

        return null;
    }

    @Override
    public void removePAtient(int id) {

    }

    @Override
    public Doctor findDoctorById(int id) {
        String sql = "SELECT * FROM doctors WHERE id = ?";
        Doctor doc = jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Doctor>(Doctor.class));
        return doc;
    }

    @Override
    public List<Doctor> findAllDoctors() {
        String sql = "SELECT * FROM doctors";
        List<Doctor> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Doctor>(Doctor.class));
        return result;
    }
}

