class Complex
{
    //State
    double a;
    double b;
    
    //Constructors
    Complex(){
        a = 1;
        b = 1;
    }
    
    Complex(double c){
        a = c;
        b = 0;
    }
    
    Complex(double a, double d){
        this.a = a;
        b = d;
    }
    
    Complex(Complex c){
        this.a = c.a;
        this.b = c.b;
    }
    
    //Methods
    Complex addWith(Complex oth){
        double re;
        double im;
        re = this.a+oth.a;
        im = this.b+oth.b;
        
        Complex c2=new Complex(re,im);
        return c2;
    }
    void display()
    {   if(b>=0){
         System.out.println("Complex number:"+a+"+i"+b);
        }
        else{
            System.out.println("Complex number:"+a+"-i"+-1*b);
        }   
    }
    
    void negate(){
        this.b = -this.b;
        
    }
    Complex multiplyWith(Complex c1)
    {
        double re;
        double im;
        re=this.a*c1.a-this.b*c1.b;
        im=this.a*c1.b+this.b*c1.a;
        Complex c2=new Complex(re,im);
        return c2;
    }
    Complex divisionWith(Complex c1)
    {
        double re;
        double im;
        re=(this.a*c1.a+this.b*c1.b)/(c1.a*c1.a+c1.b*c1.b);
        im=(this.b*c1.a-this.a*c1.b)/(c1.a*c1.a+c1.b*c1.b);
        Complex c2=new Complex(re,im);
        return c2;
    }
}