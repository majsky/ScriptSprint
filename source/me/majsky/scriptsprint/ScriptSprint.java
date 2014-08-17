package me.majsky.scriptsprint;

import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.JsePlatform;

public class ScriptSprint {
    
    public static void main(String[] args){
        Globals globals = JsePlatform.standardGlobals();
        LuaValue chunk = globals.load(ScriptSprint.class.getResourceAsStream("/main.lua"), "main.lua", "t", globals);
        chunk.call();
    }
    
}
