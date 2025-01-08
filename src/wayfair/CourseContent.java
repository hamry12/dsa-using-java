package wayfair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseContent {
    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = {
                {1, 0},
                {2, 0},
                {3, 1},
                {3, 2}
        };
        findOrder(numCourses, prerequisites);

    }

    private static int findOrder(int numCourses, int[][] prerequisites) {

        // created adjacencyList
        List<List<Integer>> graph= new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }

        System.out.println(graph);

        for(int[] pre: prerequisites){
            int course=pre[0];
            int prereq=pre[1];
            System.out.println(course+"\t"+prereq);
            graph.get(prereq).add(course);
        }

        System.out.println(graph);
        return 0;
    }
}
