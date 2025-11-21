package org.example;

import java.util.HashSet;
import java.util.Set;

public class UniquePersons {
    public void checkUniquePersons() {
        Set<Person> set = new HashSet<>();
        set.add(new Person("Dimas",19));
        set.add(new Person("David",19));
        set.add(new Person("Karina",38));
        set.add(new Person("Sasha",15));
        set.add(new Person("David",19));
        set.add(new Person("Konstantin",25));
        System.out.println(set);
    }
}
