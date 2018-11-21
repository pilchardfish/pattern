package cn.edu.ncut.lab.concurrent.request;

public class Request {
   private String name;
   private String url;
   private String data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
