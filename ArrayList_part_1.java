class Solution 
{ 
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query) 
    { 
        // code here
        if(Q == 1)
        {
            int p = Query.get(0);
            int r = Query.get(1);
            
            A.add(p, r);
            
            return A;
        }
        else
        {
            ArrayList<Integer> res = new ArrayList<Integer>();
            
            int p = Query.get(0);
            
            res.add(A.lastIndexOf(p)); 
            
            return res;
        }
    }
}