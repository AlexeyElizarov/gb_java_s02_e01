package issuers;

public class DocumentIssuerFactory {

    public static DocumentIssuer[] create() {
        return new DocumentIssuer[] {
                new AsianIssuer(),
                new EuropeanIssuer()};
        }
}

