/*
Problem 1: Remove Nth Node from End of List
Given a linked list, remove the n-th node from the end of list and return its head.
Example:

Input: 1->2->3->4->5, n = 2
Output: 1->2->3->5

Explanation: We remove the second node from the end, the node with value 4

Understand:
Can the input be empty?
No. Assume the input list has at least one node.
Will the value of n be valid?
Yes. Assume n will be between 1 and the number of nodes in the list.
HAPPY CASE
Input: 1->2->3->4->5, n = 2
Output: 1->2->3->5

EDGE CASE
Input: 1, n = 1
Output: [ ]

EDGE CASE
Input: 1->2, n = 1
Output: 1

EDGE CASE
Input: 1->2, n = 2
Output: 2

Match:
Multiple passes over the linked list
Do we need to discover the length of the lists? This might be useful when trying to delete a node from the end of the list.
Dummy Head
Are we restructuring the given lists? Creating a new one? Yes; this could be useful when trying to delete the first node in the list.
Two Pointers
Two pointers would be useful in helping us find the node that we're trying to remove, and then allow us to restructure the pointers to "remove" the node from the list.

Plan:
1) Create a dummy node and attach it to the head of the input list.
2) Initialize 2 pointers, first and second, to point to the dummy node.
3) Advance the first pointer so that the gap between the first and second pointers is n nodes
4) While the first pointer does not equal null
    a) Advance the first and second pointers by 1
5) Delete the node being pointed to by second.
6) Return dummy.next

Time Complexity: O(N), N is the number of nodes in the list

Space Complexity: O(1)

Implement: see method below

Review: Verify Code works

Evaluate: Time:O(N), Space:O(1);

 */

public class RemoveNthNode {

    //Input: 1->2->3->4->5->null, n = 2
    //                s     f
    //Output: 1->2->3->5
    public static ListNode.Node removeNthNode(ListNode.Node head, int n){
        ListNode.Node dummy = new ListNode.Node(0);
        dummy.next = head;
        ListNode.Node first = dummy;
        ListNode.Node second = dummy;

        //advance first n times ahead of second
        for(int i=1; i <= n+1; i++){
            first = first.next;
        }

        //move first to the end maintaining gap
        while(first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

}
