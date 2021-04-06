package thread;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

//练习Thread,实现多线程同步下载图片
public class TestThread2 extends Thread{
    private String url;//网络图片地址
    private String name;//保存的文件名

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public TestThread2() {
    }

    //下载图片线程的执行体
    @Override
    public void run() {
        WebDownload webDownload = new WebDownload();
        webDownload.download(url,name);
        System.out.println("下载了文件："+name);
    }

    public static void main(String[] args) {
        TestThread2 testThread1 = new TestThread2("https://csdnimg.cn/release/blogv2/dist/pc/img/original.png","原创");
        TestThread2 testThread2 = new TestThread2("https://csdnimg.cn/identity/blog6.png","等级");
        TestThread2 testThread3 = new TestThread2("https://csdnimg.cn/release/blogv2/dist/pc/img/tobarCollect.png","收藏");

        testThread1.start();
        testThread2.start();
        testThread3.start();
    }
}




//下载器
class WebDownload{
    //下载方法
    public void download(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，download方法出现问题");
        }
    }
}