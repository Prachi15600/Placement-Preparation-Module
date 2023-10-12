/**
 * // This is the MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * class MountainArray {
 *   public:
 *     int get(int index);
 *     int length();
 * };
 */
int peakIndex(MountainArray &mountainArr){
    int n=mountainArr.length();
    int l = 0, h = n-1;
    
    while(l<h){
        int mid = (l + h)/2;
        
        if(mountainArr.get(mid+1)>mountainArr.get(mid)){
            l = mid+1;
        }
        
        else{
            h = mid;
        }
    }
    return l;
}


int leftFind(MountainArray &mountainArr, int l, int h, int target){
    int mid;
    while(l<=h){
        mid = (l + h)/2;
        if(mountainArr.get(mid)==target){
            return mid;
        }
        
        else if(mountainArr.get(mid)>target){
            h = mid-1;
        }
        else{
            l = mid+1;
        }
    }
    return -1;
}
                
    
int rightFind(MountainArray &mountainArr, int l, int h, int target){
    int mid;
    while(l<=h){
        mid = (l + h)/2;
        if(mountainArr.get(mid)==target){
            return mid;
        }
        
        else if(mountainArr.get(mid)>target){
            l = mid+1;
        }
        else{
            h = mid-1;
        }
    }
    return -1;
}


class Solution {
public:
    int findInMountainArray(int target, MountainArray &mountainArr) {
        int n = mountainArr.length();
        
        int idx = peakIndex(mountainArr);
        
        int result = leftFind(mountainArr, 0, idx, target);
        
        if(result != -1){
            return result;
        }
        
        result = rightFind(mountainArr, idx+1, n-1, target);
        
        return result;
    }
};