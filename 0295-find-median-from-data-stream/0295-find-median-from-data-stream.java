class MedianFinder {
    PriorityQueue<Integer> rightMinHeap;
    PriorityQueue<Integer> leftMaxHeap;
    public MedianFinder() {
        rightMinHeap = new PriorityQueue<>();
        leftMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(leftMaxHeap.isEmpty() || num < leftMaxHeap.peek()){
            leftMaxHeap.add(num);
        }
        else {
            rightMinHeap.add(num);
        }

        if(leftMaxHeap.size() > rightMinHeap.size()+1) {
            rightMinHeap.add(leftMaxHeap.poll());
        }
        else if(leftMaxHeap.size() < rightMinHeap.size()) {
            leftMaxHeap.add(rightMinHeap.poll());
        }
    }
    
    public double findMedian() {
        if(leftMaxHeap.size() == rightMinHeap.size()) {
            return (double)(rightMinHeap.peek() + leftMaxHeap.peek()) / 2;
        }

        return (double) leftMaxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */