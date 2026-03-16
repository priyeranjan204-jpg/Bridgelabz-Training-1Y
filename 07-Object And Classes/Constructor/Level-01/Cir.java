class Cir{
    double r;

    Cir(){
        this(5);
    }

    Cir(double x){
        r=x;
    }

    void s(){
        System.out.println("Radius: "+r);
    }

    public static void main(String[] args){
        Cir c1=new Cir();
        Cir c2=new Cir(10);

        c1.s();
        c2.s();
    }
}