// Generic Class
public class MyData<T> { // Generic Class
    private T data; // Property type variabel Generic

    public MyData(T data) { // Constructor parameter typenya generic
        this.data = data;
    }

    public T getData() { // Method return valuenya generic
        return data;
    }

    public void setData(T data) { // Method parameter typenya generic
        this.data = data;
    }
}