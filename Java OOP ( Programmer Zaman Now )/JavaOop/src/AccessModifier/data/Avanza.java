package data;

public interface Avanza {
    public int cekIntAvanza = 1;
    public String cekStringAvanza = "INTERFACE AVANZA";

    // public Avanza mobil();
    abstract void drive(); // Setiap method yang ada di dalam interface, menjadi method abstract

    abstract int getTier();
}
