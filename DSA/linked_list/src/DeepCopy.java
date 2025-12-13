import java.util.HashMap;
import java.util.Map;

public class DeepCopy {
    public NodeWithRandom copy(NodeWithRandom head){
        if(head == null){
            return null;
        }

        NodeWithRandom temp = head;
        NodeWithRandom prev = temp;
        NodeWithRandom newHead = new NodeWithRandom(temp.data);
        NodeWithRandom newTemp = newHead;
        temp = temp.next;
        Map<NodeWithRandom, NodeWithRandom> map = new HashMap<>();
        while(temp != null){
            NodeWithRandom nn = new NodeWithRandom(temp.data);
            newTemp.next = nn;
            map.put(prev, newTemp);
            prev = temp;
            newTemp = newTemp.next;
            temp = temp.next;
        }

        temp = head;
        newTemp = newHead;
        while(temp != null){
            newTemp.random = map.get(temp.random);
            temp = temp.next;
            newTemp = newTemp.next;
        }

        return newHead;
    }
}
