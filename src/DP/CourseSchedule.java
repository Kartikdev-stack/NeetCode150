package DP;

import java.util.*;

public class CourseSchedule {

    // Mapping each course to its prerequisites

    private static Map<Integer, List<Integer>> preMap=new HashMap<>();

    // Store all courses along the current DFS path

    private static Set<Integer> visiting=new HashSet<>();

    public static void main(String[] args) {
        int[][] prerequisites={{0,1},{1,0}};
        System.out.println(canFinish(2,prerequisites));
    }

    public static boolean canFinish(int numCourses, int[][] preRequisites) {
         for(int i=0;i<numCourses;i++){
             preMap.put(i,new ArrayList<>());
         }

         for(int[] preReq : preRequisites){
             preMap.get(preReq[0]).add(preReq[1]);
         }

         for(int c=0;c<numCourses;c++){

             // cycle detected
             if(!dfs(c)){
                 return false;
             }
         }
         return true;
    }

    public static boolean dfs(int crs){
        if(visiting.contains(crs)){
            return false;
        }

        if(preMap.get(crs).isEmpty()){
            return true;
        }

        visiting.add(crs);
        for(int pre: preMap.get(crs)){
            if(!dfs(pre)){
                return false;
            }
        }
        visiting.remove(crs);
        preMap.put(crs,new ArrayList<>());
        return true;
    }



}
