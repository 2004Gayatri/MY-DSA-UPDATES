// There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

// You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas = 0;
        int total_cost =0;
        int start =0;
        int tank =0;
        for(int i=0;i<gas.length;i++){
            total_gas+=gas[i];
            total_cost+=cost[i];
            tank += gas[i] - cost[i];
            if(tank<0){
                start=i+1;
                tank =0;
            }
        }
        if (total_gas < total_cost ) {
            return -1;
        }
        return start;
    }
}