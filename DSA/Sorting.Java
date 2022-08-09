1.

class Solution{
    public static int getMaxVal(ArrayList<Integer>arr, int n, int k)
    {
        //Your code here
        int sum=0;
        Collections.sort(arr);
        for(int i=arr.size()-1;i>n-1-k;i--){
            sum+=arr.get(i);
        }
        return sum;
        
    }
}


2.

public static int minDiff(int arr[], int n, int m){

        
    //code here   
    Arrays.sort(arr);
   int min_diff=Integer.MAX_VALUE;
    for(int i=0;i+m-1<n;i++){
        int diff=arr[i+m-1]-arr[i];
        if(diff<min_diff)
          min_diff=diff;
    }
    return min_diff;
        
        
}


3.

class Sorting
{
	public ArrayList<ArrItem> sortedWithIndices(ArrayList<Integer>arr)
	{
	    //Your code here
	    //Create an array of ArrItem objects and sort by item field
	    ArrayList<ArrItem> AI = new ArrayList<ArrItem>();
	    for (int i=0;i<arr.size(); i++){
	        AI.add(new ArrItem(arr.get(i),i));
	    }
	    Collections.sort(AI,(A1,A2) -> A1.item - A2.item);
	    return AI;
	}
}


4.


