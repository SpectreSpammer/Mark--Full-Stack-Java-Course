package com.onePieceOfCode.paulAndMark.day10_collections_framework.hashSets;

import java.util.Objects;

public class EmployeeHashSets {
    private int id;
    private String name;
    private String department;

    public EmployeeHashSets(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmployeeHashSets{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeHashSets that = (EmployeeHashSets) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department);
    }
}
