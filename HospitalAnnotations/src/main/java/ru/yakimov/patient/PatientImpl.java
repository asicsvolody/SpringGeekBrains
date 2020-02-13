package ru.yakimov.patient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Component
@Lazy
public class PatientImpl implements Patient{
    private String complaint;

    public PatientImpl(@Value("Temperature") String complaint) {
        this.complaint = complaint;
    }

    @Override
    public String getComplaint() {
        return complaint;
    }
}
