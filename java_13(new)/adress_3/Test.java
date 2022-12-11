package adress_3;

public class Test {
    public static void main(String[] args) {
        Address address = new Address();
        address.getStringComas("Россия,Краснодарский Край,Ейск,Пушкина,71,1,10");
        address.getFields();
        address.getStringComas("Россия,Москва,Москва,11 Парковая,36,1,723");
        address.getFields();
        address.getStringSymbols("USA.California.Los–Angeles.1 avenue.22.2.3");
        address.getFields();
        address.getStringSymbols("Россия;Краснодарский Край;Краснодар;Красная;106;4;18");
        address.getFields();
    }
}
