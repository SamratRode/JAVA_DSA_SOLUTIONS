public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<A.size();i++){
            ArrayList<Integer> a=new ArrayList<Integer>();
            for(int j=i+1;j<A.size();j++){
                TreeMap<Character,Integer> tm1=new TreeMap<Character,Integer>();
                char[] ch1=new char[A.get(i).length()];
                for(int k=0;k<A.get(i).length();k++){
                    ch1[k]=A.get(i).charAt(k);
                    tm1.put(ch1[k],tm1.getOrDefault(ch1[k],0)+1);
                    

                }
                // System.out.println(i+" "+tm1);
                TreeMap<Character,Integer> tm2=new TreeMap<Character,Integer>();
                char[] ch2=new char[A.get(j).length()];
                for(int l=0;l<A.get(j).length();l++){
                    ch2[l]=A.get(j).charAt(l);
                    tm2.put(ch2[l],tm2.getOrDefault(ch2[l],0)+1);

                }
                // System.out.println(j+" "+tm2);
                if(tm1.equals(tm2)){
                    a.add(i+1);
                    a.add(j+1);
                }
                
            }
            if(!a.isEmpty()){
                al.add(a);}
        }
        return al;
    }
}
