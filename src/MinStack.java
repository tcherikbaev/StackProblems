public class MinStack {
    private Node head;
    public void push(int val) {
        if(head==null)
            head=new Node(val,val,null);
        else
            head=new Node(val,Math.min(val, head.min),head);
    }

    public void pop() {
        head=head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private static class Node{
        int val;
        int min;

        Node next;

        Node(int val,int min,Node next)
        {
            this.val=val;
            this.min=min;
            this.next=next;
        }
    }
    public static void main(String[] args) {
        MinStack obj = new MinStack();

        // Test push method
        obj.push(5);
        obj.push(3);
        obj.push(7);
        obj.push(1);

        System.out.println("Current min: " + obj.getMin()); // Output: 1

        obj.pop();

        System.out.println("Current min after one pop: " + obj.getMin()); // Output: 3

        // Test top method
        System.out.println("Current top: " + obj.top()); // Output: 7
        obj.pop();
        System.out.println("Current min after another pop: " + obj.getMin()); // Output: 3
        obj.pop();
        System.out.println("Current min after another pop: " + obj.getMin()); // Output: 5
        System.out.println("Current top after all pops: " + obj.top()); // Output: 5
    }
}

