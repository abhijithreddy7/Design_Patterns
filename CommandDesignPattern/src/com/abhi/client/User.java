package com.abhi.client;

import com.abhi.settopbox.SetTopBox;
import com.abhi.settopbox.SetTopBoxOffCommand;
import com.abhi.settopbox.SetTopBoxOnCommand;
import com.abhi.tv.Tv;
import com.abhi.tv.TvOffCommand;
import com.abhi.tv.TvOnCommand;

public class User {
    public static void main(String args[])
    {
        RemoteControl remote = new RemoteControl();

        SetTopBox setTopBox = new SetTopBox();
        remote.setCommand(new SetTopBoxOnCommand(setTopBox));
        remote.pressButton();

        Tv tv =new Tv();
        remote.setCommand(new TvOnCommand(tv));
        remote.pressButton();

        remote.setCommand(new SetTopBoxOffCommand(setTopBox));
        remote.pressButton();

        remote.setCommand(new TvOffCommand(tv));
        remote.pressButton();

    }
}
