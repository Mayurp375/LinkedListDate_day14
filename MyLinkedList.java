public class MyLinkedList<K> {
    public Main.INode<K> head;
    public Main.INode<K> tail;




        public void add (INode < K > newNode) {
            if (this.tail == null) {
                this.tail = newNode;
            }
            if (this.head == null) {
                this.head = newNode;
            } else {
                Main.INode<K> tempNode = this.head;
                this.head = newNode;
                this.head.setNext(tempNode);
            }

        }
        public INode<K>pop(){
            Main.INode<K>tempNode = this.head;
            return tempNode;
        }
        public void printMyNode(){
            System.out.println("My Nodes:"+head);
        }

    }

