class P{
    String n;
    int a;

    P(String n1,int a1){
        n=n1;
        a=a1;
    }

    P(P x){
        n=x.n;
        a=x.a;
    }

    void d(){
        System.out.println("Name: "+n);
        System.out.println("Age: "+a);
    }

    public static void main(String[] args){
        P p1=new P("Rahul",22);
        P p2=new P(p1);

        p1.d();
        System.out.println();
        p2.d();
    }
}