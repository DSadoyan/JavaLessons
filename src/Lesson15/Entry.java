package Lesson15;

import Lesson15.Map.Entry;

import java.util.List;

class MyMap{
    private List<Entry> entries;
    public void put(Integer key,String value){
        entries.add(new Entry(key, value));
    }
}
