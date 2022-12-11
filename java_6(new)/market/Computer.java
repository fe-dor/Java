package market;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private String company;
    private String model;
    private Computers companyE;

    public Computer(Processor processor, Memory memory, Monitor monitor, String company, String model) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.company = company;
        this.model = model;
        companyE = Computers.valueOf(company);
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", monitor=" + monitor +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
