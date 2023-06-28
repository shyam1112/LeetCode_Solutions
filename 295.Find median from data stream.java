class MedianFinder {
    Queue<Integer> maxhp=new PriorityQueue<>(Collections.reverseOrder());
    Queue<Integer> minhp=new PriorityQueue<>();

    
    public MedianFinder() {
     
    }
    
    public void addNum(int num) {
        if(maxhp.isEmpty() || num<=maxhp.peek()){
            maxhp.offer(num);
        }else{
            minhp.offer(num);
        }

        if(maxhp.size()<minhp.size()){
            maxhp.offer(minhp.poll());
        }else if(maxhp.size()-minhp.size()>1){
            minhp.offer(maxhp.poll());
        }
    }
    
    public double findMedian() {
        
        if(maxhp.size()==minhp.size()){
            return (double)(maxhp.peek()+minhp.peek())/2;
        }
        return (double)maxhp.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
