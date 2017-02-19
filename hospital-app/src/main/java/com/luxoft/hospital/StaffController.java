package com.luxoft.hospital;

import com.luxoft.hospital.patient.Patient;
import com.luxoft.hospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ukropchik on 18.02.2017.
 */
@Controller
public class StaffController {

    @Autowired
    @Qualifier(value = "hospitalService")
    private HospitalService hospitalService;

    @RequestMapping(value = "/patients", method = RequestMethod.GET)
    public String listPatients(Model model) {
        model.addAttribute("patient", new Patient());
        model.addAttribute("listPatients", this.hospitalService.listPatients());
        return "patient";
    }

    //For add and update person both
    @RequestMapping(value = "/patient/add", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("patients") Patient p) {

        if (p.getId() == 0) {
            //new person, add it
            this.hospitalService.addPatient(p);
        } else {
            //existing person, call update
            this.hospitalService.updatePerson(p);
        }

        return "redirect:/patients";

    }

    @RequestMapping("/remove/{id}")
    public String removePerson(@PathVariable("id") int id) {

        this.hospitalService.removePatient(id);
        return "redirect:/patients";
    }

}
