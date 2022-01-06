package com.revature;


import java.util.Comparator;

public class Q7 {
    protected String name;
    protected String department;
    protected int age;

    public static final Comparator<Q7> NameComparator = new Comparator<Q7>() {
        @Override
        public int compare(Q7 o1, Q7 o2) {
            return o1.name.compareTo(o2.name);
        }
    };
    public static final Comparator<Q7> DepartmentComparator = new Comparator<Q7>() {
        @Override
        public int compare(Q7 o1, Q7 o2) {
            return o1.department.compareTo(o2.department);
        }
    };
    public static final Comparator<Q7> AgeComparator = new Comparator<Q7>() {
        @Override
        public int compare(Q7 o1, Q7 o2) {
            return o1.age - o2.age;
        }
    };

    public Q7(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Q7{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }

}
