public class Main {
    public static void main(String[] args) {
        System.out.println("info");

        //1->2->3->4->5->null
        ListNode.Node head = new ListNode.Node(1);
        ListNode.Node second = new ListNode.Node(2);
        ListNode.Node third = new ListNode.Node(3);
        ListNode.Node fourth = new ListNode.Node(4);
        ListNode.Node fifth = new ListNode.Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

    }
}
