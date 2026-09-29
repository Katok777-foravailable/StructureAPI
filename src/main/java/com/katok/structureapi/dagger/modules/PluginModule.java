package com.katok.structureapi.dagger.modules;

import com.katok.structureapi.StructureAPI;
import dagger.Module;
import dagger.Provides;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

@Module
public class PluginModule {
    @Provides
    public JavaPlugin plugin(StructureAPI structureAPI) {
        return structureAPI;
    }

    @Provides
    public Logger logger(JavaPlugin plugin) {
        return plugin.getLogger();
    }
}
