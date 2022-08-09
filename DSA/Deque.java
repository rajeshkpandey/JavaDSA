1.

// dq : deque in which element is to be pushed
// x : element to be pushed

// Function to push element x to the back of the deque.
  public static void push_back_pb(ArrayDeque<Integer> dq, int x) {
    // Your code here
    dq.offerLast(x);
}

// Function to pop element from back of the deque.
  public static void pop_back_ppb(ArrayDeque<Integer> dq) {
    // Your code here
    dq.pollLast();
}

// Function to return element from front of the deque.
  public static int front_dq(ArrayDeque<Integer> dq) {
    // Your code here
    if(dq.isEmpty())
      return -1;
    return dq.peekFirst();
}

// Function to push element x to the front of the deque.
  public static void push_front_pf(ArrayDeque<Integer> dq, int x) {
    // Your code here
    dq.offerFirst(x);
}


2.

class Solution {
    // Function to insert all elements of the array in deque.
    public static ArrayDeque<Integer> deque_Init(int arr[], int n) {
        // Your code here
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        for (int i=0; i<n;i++)
        {
            dq.offerLast(arr[i]);
        }
        return dq;
    }
}


3.

public static void printDeque(ArrayDeque<Integer> deq)
{
   //Your code here
      Iterator it = deq.iterator();
      while(it.hasNext())
          System.out.print(it.next()+" ");
      System.out.println();
}


4.

//Function to erase the element from specified position X in deque.
public static void eraseAt(ArrayDeque<Integer> deq , int X)
{
    //Your code here
    Iterator it = deq.iterator();
    for (int i=0;i<=X;i++){
        it.next();
    }
    it.remove();
}

//Function to erase the elements in range start (inclusive), end (exclusive).
public static void eraseInRange(ArrayDeque<Integer> deq , int start, int end)
{
    //Your code here
    Iterator it = deq.iterator();
    for(int i=0; i<start; i++){
        it.next();
    }
    for(int i=start;i<end; i++){
        it.next();
        it.remove();

    }
}

//Function to erase all the elements in the deque.
public static void eraseAll(ArrayDeque<Integer> deq )
{
    //Your code here
    Iterator it = deq.iterator();
    while(it.hasNext()){
        it.next();
        it.remove();
    }
}


5.

//Function to rotate deque by k places in anti-clockwise direction.
public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
{
    //Your code here
    while(k--!=0){
        deque.offerLast(deque.pollFirst());
    }
}

//Function to rotate deque by k places in clockwise direction.
public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
{
    //Your code here
    while(k--!=0){
        deque.offerFirst(deque.pollLast());
    }
}
