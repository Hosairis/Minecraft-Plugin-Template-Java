package example.plugin.template;

import lombok.Getter;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public class Template extends JavaPlugin {
    @Getter
    private static Template instance;
    private Metrics metrics = null;

    // Called when the plugin is enabled (initialize resources, register events/commands).
    @Override
    public void onEnable() {
        instance = this;

        metrics = new Metrics(instance, 123); // Remember to change the plugin ID
    }

    // Called when the plugin is disabled (cleanup resources, save data).
    @Override
    public void onDisable() {
        instance = null;
        metrics.shutdown();
    }
}
