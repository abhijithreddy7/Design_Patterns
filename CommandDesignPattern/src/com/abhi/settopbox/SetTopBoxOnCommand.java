package com.abhi.settopbox;

import com.abhi.settopbox.SetTopBox;
import com.abhi.interfaces.Command;

public class SetTopBoxOnCommand implements Command {
    SetTopBox setTopBox;

    public SetTopBoxOnCommand(SetTopBox setTopBox) {
        this.setTopBox = setTopBox;
    }

    @Override
    public void execute() {
        setTopBox.on();
        setTopBox.setChannel(123);
        setTopBox.setVolume(10);
    }
}
