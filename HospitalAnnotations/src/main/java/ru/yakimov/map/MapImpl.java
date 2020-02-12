package ru.yakimov.map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Component
public class MapImpl implements Map {

    private List<String> complaints = new ArrayList<>();

    public MapImpl(@Qualifier("complaints") List<String> complaints) {
        this.complaints.addAll(complaints);

    }

    public void printMap() {
        this.complaints.forEach(System.out::println);
    }

    public void writeToMap(String ... complaints) {
        this.complaints.addAll(Arrays.asList(complaints));
    }
}
