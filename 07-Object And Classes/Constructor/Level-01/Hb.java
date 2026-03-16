class Hb{
    String g,r;
    int n;

    Hb(){
        g="Guest";
        r="Std";
        n=1;
    }

    Hb(String g1,String r1,int n1){
        g=g1;
        r=r1;
        n=n1;
    }

    Hb(Hb x){
        g=x.g;
        r=x.r;
        n=x.n;
    }

    void s(){
        System.out.println("Guest: "+g);
        System.out.println("Room: "+r);
        System.out.println("Nights: "+n);
    }

    public static void main(String[] args){
        Hb h1=new Hb();
        Hb h2=new Hb("Aman","Deluxe",3);
        Hb h3=new Hb(h2);

        h1.s();
        System.out.println();
        h2.s();
        System.out.println();
        h3.s();
    }
}