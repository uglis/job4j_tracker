package ru.job4j.tracker;

import java.util.Comparator;
import java.util.Objects;

/**
 * Собираем заявку.
 */
public class Item implements Comparable<Item>, Comparator<Item> {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compare(Item o1, Item o2) {
        return o2.name.compareTo(o1.name);
    }

    @Override
    public int compareTo(Item o) {
        return this.name.compareTo(o.name);
    }


}