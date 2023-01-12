package a_easy.A1381;

import java.util.LinkedList;
import java.util.List;

class CustomStack {
    List<Integer> stack;
    int container;

    public CustomStack(int maxSize) {
        this.container = maxSize;
        stack = new LinkedList<>();

    }

    public void push(int x) {
        if (stack.size() < container)
            stack.add(x);
    }

    public int pop() {
        if (stack.isEmpty()) return -1;
        int tmp = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return tmp;
    }

    public void increment(int k, int val) {
        if (stack.size() < k) k = stack.size();
        for (int i = 0; i < k; i++) {
            int tmp = stack.get(i) + val;
            stack.set(i, tmp);
        }
    }
}
/*
8ms
class CustomStack {

    private int[] stack;
    private int insertPointer;
    private int getPointer;

    public CustomStack(int maxSize) {
        this.stack = new int[maxSize];
        this.insertPointer = 0;
        this.getPointer = -1;
        // [1, 2, 3, 4, 5]
    }

    public void push(int x) {
        if (this.insertPointer < this.stack.length) {
            this.stack[this.insertPointer++] = x;
            this.getPointer++;
        }
    }

    public int pop() {
        if (this.getPointer > -1) {
            this.insertPointer--;
            return this.stack[this.getPointer--];
        } else {
            return -1;
        }
    }

    public void increment(int k, int val) {
        for (int i = 0; i < k && i < this.stack.length; i++) {
            this.stack[i] += val;
        }
    }
}

 */
/* làm thei kiểu mảng

class CustomStack {

    private int[] values;
    private int[] extras;
    private int size;


    public CustomStack(int maxSize) {
        this.values = new int[maxSize];
        this.extras = new int[maxSize];
        this.size = 0;
    }

    public void push(int x) {
        if (this.size == this.values.length) {
            return;
        }

        this.values[this.size] = x;
        this.extras[this.size] = 0;

        ++this.size;
    }

    public int pop() {
        if (this.size == 0) {
            return -1;
        }

        --this.size;

        int res = this.values[this.size] + this.extras[this.size];
        this.values[this.size] = 0;

        if (this.size > 0) {
            this.extras[this.size - 1] += this.extras[this.size];
        }

        this.extras[this.size] = 0;

        return res;
    }

    public void increment(int k, int val) {
        k = Math.min(k, this.size) - 1;

        if (k < 0) {
            return;
        }

        this.extras[k] += val;
    }
}
 */
/* làm theo kiểu danh sách liên kết

class CustomStack {

    int currLen = 0;
    int maxLen = 0;
    Node head = null;
    Node tail = null;

    class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
    public CustomStack(int maxSize) {
        this.maxLen = maxSize;
        this.currLen = 0;
    }

    public void push(int x) {
        if(currLen == maxLen)
            return;

        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }

        currLen++;
    }

    public int pop() {
        int val = -1;
        if(currLen == 0)
            return val;

        val = tail.val;

        currLen--;
        if(currLen == 0){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }

        return val;
    }

    public void increment(int k, int val) {
        Node start = head;

        if(k>currLen)
            k = currLen;

        while(k>0){
            start.val = start.val + val;
            start = start.next;
            k--;
        }
    }
}

 */
/*
class CustomStack {

    int[] stack;
    int index = -1;
    int maxSize;

    public CustomStack(int maxSize) {
        if (index < maxSize) {
            this.stack = new int[maxSize];
            this.maxSize = maxSize;
        }
    }

    public void push(int x) {
        if (index < maxSize - 1) {
            index += 1;
            stack[index] = x;
        }
    }

    public int pop() {
        if (index == -1) return - 1;
        int result = stack[index];
        index -= 1;
        return result;
    }

    public void increment(int k, int val) {
        if (k > maxSize) k = maxSize;
        for (int i = 0; i < k; i++) {
            stack[i] = stack[i] + val;
        }
    }
}
 */
/*
class CustomStack {
    int[] arr;
    int size;
    int idx;
    int[] values;
    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        values = new int[maxSize];
        size= maxSize;
        idx= -1;
    }

    public void push(int x) {
        if(idx+1 < size){
            idx++;
            arr[idx] = x;
        }
    }

    public int pop() {
        if(idx>=0){
            int res = arr[idx]+values[idx];
            if(idx > 0)values[idx-1] += values[idx];
            values[idx] = 0;
            arr[idx] = 0;
            idx--;
            return res;
        }
        return -1;
    }

    public void increment(int k, int val) {
        if(idx > -1){
            if(k-1 > idx) values[idx] += val;
            else values[k-1] += val;
        }

    }
}
 */
/*
class CustomStack {
    int maxSize;
    int[] inc;
    Stack<Integer> s;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        inc = new int[maxSize];
        s = new Stack<>();
    }

    public void push(int x) {
        if (s.size() < maxSize) {
            s.push(x);
        }
    }

    public int pop() {
        if (s.isEmpty()) return -1;

        int i = s.size() - 1, offset = inc[i], res = s.pop() + offset;

        if (i > 0)
            inc[i-1] += offset;

        inc[i] = 0;
        return res;

    }

    public void increment(int k, int val) {
        if (s.isEmpty()) return;

        int i = Math.min(k,s.size()) - 1;
        inc[i] += val;
    }
}
 */
/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
