package uwu.misaka;

import mindustry.mod.*;

import static mindustry.Vars.ui;

public class Ichi extends Mod{
    public Ichi(){
        ui.listfrag = new CustomPlayerDialog();
        ui.listfrag.build(ui.hudGroup);
    }
}
