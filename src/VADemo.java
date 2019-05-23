
public class VADemo {

    public static void add(int...v){
        int sum=0;
        
        for(int i=0; i<v.length; i++){
            sum=sum+v[i];
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {

        int x[]={11,12,13};
        int y[]={20,30,40,50};
        add(x);
        add(y);
        
        add();
        add(10,20,30);
        add(10,20,30,40);
        add(10,20,30,40,50);
        add(1,2,3,4,5,6,7,8,9,10);
        
    }

}
