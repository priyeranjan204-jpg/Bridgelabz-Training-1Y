class Cr{
    String c,m;
    int d;
    double r=1000;

    Cr(String c1,String m1,int d1){
        c=c1;
        m=m1;
        d=d1;
    }

    void t(){
        double x=d*r;
        System.out.println("Customer: "+c);
        System.out.println("Car: "+m);
        System.out.println("Days: "+d);
        System.out.println("Total: "+x);
    }

    public static void main(String[] args){
        Cr x=new Cr("Rohit","Honda",3);
        x.t();
    }
}