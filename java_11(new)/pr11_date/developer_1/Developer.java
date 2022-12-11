package pr11_date.developer_1;

import java.util.Date;

public class Developer {
    private String fullName;
    private Date dateOfPresentation;
    private Date dateOfGetTask;

    public Developer(String fullName, Date date) {
        this.fullName = fullName;
        this.dateOfGetTask = date;
        dateOfPresentation = new Date();
    }

    public Developer() {
        dateOfPresentation = new Date();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfPresentation() {
        return dateOfPresentation;
    }

    public Date getDateOfGetTask() {
        return dateOfGetTask;
    }

    public void setDateOfGetTask(Date dateOfGetTask) {
        this.dateOfGetTask = dateOfGetTask;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "Full name : '" + fullName + '\'' +
                ", date of presentation : " + dateOfPresentation +
                ", date of get task : " + dateOfGetTask +
                '}';
    }
}
