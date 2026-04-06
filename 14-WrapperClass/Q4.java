package Assignment_14;

public class Q4 {
    public void WrapperComparision(){

        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("a==b: "+(a==b));
        System.out.println("c==d: "+(c==d));
    }

    public static void main(String[] args) {
        Q4 q4 = new Q4();
        q4.WrapperComparision();
    }
}
