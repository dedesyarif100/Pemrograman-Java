// Generic Class
public class Pair<T, U> { // Generic Class
    private T first; // Property type variabel Generic

    private U second; // Property type variabel Generic

    public Pair(T first, U second) { // Constructor parameter typenya generic
        this.first = first;
        this.second = second;
    }

    public T getFirst() { // Method return valuenya generic
        return first;
    }

    public void setFirst(T first) { // Method parameter typenya generic
        this.first = first;
    }

    public U getSecond() { // Method return valuenya generic
        return second;
    }
    public void setSecond(U second) { // Method parameter typenya generic
        this.second = second;
    }
}
