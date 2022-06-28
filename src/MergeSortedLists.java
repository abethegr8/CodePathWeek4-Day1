/*
Problem #2: Merge Two Sorted Lists
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

1. U-nderstand
Clarify input and output parameters of the problem:

Can the input lists be empty?
Yes. Assume each list can have between 0 and 50 nodes.
Can node values be negative?
Yes. Node values can range from -100 to 100
Will the input lists be sorted?
No. They can be unsorted
Will the input lists have the same length?
No, they may have differing lengths.
Run through a set of example cases:

HAPPY CASE
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

EDGE CASE
Input: 1->2->4 -5->3->2->1
Output: -5->1->1->2->2->3->4

EDGE CASE
Input: [ ], [ ]
Output: [ ]

Match:
When working with Linked Lists there are a few common techniques we can consider:

Multiple passes over the linked list
Do we need to discover the length of the lists? Not necessarily.
Dummy Head
Are we restructuring the given lists? Creating a new one? Yes; this could be useful when trying to keep a reference to our return list.
Two Pointers
Multiple pointers are useful in the sense that they will allow us to traverse the two linked lists and build a return list.

Plan:
1) Create a dummy head. This will be the start of our return list.
2) Create 2 pointers to traverse the input lists, p1 and p2
3) Create a pointer to build our return list, p
4) While p1 and p2 are not null:
    a) Find the node pointed to by either p1 or p2 with smaller value. Set p.next to be the node with smaller value
    b) Advance p.
5) If p1 has not reached the end of its input list, set p.next to be p1
6) If p2 has not reached the end of its input list, set p.next to be p2
7) Return dummy.next

Time Complexity: O(N+M), where N and M are the lengths of the input lists

Space Complexity: O(1), since no new nodes are created.

Implement:

Review:

Evaluate:

 */

public class MergeSortedLists {
    public static ListNode.Node mergeSortedLists(ListNode.Node head1, ListNode.Node head2){
        ListNode.Node dummy = new ListNode.Node(0);
        ListNode.Node tail = dummy;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                tail.next = head1;
                head1 = head1.next;
            }
            else{
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        if(head1 != null){
            tail.next = head1;
        }
        else if(head2 != null){
            tail.next = head2;
        }

        return dummy.next;
    }


}
