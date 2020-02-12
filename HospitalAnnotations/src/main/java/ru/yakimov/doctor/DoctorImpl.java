package ru.yakimov.doctor;

import org.springframework.stereotype.Component;
import ru.yakimov.map.Map;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */


@Component
public class DoctorImpl implements Doctor {

    private Map map;

    public DoctorImpl(Map map) {
        this.map = map;
    }

    public void writeToMap(String ... complaints) {
        this.map.writeToMap(complaints);

    }

    @Override
    public void readMap() {
        this.map.printMap();
    }
}
