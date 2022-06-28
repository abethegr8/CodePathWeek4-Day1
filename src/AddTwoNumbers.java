/*
Problem #3: Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a
single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:
Input: 2 -> 4 -> 3,  5 -> 6 -> 4
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807

Understand:
Can either input list be empty?
No. Each list will have anywhere from 1 to 100 nodes
Will the node values be valid
Yes. The node values will be between 0 and 9
Can the list represent a number that has leading zeroes?
No. The lists will not represent a number with leading zeroes.
HAPPY CASE
Input: 2->4->3, 5->6->4
Output: 7->0->8

EDGE CASE
Input: 9->9->9->9->9->9->9, 9->9->9->9
Output: 8->9->9->9->0->0->0->1

Match:
Multiple passes over the linked list
Do we need to discover the length of the lists? This might be useful.
Dummy Head
Are we restructuring the given lists? Creating a new one? This could be helpful in keeping track of our return list.
Two Pointers
Two pointers are used in the sense that we are traversing two separate lists. Multiple pointers for one list does not make sense here though because we are not trying to compare nodes in the list with other nodes in that same list.

Plan:
1) Create a dummy head. This will be our reference to our return list.
2) Create two pointers to traverse the two input lists.
3) Create a curr pointer that helps us build the return list
4) Initialize a variable to store the carry value, if any, as we compute the sum.
5) Traverse the two lists while our two pointers are not null.
    a) Find the values at each pointer
    b) Find and store their sum
    c) Calculate the carry over value, if any
    d) Create and attach a new node with summed value to the return list.
    e) If p1's next exists, increment p1
    f) If p2's next exists, increment p2
6) If the carry over value is > 0:
    a) Create and attach a new node with carry over value to the return list.
7) Return dummy.next

Time Complexity: O(N+M), where N and M are the lengths of the two lists.

Space Complexity: O(N+M), where N and M are the lengths of the two lists.

Implement:

Review:

Evaluate:

 */

public class AddTwoNumbers {
    public static ListNode.Node addTwoNumbers(ListNode.Node h1, ListNode.Node h2){
        ListNode.Node dummyNode = new ListNode.Node(0);
        ListNode.Node p = h1;
        ListNode.Node q = h2;
        ListNode.Node currentNode = dummyNode;
        int carry = 0;

        while(p != null || q != null){
            int x = (p != null) ? p.data : 0;
            int y = (q != null) ? q.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            currentNode.next = new ListNode.Node(sum % 10);
            currentNode = currentNode.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null){
                q = q.next;
            }
        }
        if(carry > 0){
            currentNode.next = new ListNode.Node(carry);
        }
        return dummyNode.next;
    }

}
