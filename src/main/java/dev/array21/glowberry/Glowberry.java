package dev.array21.glowberry;

import dev.array21.dutchycore.DutchyCore;
import dev.array21.dutchycore.annotations.RegisterModule;
import dev.array21.dutchycore.module.PluginModule;
import dev.array21.glowberry.listeners.PlayerItemConsumeEventListener;

@RegisterModule(name = "Glowberry", version =  "@VERSION@", author = "Dutchy76", infoUrl = "https://github.com/DutchyPlugins/Glowberry")
public class Glowberry extends PluginModule {

	@Override
	public void enable(DutchyCore plugin) {
		this.logInfo("Loading GlowBerry...");
		super.registerEventListener(new PlayerItemConsumeEventListener());
		this.logInfo("Loaded.");
	}
}
