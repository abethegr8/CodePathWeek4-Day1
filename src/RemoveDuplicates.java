/*
Problem #4: Remove Duplicates
Given a linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Can you do it without taking up extra memory?
Input: 1->2->3->3->4->4->5
Output: 1->2->5

Input: 1->1->1->2->3
Output: 2->3

The problem statement does not tell us whether the list is sorted or not.

Approach 1: Use HashTables: We can traverse the linked list use a hash table to keep track of the numbers we have already encountered. But the problem statement specifies that we cannot take up extra memory. So we can't use this approach.
Approach 2: Use 2 loops: We can use an outer loop is to pick the elements one by one and inner loop to compare the picked element with rest of the elements. But the time complexity of this approach is O(N^2)
Approach 3: Use Sorting: As a first step we need to sort the list. The code below takes a sorted list and removes duplicates from it.
Time Complexity: O(nLogn)
 */

public class RemoveDuplicates {

}
