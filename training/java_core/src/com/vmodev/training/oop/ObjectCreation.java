package com.vmodev.training.oop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class ObjectCreation {
    public static void main(String... args) throws Exception {

        // 1. Using new keyword
        Employee emp1 = new Employee();
        emp1.setName("emp1");
        System.out.println(emp1 + ", hashcode : " + emp1.hashCode());

        // 2. Using Class class's newInstance() method
        Employee emp2 = Employee.class.newInstance();
        emp2.setName("emp2");
        System.out.println(emp2 + ", hashcode : " + emp2.hashCode());

        // 3. Using Constructor class's newInstance() method
        Constructor<Employee> constructor = Employee.class.getConstructor();
        Employee emp3 = constructor.newInstance();
        emp3.setName("emp3");
        System.out.println(emp3 + ", hashcode : " + emp3.hashCode());

        // 4. Using clone() method
        Employee emp4 = (Employee) emp3.clone();
        emp4.setName("emp4");
        System.out.println(emp4 + ", hashcode : " + emp4.hashCode());

        // 5. Using Deserialization
        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"))) {
            out.writeObject(emp4);
        }
        Employee emp5;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"))) {
            emp5 = (Employee) in.readObject();
            emp5.setName("emp5");
            System.out.println(emp5 + ", hashcode : " + emp5.hashCode());
        }
    }
}