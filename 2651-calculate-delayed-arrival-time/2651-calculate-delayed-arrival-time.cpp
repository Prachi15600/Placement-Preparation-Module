class Solution {
public:
    int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int time;
        time = arrivalTime + delayedTime;
        if(time<24)
            return time;
        else
            return time - 24;
    }
};