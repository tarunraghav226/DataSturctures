package sieveOfEratosthenes;

public class SieveOfEratosthenes {
    private boolean[] arr;

    public SieveOfEratosthenes(){
        arr=new boolean[1000];
    }

    public void initializeArray(){
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i<arr.length;i++){
            arr[i]=true;
        }
    }

    private boolean isPrime(int num){
        for(int i=2;i<(int)Math.sqrt(num)+1;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    public void sieveOfEratosthenes(){
        for(int i=2;i<arr.length;i++){
            if(isPrime(i))
                arr[i]=true;
            else
                arr[i]=false;
        }
    }

    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('|');
        for(int i=0;i<arr.length;i++)
            stringBuffer.append(String.valueOf(arr[i])+"|");
        return stringBuffer.toString();
    }
}
