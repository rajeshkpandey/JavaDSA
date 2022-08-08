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

public static Stack<Integer>_push(ArrayList<Integer> arr,int n)
{
       //Your code here
       //Creating a Stack of type Integer
        Stack<Integer>s = new Stack<>();
        
        //Pushing all the elements of the ArrayList
        //to the Stack
        for(int i=0;i<n;i++)
        {
            s.push(arr.get(i));
        }
        //returning the Stack
        return s;
    
    
}

public static void _pop(Stack<Integer>s)
{
    //Your code here
     while(!s.empty())
        {
            System.out.print(s.peek()+" ");
            s.pop();
        }
    
}


4.

class Solution
{
    // Complete the function
    // n: size of array
    // arr[]: input array
    public static void reverseArray(int n, int arr[])
    {
        // Reverse the array using stack
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length;i++)
        {
            st.add(arr[i]);
        }
        for(int i=0; i<arr.length;i++)
        {
            arr[i]=st.pop();
        }
    }
}


5.

class GetMin
{
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[],int n)
    {
        // your code here
        Stack<Integer> st = new Stack<>();
        for (int i=0; i<arr.length; i++){
            st.add(arr[i]);
        }
        return st;
    }
    
    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        
        for(int i=s.size()-1; i>=0; i--){
            int min = Integer.MAX_VALUE;
            for(int j=s.size()-1; j>=0; j--){
              min=Math.min(min,s.elementAt(j));
            }
            System.out.print(min+ " ");
            s.remove(s.size()-1);
        }
    }
}


6.

class Solution{
        public static int profit(ArrayList<Integer> V)
    {
        //Your code here
        int profit=0;
        int j;
        for(int i=0; i<V.size(); i++){
            j=i+1;
            while(j<V.size()&&V.get(j)<V.get(i)){
                j++;
                
            }
            if(j==V.size()){
                profit+=V.get(i);
            }
            else{
                profit+=(V.get(j)-V.get(i));
            }
            
        }
        return profit;
    }
}


7.

class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        int count;
        int arrnew[] = new int[n];
        for(int i=n-1;i>=0;i--){
            count=1;
            int j;
            for(j=0; j<i; j++){
                if(price[j]<=price[i])
                  count+=1;
                else
                  count=1;
                
            }
            
            st.add(count);
            
            
        }
        
       for(int i=0; i<n; i++){
           arrnew[i]=st.pop();
       }
       return arrnew;
    }
    
}


8. 

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


9. 

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


10.

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
 
 
11.

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


12.

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
 
    
13.

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






