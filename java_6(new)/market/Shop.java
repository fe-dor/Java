package market;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private Computers computersE;
    private ArrayList<Computer> computers;
    private int i;

    public Shop(){
        computers = new ArrayList<>();
    }

    public void add(Processor processor, Memory memory, Monitor monitor, String company, String model){
        computers.add(new Computer(processor, memory, monitor, company, model));
    }

    public void add(Computer computer){
        computers.add(computer);
    }

    public void addFromConsole(Scanner sc){

        String model;
        int year;
        double frequency;

        System.out.println("Processor's:");
        System.out.println("model:");
        model = sc.nextLine();
        System.out.println("year:");
        year = sc.nextInt();
        System.out.println("frequency:");
        frequency = sc.nextDouble();
        sc.nextLine();
        Processor processor = new Processor(model, year, frequency);

        int capacity;
        String model2;
        double frequency2;

        System.out.println("Memory's:");
        System.out.println("model:");
        model2 = sc.nextLine();
        System.out.println("capacity:");
        capacity = sc.nextInt();
        System.out.println("frequency:");
        frequency2 = sc.nextDouble();
        sc.nextLine();
        Memory memory = new Memory(model2, capacity, frequency2);

        int diagonal;
        String model3;

        System.out.println("Monitor's:");
        System.out.println("model:");
        model3 = sc.nextLine();
        System.out.println("diagonal:");
        diagonal = sc.nextInt();
        sc.nextLine();
        Monitor monitor = new Monitor(model3, diagonal);

        String company;
        String model4;

        System.out.println("Computer's: ");
        System.out.println("company: ");
        company = sc.nextLine();
        System.out.println("model: ");
        model4 = sc.nextLine();

        computers.add(new Computer(processor, memory, monitor, company, model4));
    }

    public void delete(Computer computer){
        computers.remove(computer);
    }

    public Computer find(String company, String model){
        for(int i = 0; i < computers.size(); i++){
            if(computers.get(i).getCompany().equals(company) && computers.get(i).getModel().equals(model)){
                return computers.get(i);
            }
        }
        return null;
    }

}
