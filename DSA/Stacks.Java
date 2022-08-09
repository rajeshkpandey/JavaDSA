1.

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


2.

class Geeks
{
    //Function to push an element into the stack.
    public static void insert(Stack<Integer> st, int x)
    {
        // Your code here
        st.add(x);
    }
    
    //Function to remove top element from stack.
    public static void remove(Stack<Integer> st)
    {
        // Your code here
        st.pop();
    }
    
    //Function to print the top element of stack.
    public static void headOf_Stack(Stack<Integer> st)
    {
        // Your code here
        System.out.println(st.peek());
    }
    
    //Function to search an element in the stack.
    public static boolean find(Stack<Integer> st, int val)
    {
        // Your code here
        return st.contains(val);
    }
}


3.

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        double mid=Math.ceil((sizeOfStack+1)/2);
        s.remove((int)mid -1);
    } 
}


4.

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
};


5.

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
           arrnew[i]=st.elementAt(n-i-1);
       }
       return arrnew;
    }
    
}


6.

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        int j;
        long[] ar = new long[n];
        ar[n-1]=-1;
        for(int i=0; i<arr.length-1; i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                  ar[i]=arr[j];
                  break;
                }
                else{
                    continue;
                }
            }
            if(j==arr.length){
                ar[i]=-1;
            }
            
        }
        return ar;
    } 
}




