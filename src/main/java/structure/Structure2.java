package structure;

public class Structure2 {
    public static void getBoucleFor(){
        int[]tab={1,2,3};
        int sum=0;
        for (int i=0;i<5;i++){
            System.out.println("1"+i);
        }

        for (int i = 0, j=10; i<j; i++, j--){
            System.out.println("counters"+"i : "+ i +"et j :"+j);
        }
        for(int number :tab){
            sum+=number;
            System.out.println("number"+number);

        }
        System.out.println("La sommme est de "+sum);

    }
    public  static void getBreakAndContinue(){
        System.out.println("----continue----");
        for (int i=0; i<5;i++){
            if(i%2==0){
                System.out.println("je suis dans le if "+i);
                continue;
            }
            System.out.println("counter:"+i);
        }
        System.out.println("---breeak");

        for (int i=0;i<5;i++){
            if(i==3){
                break;
            }
            System.out.println("counter"+i);
        }
        for(int i =0; i<5;i++){
            for(int j=0;j<5;i++){
                if(j==3){
                    break;
                }
                System.out.println(j+" ");
            }
            System.out.println("counter"+i);
        }
    }
}
