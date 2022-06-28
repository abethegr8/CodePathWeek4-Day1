/*
Problem #4: Remove Duplicates
Given a linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Can you do it without taking up extra memory?
Input: 1->2->3->3->4->4->5
Output: 1->2->5

Input: 1->1->1->2->3
Output: 2->3

The problem statement does not tell us whether the list is sorted or not.

Approach 1: Use HashTables: We can traverse the linked list use a hash table to keep track of the numbers we have already encountered.
But the problem statement specifies that we cannot take up extra memory. So we can't use this approach.
Approach 2: Use 2 loops: We can use an outer loop is to pick the elements one by one and inner loop to compare the picked element with rest of the elements.
But the time complexity of this approach is O(N^2)
Approach 3: Use Sorting: As a first step we need to sort the list. The code below takes a sorted list and removes duplicates from it.
Time Complexity: O(nLogn)

Understand:
Are we only getting integers in the linked list?
Are there are Time/Space constraints?
What is the min/max length of the LL? what is the max/min of an element?

Match:

Plan:

Implement:

Review:

Evaluate:




 */

public class RemoveDuplicates {
    public ListNode.Node removeDuplicates(ListNode.Node head){
        ListNode.Node dummy = new ListNode.Node(0);         //create a dummy node that points to its next which is head. we'll return this.
        dummy.next = head;
        ListNode.Node currentNode = head;       //temp pointer, keeping point at head, its going to traverse through the list think of it as a throwaway

        while(currentNode != null && currentNode.next != null){     //while loop, if curr & curr.next != null keep traversing LL.
            if(currentNode.data == currentNode.next.data){          //if we find that curr and .next are equal then run the delete function.
                currentNode.next = currentNode.next.next;           //this is the delete function
            }
            else{
                currentNode = currentNode.next;     //we only get here if nodes are not equal so lets just move curr node along make it next
            }
        }
        return dummy.next;      //return head or the temp pointer we created pointing to head.
    }

}
