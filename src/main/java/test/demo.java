package test;

/**
 * @program algorithm
 * @description: demo
 * @author: xiewenhui
 * @create: 2021/03/07 23:49
 */
public class demo {
    //队头
    private int front;
    //队尾
    private int end;
    //队列有效长度
    private int elements;
    //队列
    private long[] queue;

    public demo() {
        queue = new long[5];
        front = -1;
        end = -1;
    }
    public demo(int length) {
        queue = new long[length];
        front = -1;
        end = -1;
    }

    /**
     * 插入元素
     */
    public void add(int value) {
        if (isFull()) {
            System.out.println("队列已满，请删除");
//            throw new IndexOutOfBoundsException();
        }
        if (isEmpty()) {
            front = 0;
        }
        if ((end == queue.length - 1)) {
            end = -1;
        }
        queue[++end] = value;
        elements++;
    }

    /**
     * 删除元素
     */
    public void delete() {
        if ((front == queue.length)) {
            front = -1;
        }
        queue[front] = -1;
        front++;
        elements--;
    }

    /**
     * 查看队列
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("元素为空，请先插入元素");
        }
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] == -1) {
                //X为占位符，表示该节点元素没有元素
                System.out.print("X" + " ");
            } else {
                System.out.print(queue[i] + " ");
            }
        }
        System.out.println();
    }

    /**
     * 查看队头
     */
    public long getFront() {
        if (isEmpty()) {
            System.out.println("队尾为空");
            return 0;
        }
        return queue[front];
    }

    /**
     * 查看队尾
     */
    public long getEnd() {
        if (isEmpty()) {
            return -1;
        }
        return queue[end];
    }

    /**
     * 查看队列里面几个元素
     */
    public int size() {
        return elements;
    }

    /**
     * 队列是否为空
     */
    public boolean isEmpty() {
        return elements == 0;
    }

    /**
     * 队列是否满了
     */
    public boolean isFull() {
        return elements == queue.length;
    }

    public static void main(String[] args) {
        demo flag = new demo();
        for(int i = 0; i < 12; i++){
            flag.add(i);
//            System.out.println( flaggit.getFront());
        }
        flag.display();
    }

}