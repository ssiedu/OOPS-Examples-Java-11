
public class VADemo {

    public static void add(){
        System.out.println("NOTHING TO ADD");
    }
    public static void add(int a, int b){
        System.out.println("SUM = "+(a+b));
    }
    public static void add(String...v){
        String res="";
        
        for(int i=0; i<v.length; i++){
            res=res+v[i];
        }
        System.out.println(res);
        
    }
    public static void add(int...v){
        int sum=0;
        
        for(int i=0; i<v.length; i++){
            sum=sum+v[i];
        }
        System.out.println(sum);
    }
    
    public static void main(String args[]) {
        add();
        add(10,20);
        add(10,20,30);
        add(10,20,30,40);
        add(50,60,70,80,90);
        add("aa","bb");
        add("xx","yy","zz");
            
        
    }

}
/*
    1) only one varargs per method.
    2) if you want normal parameters can be taken with varargs.
    3) varargrs must be always on last position.
    4) varargs methods can be overloaded.
    5) varargs can be of any type
        (premitive / non-premitive types)


*/