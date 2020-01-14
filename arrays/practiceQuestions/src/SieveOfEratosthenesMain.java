import sieveOfEratosthenes.SieveOfEratosthenes;

public class SieveOfEratosthenesMain {
    public static void main(String[] args) {
        SieveOfEratosthenes sieve = new SieveOfEratosthenes();
        sieve.initializeArray();
        sieve.sieveOfEratosthenes();
        System.out.println(sieve.toString());
    }
}
