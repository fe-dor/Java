package create;

import document.IDocument;
import document.TextDocument;

public class TextCreate implements ICreateDocument{
    @Override
    public IDocument createNew(String id) {
        TextDocument document = new TextDocument(id);
        return document;
    }

    @Override
    public IDocument createOpen() {
        TextDocument document = new TextDocument("old_document_"+ 100);
        return document;
    }
}
