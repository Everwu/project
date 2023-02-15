public class leetcode_2 {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = null;
            ListNode temp = null;
            int carry = 0;
            while (l1 != null || l2 != null) {
                int sum = carry;
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }
                ListNode node = new ListNode(sum % 10);
                carry = sum / 10;
                if (temp == null) {
                    temp = head = node;
                } else {
                    temp.next = node;
                    temp = temp.next;
                }
            }
            if (carry > 0) {
                temp.next = new ListNode(carry);
            }
            return head;
        }
}
/*
### ****Tips****

`decimal`-> carry = sum / 10

### Algorithm

- Initialize pre node to dummy head of the returning list.
- Initialize carry to 000.
- Loop through lists l1 and l2
    - Set num1 to node l1's value.
    - Set num2 to node l2l2*l*2's value.
    - Set sum= num1 **+ num2 + *carry*.
    - Update carry = sum / 10.
    - [pre.next](http://pre.next) = create new ListNode sum % 10;
- Return dummy.next node.
 */