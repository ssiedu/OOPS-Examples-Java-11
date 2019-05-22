
import static java.lang.System.out;


public class Test {

    int x, y;        //instance (non-static)
    static int p=50, q=60; //class (static)

    
    public static void display(){
        //out.println(x+","+y);
        out.println(p+","+q);
    }
    
    public void show(){
        out.println(x+","+y);
        out.println(p+","+q);
    }
    
    public static void main(String[] args) {
        //instantiating Test class
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();
        
        t1.x=10; t1.y=11;
        t2.x=20; t2.y=21;
        t3.x=30; t3.y=31;
        
        //t1.show();
        //t2.show();
        t3.show();
    }

}
