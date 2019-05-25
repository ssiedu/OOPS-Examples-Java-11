public class ORDemo {

    private int x,y;
    
    public ORDemo(int a, int b){
        x=a; y=b;
    }
    public void show(){
        System.out.println(x+","+y);
    }

    public static void main(String args[]){
        
        ORDemo ob1;
        new ORDemo(10,20);
        ORDemo ob2=new ORDemo(30,40);
        ORDemo ob3=ob2;
        ob1=ob3;
        System.out.println(ob1.x);
        System.out.println(ob2.x);
        System.out.println(ob3.x);
        ob3=new ORDemo(50,60);
        System.out.println("____________________________");
        System.out.println(ob1.x);
        System.out.println(ob2.x);
        System.out.println(ob3.x);
        ob2=ob3;
        System.out.println("____________________________");
        System.out.println(ob1.x);
        System.out.println(ob2.x);
        System.out.println(ob3.x);
        ob1=new ORDemo(70,80);
        
        
    }
}
