package create;

import document.IDocument;
import document.MusicDocument;
import document.TextDocument;

public class MusicCreate implements ICreateDocument{

    @Override
    public IDocument createNew(String id) {
        MusicDocument document = new MusicDocument(id);
        return document;
    }

    @Override
    public IDocument createOpen() {
        MusicDocument document = new MusicDocument("old_document_"+ 100);
        return document;
    }
}
