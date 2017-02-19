package com.luxoft.hospital;

import com.luxoft.hospital.dao.Dao;
import com.luxoft.hospital.staff.Doctor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Ukropchik on 19.02.2017.
 */
public class HospitalApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-context.xml");
        Doctor doc = (Doctor) context.getBean("doc");
        System.out.println(doc.getName());

        Dao daoImpl = (Dao) context.getBean("daoImpl");
        List<Doctor> doctorList = daoImpl.findAllDoctors();
      //  System.out.println(Joiner.on("\n").join(doctorList));
        System.out.println(daoImpl.findDoctorById(2));
    }
}
