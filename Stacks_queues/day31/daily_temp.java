package Stacks_queues.day31;

import java.util.Stack;

public class daily_temp {
    class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
    

      for(int i =0; i<temperatures.length;i++)
       { 
        while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
            int idx = stack.pop();
            result[idx]=i-idx;
        }
        stack.push(i);
        }
        return result;
        
    }
}
}
