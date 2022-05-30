package com.abhi.settopbox;

import com.abhi.settopbox.SetTopBox;
import com.abhi.interfaces.Command;

public class SetTopBoxOffCommand implements Command {
    SetTopBox setTopBox;

    public SetTopBoxOffCommand(SetTopBox setTopBox) {
        this.setTopBox = setTopBox;
    }

    @Override
    public void execute() {
        setTopBox.off();
    }
}
