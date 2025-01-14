package assignment;

import java.util.*;
public class target {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        for(int i= 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                for(int k = j+1; k<n ; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
                    }
                }
            }
        }

    }
}