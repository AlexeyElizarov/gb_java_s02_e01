package documents;

public class HondaDocument extends AsianDocument {
    @Override
    public void check() {
        System.out.println("Honda document");
        System.out.println("Checking...");
        System.out.println("Status OK");
    }
}
