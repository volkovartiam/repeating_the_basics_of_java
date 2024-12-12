package ru.volkov.lesson9.designpatterns.structural.adapter;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapAdapter extends AbstractMap {
    private Map<Object, Object> map;

    public MapAdapter(Object[][] array) {
        super();
        map = new HashMap<>();
        for(Object[] mapping : array){
            map.put(mapping[0], mapping[1]);
        }

    }

    @Override
    public Set entrySet() {
        return map.entrySet();
    }

}
