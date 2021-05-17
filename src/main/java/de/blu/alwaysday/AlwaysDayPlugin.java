package de.blu.alwaysday;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

public final class AlwaysDayPlugin extends JavaPlugin {

  private static final int TICKS_REPEATING = 20 * 15;

  @Override
  public void onEnable() {
    Bukkit.getScheduler().scheduleSyncRepeatingTask(this, this::updateTime, 0, TICKS_REPEATING);
  }

  private void updateTime() {
    for (World world : Bukkit.getWorlds()) {
      world.setTime(8000);
    }
  }
}
