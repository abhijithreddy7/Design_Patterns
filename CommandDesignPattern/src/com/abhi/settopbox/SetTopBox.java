package com.abhi.settopbox;

public class SetTopBox {
    public void on(){
        System.out.println("\nSetTopBox is on");
    }
    public void off(){
        System.out.println("\nSetTopBox is off");
    }
    public void setChannel(int defaultChannel){
        System.out.println("SetTopBox is set to channel: "+defaultChannel);
    }
    public void setVolume(int volume){
        System.out.println("SetTopBox volume is set to: "+volume);
    }
}
