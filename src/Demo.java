public class Demo {
    private int x,y;
    
    boolean check(Demo tmp){
        
        if(x==tmp.x && y==tmp.y)
            return true;
        else
            return false;
    }
    
    
    public Demo(int a, int b){
        x=a;
        y=b;
    }
    public static void main(String args[]){
        
        Demo d1=new Demo(10,20);
        Demo d2=new Demo(10,20);
        Demo d3=d1;
        
        boolean r1=(d1==d2);
        System.out.println(r1);
        
        boolean r2=d1.check(d2);
        System.out.println(r2);
        
        
        //boolean r2=(d1==d3);
        //System.out.println(r2);
        
    }

    
}
