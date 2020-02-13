package ru.yakimov;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Repository;
import ru.yakimov.doctor.Doctor;
import ru.yakimov.patient.Patient;
import ru.yakimov.reception.Reception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Patient patient = context.getBean(Patient.class);
        Doctor doctor = context.getBean(Reception.class).getDoctor();
        doctor.readMap();
        doctor.writeToMap(patient.getComplaint());
        doctor.readMap();

    }


    @Bean
    @Lazy
    public List<String> complaints(){
        return Arrays.asList("A sore throat", "Headache");
    }

}
