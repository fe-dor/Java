package Book;

public class Book {
    private String title;
    private String publishingHouse;
    private int firstPublication;
    private int numberOfPages;
    private int productionYear;

    public Book(String title, int firstPublication, String publishingHouse, int numberOfPages, int productionYear){
        this.title = title;
        this.firstPublication = firstPublication;
        this.publishingHouse = publishingHouse;
        this.numberOfPages = numberOfPages;
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Название: " + title +  ", первая публикация: " + firstPublication +
                ", издательство: " + publishingHouse +
                ", количество страниц: " + numberOfPages +
                ", год выпуска: " + productionYear;
    }
    public void setFirstPublication(int firstPublication) {
        this.firstPublication = firstPublication;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getFirstPublication() {
        return firstPublication;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getPublishingHouse() {
        return publishingHouse;
    }
    public String getTitle() {
        return title;
    }

    public void openPage(int page){
        System.out.printf("Страница %d открыта \n",page);
    }
}
