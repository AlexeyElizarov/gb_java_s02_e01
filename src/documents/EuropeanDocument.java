package documents;

public class EuropeanDocument implements Document {
    @Override
    public void check() {
        System.out.println("European document");
        System.out.println("Checking...");
        System.out.println("Status OK");
    }
}
