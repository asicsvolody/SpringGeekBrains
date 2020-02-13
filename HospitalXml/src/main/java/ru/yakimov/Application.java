package ru.yakimov;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.yakimov.doctor.Doctor;
import ru.yakimov.patient.Patient;
import ru.yakimov.reception.Reception;


/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        Patient patient = context.getBean(Patient.class);
        Doctor doctor = context.getBean(Reception.class).getDoctor();
        doctor.readMap();
        doctor.writeToMap(patient.getComplaint());
        doctor.readMap();

    }

}
