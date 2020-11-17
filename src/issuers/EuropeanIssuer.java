package issuers;

import documents.Document;
import documents.EuropeanDocument;

public class EuropeanIssuer implements DocumentIssuer {
    @Override
    public Document[] createBatch() {
        return new Document[] {
                new EuropeanDocument(),
                new EuropeanDocument(),
                new EuropeanDocument()
        };
    }
}
