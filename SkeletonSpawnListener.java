/**
 * Project: HardSurvival
 * Author: Grez_Eugor
 * Creation Date: Dec 6, 2013 at 4:24:37 PM
 */

package hardSurvival;

import java.util.Arrays;
import java.util.Random;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SkeletonSpawnListener implements Listener
{
	private int			speedChance;
	private int			invisibleChance;
	private int			jumpChance;
	private int			strengthChance;

	private Integer[]	chances	=
								{
			speedChance, invisibleChance, jumpChance, strengthChance
								};

	Main				plugin;

	public SkeletonSpawnListener(
			Main instance)
	{
		plugin = instance;

		speedChance = plugin.getConfig().getInt("Speed Skeleton Chance");

		invisibleChance =
				plugin.getConfig().getInt("Invisible Skeleton Chance");

		jumpChance = plugin.getConfig().getInt("Jump Skeleton Chance");

		strengthChance = plugin.getConfig().getInt("Strength Skeleton Chance");

		Arrays.sort(chances);

		if ((speedChance
				+ invisibleChance
				+ jumpChance + strengthChance) > 100)
		{
			new Main().onDisable();
		}
	}

	@EventHandler
	public void onSkeletonSpawn(CreatureSpawnEvent event)
	{
		EntityType skeleton = event.getEntityType();

		Random rand = new Random();
		int number = rand.nextInt(100);

		if (skeleton.equals(EntityType.SKELETON))
		{
			if (number > chances[3])
			{
				if (number > chances[2])
				{
					if (number > chances[1])
					{
						if (number >= chances[0])
						{
							if (chances[0] == speedChance)
							{
								event
										.getEntity()
										.addPotionEffect(
												new PotionEffect(
														PotionEffectType.SPEED,
														Integer.MAX_VALUE,
														plugin
																.getConfig()
																.getInt(
																		"Speed Skeleton Speed")));

								event.getEntity().setHealth(
										plugin.getConfig().getInt(
												"Speed Skeleton Health"));

								event.getEntity().setMaxHealth(
										plugin.getConfig().getInt(
												"Speed Skeleton Health"));
							}

							else if (chances[0] == invisibleChance)
							{
								event.getEntity().addPotionEffect(
										new PotionEffect(
												PotionEffectType.INVISIBILITY,
												Integer.MAX_VALUE,
												1));

								event.getEntity().setHealth(
										plugin.getConfig().getInt(
												"Invisible Skeleton Health"));

								event.getEntity().setMaxHealth(
										plugin.getConfig().getInt(
												"Invisible Skeleton Health"));
							}

							else if (chances[0] == strengthChance)
							{
								event
										.getEntity()
										.addPotionEffect(
												new PotionEffect(
														PotionEffectType.INCREASE_DAMAGE,
														Integer.MAX_VALUE,
														plugin
																.getConfig()
																.getInt(
																		"Strength Skeleton Damage")));

								event.getEntity().setHealth(
										plugin.getConfig().getInt(
												"Strength Skeleton Health"));

								event.getEntity().setMaxHealth(
										plugin.getConfig().getInt(
												"Strength Skeleton Health"));
							}

							else if (chances[0] == jumpChance)
							{
								event.getEntity().addPotionEffect(
										new PotionEffect(
												PotionEffectType.JUMP,
												Integer.MAX_VALUE,
												plugin.getConfig().getInt(
														"Jump Skeleton Jump")));

								event.getEntity().setHealth(
										plugin.getConfig().getInt(
												"Jump Skeleton Health"));

								event.getEntity().setMaxHealth(
										plugin.getConfig().getInt(
												"Jump Skeleton Health"));
							}
						}
					}

					else if (chances[1] == speedChance)
					{
						event.getEntity().addPotionEffect(
								new PotionEffect(
										PotionEffectType.SPEED,
										Integer.MAX_VALUE,
										plugin.getConfig().getInt(
												"Speed Skeleton Speed")));

						event.getEntity().setHealth(
								plugin.getConfig().getInt(
										"Speed Skeleton Health"));

						event.getEntity().setMaxHealth(
								plugin.getConfig().getInt(
										"Speed Skeleton Health"));
					}

					else if (chances[1] == invisibleChance)
					{
						event.getEntity().addPotionEffect(
								new PotionEffect(
										PotionEffectType.INVISIBILITY,
										Integer.MAX_VALUE,
										1));

						event.getEntity().setHealth(
								plugin.getConfig().getInt(
										"Invisible Skeleton Health"));

						event.getEntity().setMaxHealth(
								plugin.getConfig().getInt(
										"Invisible Skeleton Health"));
					}

					else if (chances[1] == strengthChance)
					{
						event.getEntity().addPotionEffect(
								new PotionEffect(
										PotionEffectType.INCREASE_DAMAGE,
										Integer.MAX_VALUE,
										plugin.getConfig().getInt(
												"Strength Skeleton Damage")));

						event.getEntity().setHealth(
								plugin.getConfig().getInt(
										"Strength Skeleton Health"));

						event.getEntity().setMaxHealth(
								plugin.getConfig().getInt(
										"Strength Skeleton Health"));
					}

					else if (chances[1] == jumpChance)
					{
						event.getEntity().addPotionEffect(
								new PotionEffect(
										PotionEffectType.JUMP,
										Integer.MAX_VALUE,
										plugin.getConfig().getInt(
												"Jump Skeleton Jump")));

						event.getEntity().setHealth(
								plugin.getConfig().getInt(
										"Jump Skeleton Health"));

						event.getEntity().setMaxHealth(
								plugin.getConfig().getInt(
										"Jump Skeleton Health"));
					}
				}

				else if (chances[2] == speedChance)
				{
					event.getEntity().addPotionEffect(
							new PotionEffect(
									PotionEffectType.SPEED,
									Integer.MAX_VALUE,
									plugin.getConfig().getInt(
											"Speed Skeleton Speed")));

					event.getEntity().setHealth(
							plugin.getConfig().getInt("Speed Skeleton Health"));

					event.getEntity().setMaxHealth(
							plugin.getConfig().getInt("Speed Skeleton Health"));
				}

				else if (chances[2] == invisibleChance)
				{
					event.getEntity().addPotionEffect(
							new PotionEffect(
									PotionEffectType.INVISIBILITY,
									Integer.MAX_VALUE,
									1));

					event.getEntity().setHealth(
							plugin.getConfig().getInt(
									"Invisible Skeleton Health"));

					event.getEntity().setMaxHealth(
							plugin.getConfig().getInt(
									"Invisible Skeleton Health"));
				}

				else if (chances[2] == strengthChance)
				{
					event.getEntity().addPotionEffect(
							new PotionEffect(
									PotionEffectType.INCREASE_DAMAGE,
									Integer.MAX_VALUE,
									plugin.getConfig().getInt(
											"Strength Skeleton Damage")));

					event.getEntity().setHealth(
							plugin.getConfig().getInt(
									"Strength Skeleton Health"));

					event.getEntity().setMaxHealth(
							plugin.getConfig().getInt(
									"Strength Skeleton Health"));
				}

				else if (chances[2] == jumpChance)
				{
					event.getEntity().addPotionEffect(
							new PotionEffect(
									PotionEffectType.JUMP,
									Integer.MAX_VALUE,
									plugin.getConfig().getInt(
											"Jump Skeleton Jump")));

					event.getEntity().setHealth(
							plugin.getConfig().getInt("Jump Skeleton Health"));

					event.getEntity().setMaxHealth(
							plugin.getConfig().getInt("Jump Skeleton Health"));
				}
			}

			else if (chances[3] == speedChance)
			{
				event.getEntity().addPotionEffect(
						new PotionEffect(
								PotionEffectType.SPEED,
								Integer.MAX_VALUE,
								plugin.getConfig().getInt(
										"Speed Skeleton Speed")));

				event.getEntity().setHealth(
						plugin.getConfig().getInt("Speed Skeleton Health"));

				event.getEntity().setMaxHealth(
						plugin.getConfig().getInt("Speed Skeleton Health"));
			}

			else if (chances[3] == invisibleChance)
			{
				event.getEntity().addPotionEffect(
						new PotionEffect(
								PotionEffectType.INVISIBILITY,
								Integer.MAX_VALUE,
								1));

				event.getEntity().setHealth(
						plugin.getConfig().getInt("Invisible Skeleton Health"));

				event.getEntity().setMaxHealth(
						plugin.getConfig().getInt("Invisible Skeleton Health"));
			}

			else if (chances[3] == strengthChance)
			{
				event.getEntity().addPotionEffect(
						new PotionEffect(
								PotionEffectType.INCREASE_DAMAGE,
								Integer.MAX_VALUE,
								plugin.getConfig().getInt(
										"Strength Skeleton Damage")));

				event.getEntity().setHealth(
						plugin.getConfig().getInt("Strength Skeleton Health"));

				event.getEntity().setMaxHealth(
						plugin.getConfig().getInt("Strength Skeleton Health"));
			}

			else if (chances[3] == jumpChance)
			{
				event
						.getEntity()
						.addPotionEffect(
								new PotionEffect(
										PotionEffectType.JUMP,
										Integer.MAX_VALUE,
										plugin.getConfig().getInt(
												"Jump Skeleton Jump")));

				event.getEntity().setHealth(
						plugin.getConfig().getInt("Jump Skeleton Health"));

				event.getEntity().setMaxHealth(
						plugin.getConfig().getInt("Jump Skeleton Health"));
			}
		}
	}
}
