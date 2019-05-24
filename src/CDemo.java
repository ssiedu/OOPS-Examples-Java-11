
public class CDemo {
    
    private int x, y, z;
    
    public void showData() {
        System.out.println(x + "," + y + "," + z);
    }

    public void set(int p, int q) {
        x = p;        
        y = q;
    }

    public void set(int a, int b, int c) {
        set(a,b);
        z = c;
    }
    
    public CDemo(CDemo tmp){
        x=tmp.x;
        y=tmp.y;
        z=tmp.z;
    }
                    
    public CDemo(int p, int q){
        x=p; 
        y=q;
    }
    public CDemo(int a, int b, int c){
        this(a,b);
        z=c;
    }

    public static void main(String args[]) {
        CDemo ob1=new CDemo(10,20,30);
        ob1.showData();
        
        CDemo ob2=new CDemo(40,50);
        ob2.showData();
        
    }
}
/*
    Constructor
    --------------
1) its method like body having same name as classname
   and no return type (not even void also)
    (you can have access modifiers with constructors)
2) it may or may not have parameters.
3) 


*/
