class UseComplex
{
    static Complex retGreater(Complex m, Complex n){
        if (m.a >= n.a && m.b >=n.b){
            return m;
        }
        else if(n.a >= m.a && n.b >= m.b){
            return n;
        }
        else{
            return null;
        }
        
    }
    public static void main(String[] args){
        
        Complex c1 = new Complex();
        
        c1.display();
        System.out.println("Here (1+i1) is multiplied with (1+i2)");
         Complex c5 = new Complex(1,2);
        c5=c1.multiplyWith(c5);
        c5.display();
        System.out.println("Here (1+i1) is divided with (1+i2)");
        Complex c6 =new Complex(1,2);
        c6=c1.divisionWith(c6);
        c6.display();
    }
}