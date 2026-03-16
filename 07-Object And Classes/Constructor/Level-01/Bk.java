class Bk {
    String t,a;
    double p;

    Bk(){
        t="NA";
        a="NA";
        p=0;
    }

    Bk(String x,String y,double z){
        t=x;
        a=y;
        p=z;
    }

    void d(){
        System.out.println("Title: "+t);
        System.out.println("Author: "+a);
        System.out.println("Price: "+p);
    }

    public static void main(String[] args){
        Bk b1=new Bk();
        Bk b2=new Bk("Java","James",500);

        b1.d();
        System.out.println();
        b2.d();
    }
}