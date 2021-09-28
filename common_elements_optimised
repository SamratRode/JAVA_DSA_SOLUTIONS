class Solution{
    public static ArrayList<Integer> common_element(ArrayList<Integer>v1, ArrayList<Integer>v2)
    {
        //Your code here
        ArrayList<Integer> v3=new ArrayList<Integer>();
        Collections.sort(v1);
        Collections.sort(v2);
        
        int a=0;
        int b=0;
        while(a<v1.size()&&b<v2.size()){
            int c=v1.get(a);
            int d=v2.get(b);
            if(c==d){
                v3.add(c);
                a++;
                b++;
            }
            else if(c>d){
                b++;
            }
            else{
                a++;
            }
        }
                    
                    
                    
            //         v3.add(j);
            //         break;
                    
            //     }
            // }
        // Collections.sort(v3);
        
       
        return v3;
    }
}
