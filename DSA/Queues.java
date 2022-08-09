1.

class Geeks{
    
    // Function to insert element into the queue
    static void insert(Queue<Integer> q, int k){
        
        // Your code here
        q.add(k);
        
    }
    
    // Function to find frequency of an element
    // rteturn the frequency of k
    static int findFrequency(Queue<Integer> q, int k){
        
        // Your code here
        return Collections.frequency(q, k);

    }
    
}


2.

public static void queueTraversal(Queue<Integer>q)
{
    //Your code here
    while(q.size()>0){
        System.out.print(q.poll()+" ");
    }
}


3.

class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> st = new Stack<>();
        Queue<Integer> qt = q;
        while(qt.size()>0)
        {
            st.push(qt.poll());
        }
        while(st.size()>0){
            qt.add(st.pop());
        }
        return qt;
        
    }
}


4.

class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here
	   s1.push(x);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   // Your code here
	   while(s1.size()>0){
	       s2.push(s1.pop());
	   }
	   int x=s2.pop();
	   while(s2.size()>0){
	       s1.push(s2.pop());
	   }
	   return x;
    }
}


5.

class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> st = new Stack<Integer>();
        Queue<Integer> qt = new LinkedList<>();
        int count=0;
        while(count < k){
            st.push(q.poll());
            count+=1;
        }
        while(st.size()>0){
            qt.add(st.pop());
        }
        while(q.size()>0){
            qt.add(q.poll());
        }
        return qt;
    }
}

