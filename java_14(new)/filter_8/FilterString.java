package filter_8;

import java.util.Objects;

public class FilterString implements Filter{

    @Override
    public int apply(Object o) {
        String s = (String) o;
        if(s.equals("error"))
            return 0;
        else
            return 1;
    }

}
