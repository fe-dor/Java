package create;

import document.IDocument;

public interface ICreateDocument {
    public IDocument createNew(String id);
    public IDocument createOpen();
}
