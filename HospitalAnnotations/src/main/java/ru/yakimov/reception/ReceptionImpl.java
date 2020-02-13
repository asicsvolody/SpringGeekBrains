
package ru.yakimov.reception;

import org.springframework.stereotype.Component;
import ru.yakimov.doctor.Doctor;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Component
public class ReceptionImpl implements Reception {

    private Doctor doctor;

    public ReceptionImpl(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }
}
