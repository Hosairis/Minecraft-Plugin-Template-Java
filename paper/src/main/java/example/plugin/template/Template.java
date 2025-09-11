package example.plugin.template;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class Template extends JavaPlugin {
    @Getter
    private static Template instance;
//    private Metrics metrics;

    // Called when the plugin is enabled (initialize resources, register events/commands).
    @Override
    public void onEnable() {
        instance = this;

//        metrics = new Metrics(getInstance(), /* bStats ID Here */);
    }

    // Called when the plugin is disabled (cleanup resources, save data).
    @Override
    public void onDisable() {
        instance = null;
//        metrics.shutdown();
    }
}
