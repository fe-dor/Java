package document;

public class ImageDocument implements IDocument{
    private String id;

    public ImageDocument(String id) {
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
        System.out.println("Document's type is Image document");
        System.out.println("Document's id: " + id);
    }
}
