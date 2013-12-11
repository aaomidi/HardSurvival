/**
 * Project: HardSurvival
 * Author: Grez_Eugor
 * Creation Date: Dec 6, 2013 at 4:17:36 PM
 */

package hardSurvival;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		getLogger().info("HardSurvival has been activated!");

		new LoadConfig(this);

		this
				.getServer()
				.getPluginManager()
				.registerEvents(new ZombieSpawnListener(), this);
		this
				.getServer()
				.getPluginManager()
				.registerEvents(new SkeletonSpawnListener(this), this);
		this
				.getServer()
				.getPluginManager()
				.registerEvents(new SpiderSpawnListener(), this);
		this
				.getServer()
				.getPluginManager()
				.registerEvents(new CreeperSpawnListener(), this);
		this
				.getServer()
				.getPluginManager()
				.registerEvents(new EndermanSpawnListener(), this);
		this
				.getServer()
				.getPluginManager()
				.registerEvents(new PlayerMoveListener(this), this);
	}

	@Override
	public void onDisable()
	{
		getLogger().info("HardSurvival has been deactivated!");
	}

	public boolean onCommand(
			CommandSender sender,
			Command command,
			String label,
			String args[])
	{
		if (command.getName().equalsIgnoreCase("check"))
		{
			if (PlayerMoveListener.visionCount != 0)
			{
				sender.sendMessage("visionCount: "
						+ PlayerMoveListener.visionCount);
			}

			else
			{
				sender.sendMessage("visionCount: "
						+ PlayerMoveListener.visionCount);
			}
			return true;
		}
		return false;
	}
}
