public class class37 {
    public static void main(String[] args) {
        int arr[] = {10,20,35,50,75,80};
        int x = 95;
        int l = 0;
        int r = arr.length - 1;
        boolean found = false; // flag
        
        while(l<r){
            int sum = arr[l] + arr[r];
            if(sum == x){
                System.out.println("Found " + x + " as sum of values on index: " + l + " and index: " + r);
                found = true;
                break;
            } else if(sum < x){
                l++;
            } else{
                r--;
            }
        }
        if(!found) System.out.println("Sum not found.");
    }
}
