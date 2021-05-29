// SortedSet
package data;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        // TODO Auto-generated method stub
        return o1.getName().compareTo(o2.getName());
    }   
}
