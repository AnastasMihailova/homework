public class homework2 {
    public static void main(String[] args) {
        int[] a = new int[]{5,6,3,2,5,1,4,9};
        for(int i = a.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( a[j] > a[j+1] ){
                int tmp = a[j];
                a[j] = a[j+1];
                a[j+1] = tmp;
            }
        }
    }
    }
}

