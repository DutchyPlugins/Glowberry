package dev.array21.glowberry.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerItemConsumeEventListener implements Listener {
	
	private static final int DURATION_SECS = 15;
	
	@EventHandler
	public void onPlayerItemConsumeEvent(PlayerItemConsumeEvent event) {
		if(event.getItem().getType().equals(Material.GLOW_BERRIES)) {
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, DURATION_SECS*20, 1));
		}
	}
}
