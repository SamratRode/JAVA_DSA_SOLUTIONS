class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    {
        TreeSet<Integer> ts=new TreeSet<Integer>();
        for(int i=0;i<arr.length;i++){
            ts.add(arr[i]);
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.addAll(ts);
        return al.get(k-1);
    } 
}
