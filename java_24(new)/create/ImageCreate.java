package create;

import document.IDocument;
import document.ImageDocument;
import document.MusicDocument;

public class ImageCreate implements ICreateDocument{

    @Override
    public IDocument createNew(String id) {
        ImageDocument document = new ImageDocument(id);
        return document;
    }

    @Override
    public IDocument createOpen() {
        ImageDocument document = new ImageDocument("old_document_"+ 100);
        return document;
    }
}
