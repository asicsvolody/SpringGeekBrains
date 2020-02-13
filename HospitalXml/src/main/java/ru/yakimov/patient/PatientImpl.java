package ru.yakimov.patient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class PatientImpl implements Patient{
    private String complaint;

    public PatientImpl(String complaint) {
        this.complaint = complaint;
    }

    @Override
    public String getComplaint() {
        return complaint;
    }
}
