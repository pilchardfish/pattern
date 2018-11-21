package cn.edu.ncut.lab.concurrent.request;

import java.util.concurrent.LinkedBlockingQueue;

public class CharacterProcessor extends Thread implements RequestProcessor {
    final LinkedBlockingQueue<Request> queue=new LinkedBlockingQueue<>();

    @Override
    public void run() {
        while(true){
            try {
                Request request=queue.take();
                System.out.println("字符解析"+request.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override

    public void process(Request request) {
        queue.add(request);
    }
}
