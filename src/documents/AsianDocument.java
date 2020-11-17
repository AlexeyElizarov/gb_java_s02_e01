package documents;

public class AsianDocument implements Document {
    @Override
    public void check() {
        System.out.println("Asia document");
        System.out.println("Checking...");
        System.out.println("Status OK");
    }
}
