package lazyLayerReplace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.args.GenericArguments;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.entity.living.player.User;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.channel.MessageReceiver;
import org.spongepowered.api.text.format.TextColors;


@Plugin(id = "lazylayers", name = "LazyLayers", version = "1.0", description = "Quick way to replace layers with layers")
public class testMain {
    @Listener
    public void onServerFinishLoad(GameInitializationEvent event) {
        Object plugin = this;
		// Hey! The server has started!
        // Try instantiating your logger in here.
        // (There's a guide for that)
       	Sponge.getCommandManager().register(plugin, layerSwap, "LayerSwap", "ls");
    	Sponge.getCommandManager().register(plugin, waterSwapMain, "WaterSwap", "ws");
    }

    CommandSpec waterSwapWater = CommandSpec.builder()
    	    .description(Text.of("LazyLayers for water"))
    	    .permission("lazylayers.use")
    	    .executor(new waterSwapToSnow())
    	    .build();
    CommandSpec waterSwapSnow = CommandSpec.builder()
    	    .description(Text.of("LazyLayers for water"))
    	    .permission("lazylayers.use")
    	    .executor(new waterSwapToWater())
    	    .build();
    CommandSpec waterSwapMain = CommandSpec.builder()
    	    .description(Text.of("LazyLayers for water"))
    	    .permission("lazylayers.use")
    	    .child(waterSwapWater ,"water")
    	    .child(waterSwapSnow ,"snow")
    	    .build();
    CommandSpec layerSwap = CommandSpec.builder()
    	    .description(Text.of("LazyLayers for layers"))
    	    .permission("lazylayers.use")
    	    .executor(new layerSwapC())
            .arguments(
            		GenericArguments.remainingJoinedStrings(Text.of("message")))
    	    .build();

   	
}
