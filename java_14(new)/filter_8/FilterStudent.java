package filter_8;

public class FilterStudent implements Filter{

    @Override
    public int apply(Object o) {
        Student s = (Student) o;
        if(s.getCourse() < 2)
            return 0;
        else
            return 1;
    }
}
