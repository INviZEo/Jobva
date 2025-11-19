package org.example;

import java.util.HashSet;

public class UniquePersons {
    public void checkUniquePersons() {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("Dimas",19));
        set.add(new Person("David",19));
        set.add(new Person("Karina",38));
        set.add(new Person("Sasha",15));
        set.add(new Person("David",19));
        set.add(new Person("Konstantin",25));
        System.out.println(set);
    }
}
