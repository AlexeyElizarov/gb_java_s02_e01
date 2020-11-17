package issuers;

import documents.Document;

public interface DocumentIssuer {
    Document[] createBatch();
}
