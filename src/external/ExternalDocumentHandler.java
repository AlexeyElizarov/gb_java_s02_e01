package external;

import documents.Document;

public class ExternalDocumentHandler {
    public void process(Document[] documents) {
        for (Document document: documents) {
            document.check();
        }
    }
}
