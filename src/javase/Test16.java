package javase;



/**
 * 手动实现一个栈 -> 数组实现
 *
 * @author 路飞
 * @create 2021/2/26 22:05
 */
public class Test16 {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);

        stack.list();
        System.out.println("出栈");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.list();


    }
}

class ArrayStack{
    private int maxSize;
    private int[] stack;
    private int top = -1; //栈顶初始为-1

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    //判断栈是否为空
    public boolean isEmpty(){
        return top == -1;
    }

    //判断栈是否满
    public boolean isFull(){
        return top == maxSize -1;
    }

    //入栈
    public void push(int value){
        //判断栈是否满
        if (isFull()){
            System.out.printf("栈已满");
            return;
        }
       top ++;
        stack[top] = value;
    }

    //出栈
    public int pop(){
        //判断栈是否为空
        if (isEmpty()){
            throw new RuntimeException("栈为空");
        }

        int value = stack[top];
        top --;
        return value;
    }

    //打印栈 top开始
    public void list(){
        if (isEmpty()){
            System.out.println("栈为空");
        }

        for (int i = top; i >=0 ; i -- ){
            System.out.printf("栈stack[%d] = %d\n",i,stack[top]);
        }
    }
}

