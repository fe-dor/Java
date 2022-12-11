package math;

public class MathFunc implements MathCalculable{
    @Override
    public double power(double a, int b) {
        if (b < 0) {
            a = 1 / a;
            b = -b;
        }
        double res = 0;
        double temp = 1;
        for(int i = 0; i < b; i++){
            res = temp*a;
            temp = res;
        }
        return res;
    }

    @Override
    public double absComp(double re, double im) {
        return Math.sqrt(power(re, 2) + power(im, 2));
    }
}
