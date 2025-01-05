import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        java.util.Deque<Integer> que = new LinkedList<>();

        int Num = Integer.parseInt(bf.readLine());

        for(int i = 0; i < Num; i++) {
            st = new StringTokenizer(bf.readLine());
            String command = st.nextToken();
            if(command.equals("push")) {
                que.add(Integer.parseInt(st.nextToken()));
            }
            if(command.equals("pop")) {
                if(que.isEmpty()) {
                    bw.write(-1+ "\n");
                }
                else {
                    bw.write(que.poll()+ "\n");
                }
            }
            if(command.equals("size")) {
                bw.write(que.size()+ "\n");
            }
            if(command.equals("empty")) {
                if(que.isEmpty()) {
                    bw.write(1+ "\n");
                }
                else {
                    bw.write(0+ "\n");
                }
            }
            if(command.equals("front")) {
                if(que.isEmpty()) {
                    bw.write(-1+ "\n");
                }
                else {
                    bw.write(que.peek()+ "\n");
                }
            }
            if(command.equals("back")) {
                if(que.isEmpty()) {
                    bw.write(-1  + "\n");
                }
                else {
                    bw.write(que.peekLast()+ "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

}