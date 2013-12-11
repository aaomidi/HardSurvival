/**
 * Project: HardSurvival
 * Author: Grez_Eugor
 * Creation Date: Dec 6, 2013 at 4:39:15 PM
 */

package hardSurvival;

public class LoadConfig
{
	static Main	plugin;

	public LoadConfig(
			Main instance)
	{
		plugin = instance;

		// Set Default for Speed Mob Variables.
		plugin.getConfig().addDefault("Speed Zombie Chance", 0);
		plugin.getConfig().addDefault("Speed Zombie Health", 0);
		plugin.getConfig().addDefault("Speed Zombie Speed", 0);

		plugin.getConfig().addDefault("Speed Skeleton Chance", 0);
		plugin.getConfig().addDefault("Speed Skeleton Health", 0);
		plugin.getConfig().addDefault("Speed Skeleton Speed", 0);

		plugin.getConfig().addDefault("Speed Spider Chance", 0);
		plugin.getConfig().addDefault("Speed Spider Health", 0);
		plugin.getConfig().addDefault("Speed Spider Speed", 0);

		plugin.getConfig().addDefault("Speed Enderman Chance", 0);
		plugin.getConfig().addDefault("Speed Enderman Health", 0);
		plugin.getConfig().addDefault("Speed Enderman Speed", 0);

		plugin.getConfig().addDefault("Speed Creeper Chance", 0);
		plugin.getConfig().addDefault("Speed Creeper Health", 0);
		plugin.getConfig().addDefault("Speed Creeper Speed", 0);

		// Set Default for Invisible Mob Variables.

		plugin.getConfig().addDefault("Invisible Zombie Chance", 0);
		plugin.getConfig().addDefault("Invisible Zombie Health", 0);

		plugin.getConfig().addDefault("Invisible Skeleton Chance", 0);
		plugin.getConfig().addDefault("Invisible Skeleton Health", 0);

		plugin.getConfig().addDefault("Invisible Spider Chance", 0);
		plugin.getConfig().addDefault("Invisible Spider Health", 0);

		plugin.getConfig().addDefault("Invisible Enderman Chance", 0);
		plugin.getConfig().addDefault("Invisible Enderman Health", 0);

		plugin.getConfig().addDefault("Invisible Creeper Chance", 0);
		plugin.getConfig().addDefault("Invisible Creeper Health", 0);

		// Set Default for Strength Mob Variables.

		plugin.getConfig().addDefault("Strength Zombie Chance", 0);
		plugin.getConfig().addDefault("Strength Zombie Health", 0);
		plugin.getConfig().addDefault("Strength Zombie Damage", 0);

		plugin.getConfig().addDefault("Strength Skeleton Chance", 0);
		plugin.getConfig().addDefault("Strength Skeleton Health", 0);
		plugin.getConfig().addDefault("Strength Skeleton Damage", 0);

		plugin.getConfig().addDefault("Strength Spider Chance", 0);
		plugin.getConfig().addDefault("Strength Spider Health", 0);
		plugin.getConfig().addDefault("Strength Spider Damage", 0);

		plugin.getConfig().addDefault("Strength Enderman Chance", 0);
		plugin.getConfig().addDefault("Strength Enderman Health", 0);
		plugin.getConfig().addDefault("Strength Enderman Damage", 0);

		plugin.getConfig().addDefault("Strength Creeper Chance", 0);
		plugin.getConfig().addDefault("Strength Creeper Health", 0);
		plugin.getConfig().addDefault("Strength Creeper Damage", 0);

		// Set Default for Jump Mob Variables.

		plugin.getConfig().addDefault("Jump Zombie Chance", 0);
		plugin.getConfig().addDefault("Jump Zombie Health", 0);
		plugin.getConfig().addDefault("Jump Zombie Damage", 0);
		plugin.getConfig().addDefault("Jump Zombie Jump", 0);

		plugin.getConfig().addDefault("Jump Skeleton Chance", 0);
		plugin.getConfig().addDefault("Jump Skeleton Health", 0);
		plugin.getConfig().addDefault("Jump Skeleton Damage", 0);
		plugin.getConfig().addDefault("Jump Skeleton Jump", 0);

		plugin.getConfig().addDefault("Jump Spider Chance", 0);
		plugin.getConfig().addDefault("Jump Spider Health", 0);
		plugin.getConfig().addDefault("Jump Spider Damage", 0);
		plugin.getConfig().addDefault("Jump Spider Jump", 0);

		plugin.getConfig().addDefault("Jump Enderman Chance", 0);
		plugin.getConfig().addDefault("Jump Enderman Health", 0);
		plugin.getConfig().addDefault("Jump Enderman Damage", 0);
		plugin.getConfig().addDefault("Jump Enderman Jump", 0);

		plugin.getConfig().addDefault("Jump Creeper Chance", 0);
		plugin.getConfig().addDefault("Jump Creeper Health", 0);
		plugin.getConfig().addDefault("Jump Creeper Damage", 0);
		plugin.getConfig().addDefault("Jump Creeper Jump", 0);
	}
}
