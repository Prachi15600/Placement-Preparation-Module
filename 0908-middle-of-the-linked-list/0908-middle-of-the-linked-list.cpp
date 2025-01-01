/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        int count = 0;
        vector<ListNode*> res;
        ListNode* curr  = head;
        while(curr->next != nullptr) {
            count++;
            curr = curr->next;
        }
        count++;
        curr = head; 
        if(count % 2 == 0){
            for(int i=count/2; i<count; i++) {
                curr= curr->next;
                //res.push_back(curr->data);
            }
            //res.push_back(curr->next->data);
        }

        else {
            for(int i=(count/2)+1; i<count; i++) {
                curr = curr->next;
            }
        }

        return curr;
    }
};