public class KadanesAlgorithm {
    public static int Kadanes(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            cs=cs+arr[i];
            
            if(ms<cs){
                ms=cs;
            }
            
            
            if(cs<0){
                cs=0;
            }
        }
        return ms;
    }    

    public static void main(String[] args) {
        int numbers[]={-1,-2,-3,-4};
        System.out.print(Kadanes(numbers));
    }
}
