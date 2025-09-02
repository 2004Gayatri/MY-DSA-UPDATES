import java.util.*;
public class BasicQuestions{
    public static void main(String[]args){
        int[] arr1= {1,2,3,4,5,0};
        int [] arr ={4, 2,0, 4, 5, 0,0,2, 3, 4};

        //Find the sum of all elements in the array 
        int total_sum =0;
        for(int i=0;i<=arr1.length;i++){
            total_sum+=i;
        }
        System.out.print("Total sum is : " + total_sum);
        
        //Code to fine number of even and odd number in array
        int count_even = 0;
        int count_odd=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2==0){
                count_even+=1;
            }else{
                count_odd+=1;
            }
        }
        System.out.println("Number of even number in array are : " +count_even);
        System.out.println("Number of odd numbers in array are : " + count_odd);
        //Reverse the array 
        int start=0;
        int end=arr1.length-1;
        while(start<end){
            int temp = arr1[end];
            arr1[end]=arr1[start];
            arr1[start]=temp;
            start++;
            end--;
        } 
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }

        // Finding the Second largest element in the array
        int largest = Integer.MIN_VALUE;
        int Second_largest = Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>largest){
                Second_largest=largest;
                largest=arr1[i];
                
            }else if(arr1[i]<largest || arr1[i]>Second_largest){
                Second_largest=arr1[i];
            }
        }
        if(Second_largest==Integer.MIN_VALUE){
            System.out.print("No second largest Term is their in array");
        }else{
            System.out.print("Second Largest element is a " + Second_largest);
        }
        

        //Checking the frequencies of element occurance
        boolean[] visted = new boolean[arr.length];
       for(int i=0;i<arr.length;i++){
        int curr = arr[i];
        if(visted[i]){
            continue;
        }
        int count =1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]==curr){
                count++;
                visted[j]=true;
            }
        }
      
         System.out.println("The frequency of " + curr + " is = " + count);
       
       }
    //Find the difference between sum of even and odd elements;
    int even_sum =0;
    int odd_sum =0;
    for(int i=0;i<arr1.length;i++){
       if(arr1[i]%2==0){
        even_sum+=arr1[i];
       }else{
        odd_sum+=arr1[i];
       }
    }
    System.out.println("Even sum is : " + even_sum);
    System.out.println("Odd sum is : " + odd_sum);
    int diff = even_sum-odd_sum ;
    System.out.println("Their diffrence is : " + diff );

     //Finding the index of that element
     int key =14;
     boolean found = false;
     for(int i=0;i<arr1.length;i++){
        if(arr1[i]==key){
            System.out.print("The element " + key + " is at index " + i);
            found=true;
            break;
        }
     }
     if(!found){
        System.out.print("The element " + key + " is not at any index ");
     }

    // Check is their array is sorted in ascending order or not
    boolean sorted = true;
    for(int i=0;i<arr1.length-1;i++){
        if(arr1[i]>arr1[i+1]){
            sorted=false;
            break;
        }
    }
    if(!sorted){
        System.out.println("Array is not sorted");
    }else{
        System.out.println("Array is sorted");
    }

    //Check all pairs in array whose sum is target
    int target = 3;
    for(int i=0;i<arr1.length;i++){
        int curr = arr1[i];
        for(int j=i+1;j<arr1.length;j++){
            if(arr1[j]+curr == target){
                System.out.println("Pair is : " + arr1[j] + " , " + curr);
            }
        }
    }

    //Move all zeroes to the end of the array without changing the order of non-zero elements.
    int[]pos = new int[arr.length];
    for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
           break;
        }else{
            arr[i]=pos[i];
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }


     }

}