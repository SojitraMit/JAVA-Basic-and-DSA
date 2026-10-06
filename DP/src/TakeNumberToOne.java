import org.w3c.dom.css.CSSStyleDeclaration;

public class TakeNumberToOne {

    public static int countSteps(int n){
        if(n==1){
            return 0;
        }

        int opn1=countSteps(n-1);
        int minSteps=opn1;

        if(n%3==0){
            int opn2=countSteps(n/3);
            if(minSteps>opn2){
                minSteps=opn2;
            }
        }
        if(n%2==0){
            int opn3=countSteps(n/2);
            if(minSteps>opn3){
                minSteps=opn3;
            }
        }

        return 1 + minSteps;
    }

    public static int countStepsM(int n){
        int storage[]=new int[n+1];
        return countStepsM(n,storage);
    }

    private static int countStepsM(int n, int[] storage) {
        if(n==1){
            storage[n]=0;
            return storage[n];
        }
        if(storage[n]!=0){
            return storage[n];
        }

        int opn1=countStepsM(n-1,storage);
        int minSteps=opn1;

        if(n%3==0){
            int opn2=countStepsM(n/3,storage);
            if(minSteps>opn2){
                minSteps=opn2;
            }
        }
        if(n%2==0){
            int opn3=countStepsM(n/2,storage);
            if(minSteps>opn3){
                minSteps=opn3;
            }
        }

        storage[n]=1+minSteps;
        return storage[n];
    }

    public static int countStepsDP(int n){
        int storage[]=new int[n+1];
        storage[1]=0;

        for(int i=2;i<=n;i++){
            int min=storage[i-1];

            if(i%3==0){
                if(min>storage[i/3]){
                    min=storage[i/3];
                }
            }

            if(i%2==0){
                if(min>storage[i/2]){
                    min=storage[i/2];
                }
            }
            storage[i]=1+min;
        }

        return storage[n];
    }

    public static void main(String[] args) {
        System.out.println(countStepsM(1000));
        System.out.println(countStepsDP(1000));
        System.out.println(countSteps(1000));

    }
}
