package cn.edu.ncut.lab.concurrent.request;

import java.util.concurrent.LinkedBlockingQueue;

public class UrlProcessor extends Thread implements RequestProcessor {
    RequestProcessor nextrequestProcessor;
    final  LinkedBlockingQueue<Request>queue=new LinkedBlockingQueue<>();
    public UrlProcessor(RequestProcessor nextrequestProcessor){
        this.nextrequestProcessor=nextrequestProcessor;
    }

    @Override
    public void run() {
        while(true){
            try {
                Request request=queue.take();
                System.out.println("Url 解析"+request.getName());
                nextrequestProcessor.process(request);

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
