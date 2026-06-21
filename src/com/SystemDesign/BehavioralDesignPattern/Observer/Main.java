package com.SystemDesign.BehavioralDesignPattern.Observer;
import java.util.*;
interface Subscriber{
    void update(String video);
}
class YouTubeSubscriber implements Subscriber{
    private String name;
    public YouTubeSubscriber(String name){
        this.name=name;
    }
    @Override
    public void update(String video){
        System.out.println(name+" youtubesubs is watching "+video);
    }
}
class NotificationSubscriber implements Subscriber{
    private  String email;
    public  NotificationSubscriber(String email){
        this.email=email;
    }
    @Override
    public  void update(String video){
        System.out.println("sending mail to "+email+" new video uploaded - "+video);
    }

}
class SmsSubscriber implements Subscriber{
    private String deviceType;
    public SmsSubscriber(String deviceType){
        this.deviceType=deviceType;
    }
    @Override
    public void update(String video){
        System.out.println(deviceType+" got the sms notification "+video);
    }
}

interface YoutubeChennel{
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscriber();
}
class YoutubeChennelImp implements YoutubeChennel{

    List<Subscriber> subscribers=new ArrayList<>();
    private String video;
    @Override
    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    @Override
    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    @Override
    public void notifySubscriber(){
        for(Subscriber sub : subscribers){
            sub.update(video);
        }
    }
    void updateSubscriber(String video){
        this.video=video;
        notifySubscriber();
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Observer Design Pattern");
        YoutubeChennelImp yt=new YoutubeChennelImp();
        Subscriber hira=new YouTubeSubscriber("hira");
        Subscriber saifali=new YouTubeSubscriber("Saifali");
        yt.addSubscriber(hira);
        yt.removeSubscriber(saifali);
        yt.updateSubscriber("new video upload");
        yt.notifySubscriber();
    }
}
