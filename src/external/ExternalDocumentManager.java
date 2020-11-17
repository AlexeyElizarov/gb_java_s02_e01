package external;

import issuers.DocumentIssuer;
import issuers.DocumentIssuerFactory;

public class ExternalDocumentManager {
    public void manage() {
        ExternalDocumentHandler handler = new ExternalDocumentHandler();
        DocumentIssuer[] documentIssuers = DocumentIssuerFactory.create();
        for (DocumentIssuer issuer : documentIssuers) {
            handler.process(issuer.createBatch());
        }
    }
}
