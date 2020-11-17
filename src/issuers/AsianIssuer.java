package issuers;

import documents.AsianDocument;
import documents.Document;
import documents.HondaDocument;

public class AsianIssuer implements DocumentIssuer{
    @Override
    public Document[] createBatch() {

        return new Document[]{
                new AsianDocument(),
                new HondaDocument(),
                new AsianDocument()
        };
    }
}
