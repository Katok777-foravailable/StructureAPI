package com.katok.structureapi.dagger.components;

import com.katok.structureapi.StructureAPI;
import com.katok.structureapi.dagger.modules.PluginModule;
import dagger.BindsInstance;
import dagger.Component;
import jakarta.inject.Singleton;

@Singleton
@Component(modules = {PluginModule.class})
public interface PluginComponent {
    void inject(StructureAPI plugin);

    @Component.Factory
    interface Factory {
        PluginComponent create(@BindsInstance StructureAPI plugin);
    }
}
