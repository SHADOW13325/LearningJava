package com.example.Java9Features.Enhancements;

import java.util.*;

/**
 * @author saumitra chauhan
 */
public class CollectionEnhancement {

    public static void main(String[] args) {

        //How we used to create unmodifiable list pre Java 9
        List<String> names = new ArrayList();
        names.add("Syed");
        names.add("Mike");
        names.add("Jenny");
        names = Collections.unmodifiableList(names);
        System.out.println("names = " + names);

        //factory methods of Java 9
        List<String> names2 = List.of("Syed", "Mike", "Jenny");
        System.out.println("names2 = " + names2);
        Set<String> set = Set.of("Syed", "Mike", "Jenny");
        System.out.println("set = " + set);
        Map<String, String> map = Map.of("Grade1", "Syed", "Grade2", "Mike");
        System.out.println("map = " + map);

        //modifying
        //names2.add("Gene");
//        set.add("saumitra");
//        map.put("Saumitra", "Developer");
//        names2.sort(Comparator.naturalOrder());

        //duplicating
//        set= Set.of("Syed", "Syed", "Mike");

    }
}

/*
    Before Java9, to create ImmutableList we use Collections.unmodifiableList(...) method.
    There are other variations for other collections.

    Instead of using this, Java9 introduced factory method .of() for the list, set and map.

    Things to Remember :-
        1.  null can't be inserted in these collections, else NPE
        2.  Duplicates are not allowed in set, else IllegalArgumentException
        3.  Modification is not allowed in these collections, else UnsupportedOperationException
 */