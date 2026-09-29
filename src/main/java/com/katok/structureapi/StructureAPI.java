package com.katok.structureapi;

import com.katok.structureapi.dagger.components.DaggerPluginComponent;
import org.bukkit.plugin.java.JavaPlugin;

public class StructureAPI extends JavaPlugin {
    public void onEnable() {
        DaggerPluginComponent.factory()
                .create(this)
                .inject(this);
    }
}
