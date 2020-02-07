public class Complex {
    public double real;
    public double imag;

    public Complex(double a1){
        real=a1;
        imag=0.0;
    }
    public Complex(double a1, double b1){
        real=a1;
        imag=b1;

    }

    public double abs(){
        double x=Math.pow(real, 2);
        double y=Math.pow(imag, 2);
        return Math.sqrt(x+y);

    }

    public Complex add(Complex other){
        double a1=this.real+other.real;
        double b1=this.imag+other.imag;
        return new Complex(a1,b1);

    }

    public Complex addDouble(double other){
        double a1=this.real+other;
        return new Complex(a1,this.imag);

    }

    public Complex multiply(Complex other){

        double constants=(this.real * other.real) - (this.imag * other.imag);
        double imags=(this.real*other.imag) + (this.imag*other.real);
        return new Complex(constants, imags);

    }

    public Complex multiplyDouble(double other){

        double constants=(this.real * other);
        double imags=(this.imag*other);
        return new Complex(constants, imags);


    }


    public String toString(){
        return real + " + " + imag + "i";
    }

    public static void main(String [] args){
        Complex c1 = new Complex(5, 2);
        Complex c2= new Complex(3,7);
        Complex c3=new Complex(5);
        System.out.println(c1.abs());
        System.out.println(c2.abs());
        System.out.println(c1.add(c2));
        System.out.println(c1.multiply(c2));
        System.out.println(c1.addDouble(2.0));
        System.out.println(c1.multiplyDouble(2.0));
        System.out.println(c3.abs());
        System.out.println(c3.add(c1));
        System.out.println(c3.addDouble(3.5));
        System.out.println(c3.multiply(c1));
        System.out.println(c3.multiplyDouble(1.5));


    }


}
