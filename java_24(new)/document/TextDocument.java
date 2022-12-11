package document;

public class TextDocument implements IDocument{
    private String id;

    public TextDocument(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void save() {

    }

    @Override
    public void out() {
        System.out.println("Document's type is Text document");
        System.out.println("Document's id: " + id);
    }
}
