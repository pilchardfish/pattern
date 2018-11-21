package cn.edu.ncut.lab.concurrent.request;

public class Test {
    RequestProcessor requestProcessor;
    CharacterProcessor characterProcessor;
    UrlProcessor urlProcessor;
    public Test(){

        characterProcessor=new CharacterProcessor();
        urlProcessor=new UrlProcessor(characterProcessor);
        requestProcessor=urlProcessor;
        urlProcessor.start();
        characterProcessor.start();
    }
    public static void main(String[] args) {
        Request request=new Request();
        request.setName("dingyu");
        request.setUrl("http");
        request.setData("data");
        Request request2=new Request();
        request2.setName("dingyu2");
        request2.setUrl("http");
        request2.setData("data");
        Test test=new Test();
        test.doPost(request);
        test.doPost(request2);


    }
    public  void doPost(Request request){
        this.requestProcessor.process(request);
    }
}
