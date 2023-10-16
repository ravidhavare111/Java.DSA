// https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/description/


class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = groupSizes.length;
        HashMap<Integer,List<Integer>> HM = new HashMap<>();

        for(int i = 0 ; i<n ; i++){
            int groupS = groupSizes[i];

            if(HM.containsKey(groupS)  && HM.get(groupS).size() <= groupS){
                List<Integer> oldList = HM.get(groupS);
                oldList.add(i);
                if(oldList.size() == groupS){
                    ans.add(oldList);
                    HM.remove(groupS);
                }
                else{
                    HM.put(groupS,oldList);
                }

            }
            else{
                List<Integer> newList = new ArrayList<>();
                newList.add(i);
                HM.put(groupS,newList);
                if(newList.size() == groupS){
                    ans.add(newList);
                    HM.remove(groupS);
                }
            }
            
        }



        return ans;















        // List<List<Integer>> ans = new ArrayList<>();
        // int n = groupSizes.length;

        // for(int i = 0 ; i<n ; i++){
        //     if(groupSizes[i] == 0){
        //         continue;
        //     }
        //     int size = groupSizes[i];
        //     List<Integer> temp = new ArrayList<>();
        //     for(int j = i ; j<n ; j++){
        //         if(groupSizes[j] == size  &&  temp.size()<=size){
        //             temp.add(j);
        //             groupSizes[j] = 0;
        //         }
        //         if(temp.size() == size){
        //             ans.add(temp);
        //             break;
        //         }
                
        //     }
        // }


        // return ans;
        
    }
}
