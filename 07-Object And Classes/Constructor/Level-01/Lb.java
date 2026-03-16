class Lb{
    String t,a;
    double p;
    boolean av=true;

    void br(){
        if(av){
            av=false;
            System.out.println("Book Borrowed");
        }
        else{
            System.out.println("Not Available");
        }
    }

    void d(){
        System.out.println("Title: "+t);
        System.out.println("Author: "+a);
        System.out.println("Price: "+p);
        System.out.println("Available: "+av);
    }

    public static void main(String[] args){
        Lb b=new Lb();

        b.t="DSA";
        b.a="Mark";
        b.p=600;

        b.d();
        b.br();
        b.d();
    }
}