package document;

public class MusicDocument implements IDocument{
    private String id;

    public MusicDocument(String id) {
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
        System.out.println("Document's type is Music document");
        System.out.println("Document's id: " + id);
    }
}
