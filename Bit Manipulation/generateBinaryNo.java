import java.util.Queue;

public class generateBinaryNo {
    public static void main(String[] arg){
        ArrayList<String> li = new Arraylist<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        int n = 5;
        while(n>0){
            String str = queue.poll();
            li.add(str);
            queue.offer(str+"0");
            queue.offer(str+"1");
            n--;
        }
        System.out.println(li);
    }
}
