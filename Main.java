public class Main {
    public static void main(String[] args) {

    }

    public interface INode<K> {
        K getKey();

        void setKey(K key);

        INode<K> getNext();

        void setNext(INode<K> next);
    }

    public class MyNode<K> implements INode<K> {
        private K key;
        private INode<K> next;

        @Override
        public K getKey() {
            return null;
        }

        @Override
        public void setKey(K key) {

        }

        @Override
        public INode<K> getNext() {
            return next;
        }

        @Override
        public void setNext(INode<K> next) {
            this.next = next;
        }



        @Override
        public String toString() {
            StringBuilder myNodeString = next new StringBuilder();
            myNodeString.append("MyNode{" + "key=")
                    .append(key).append("}");
            if (next != null) {
                myNodeString.append("->").append(next);
            }
            return myNodeString.toString();

        }

    }
}