//Program lists


 1.
 
 public static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr)
{
    //Your code here
    int sum;
    int maxSum=Integer.MAX_VALUE;
    int maxList=Integer.MIN_VALUE;
    for(List<Integer> innerList:arr){
        maxList=Math.max(maxList,innerList.size());
    }
    
    for(int i=0; i<maxList; i++){
        sum=0;
        for(List<Integer> innerList :arr){
            if(i<innerList.size()){
                sum+=innerList.get(i);
            }
        }
        maxSum= Math.min(maxSum,sum);
    }
    return maxSum;
    
}


2.

public static int josephus(int n, int k)
{
    //Your code here
    LinkedList<Integer> list = new LinkedList<Integer>();
    for(int i=0; i<n; i++)
    {
        list.add(i);
    }
    
    ListIterator<Integer> it = list.listIterator();
    while(list.size()!=1){
        for(int i=0; i<k; i++){
            if(it.hasNext() == false){
                it = list.listIterator();
            }
            it.next();
        }
        it.remove();
    }
    return list.get(0);
}


3.




3. 

class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
       ArrayList<Integer> list = new ArrayList<>();
       
       for(int i=d%n; i<n; i++){
           list.add(arr[i]);
       }
       
       for(int i=0; i<d%n; i++){
           list.add(arr[i]);
       }
       
       for(int i=0; i<n; i++){
           arr[i] = list.get(i);
        }
    }
}


4. 

class Get {
    public static void reverseArray(int arr[], int n) {
        // Your code here
        int temp;
        for(int i=0; i<arr.length/2; i++)
        {
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
            
        }
    }
}


5.

class Solution
{
    //Complete the function
    public static int isSorted(int arr[], int n)
    {
       /// Your code here
       int i;
       for(i=1; i <arr.length;i++)
       {
           if(arr[i-1]>arr[i])
             break;
           
       }
       if(i==n)
         return 1;
         
       for(i=1; i<arr.length;i++)
       {
           if(arr[i-1]<arr[i])
             break;
       }
       if(i==n)
         return 1;
         
       return 0;     
         
    }
}
 
 
6.

class Solution
{
    // Complete the function
    public static int immediateSmaller(int arr[], int n, int x)
    {
        // your code here
        int small=-1;
        
        for (int i = 0; i<n;i++)
        {
            if(arr[i]<x && arr[i]>small)
            {
               small=arr[i]; 
            }
        }
        
        return small;
        
    }
}


7.

class Solution
{
    // Complete the function
    public static int immediateGreater(int arr[], int n, int x)
    {
        int big=Integer.MAX_VALUE;
        // Your code here
        for (int i=0;i<arr.length; i++)
        {
            if(arr[i]>x && big > arr[i])
            {
                big=arr[i];
            }
        }
        
        if (big == Integer.MAX_VALUE)
        {
          return -1;  
        }
        else
          return big;
        
    }
 
    
8.

class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        int countx=0;
        int county=0;
        for (int i = 0; i<arr.length; i++)
        {
            if(arr[i] == x)
              countx+=1;
            if(arr[i] == y)
              county+=1;
              
        }
        if (countx==county)
          return x>y?y:x;
        else 
          return countx>county?x:y;
    }
}


9.




