class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val = val;
	}
}
public class AddTwoNumbers{
	public ListNode addSum(ListNode l1, ListNode l2){
		ListNode temp1 = l1;
		ListNode temp2 = l2;
		ListNode temp = null;
		while(temp1 != null){
			temp.val = temp1.val + temp2.val;
			temp = new ListNode(temp.val);
			temp1 = temp1.next;
			temp2 = temp2.next;

		}
	}
}