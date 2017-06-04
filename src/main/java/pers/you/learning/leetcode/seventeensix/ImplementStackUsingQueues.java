package pers.you.learning.leetcode.seventeensix;

/*
【极客学院版】
LeetCode225. Implement Stack using Queues
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Notes:
You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 */


import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;

public class ImplementStackUsingQueues {
    /** Initialize your data structure here. */
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    int size;

    public ImplementStackUsingQueues() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (empty() || !queue1.isEmpty()) {
            queue1.offer(x);
        } else {
            queue2.offer(x);
        }
        size++;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int x;
        if (!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            x = queue1.poll();
        } else {
            while (queue2.size() > 1) {
                queue1.offer(queue2.poll());
            }
            x = queue2.poll();
        }
        size--;
        return x;
    }

    /** Get the top element. */
    public int top() {
        int x;
        if (!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            x = queue1.poll();
            System.out.println(x);
            queue2.offer(x);
        } else {
            while (queue2.size() > 1) {
                queue1.offer(queue2.poll());
            }
            x = queue2.poll();
            queue1.offer(x);
        }
        return x;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return size == 0 ? true : false;
    }

    @Test
    public void test() {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.top());
        stack.push(5);
        stack.pop();
        stack.push(6);
        System.out.println(stack.top());

    }

}
