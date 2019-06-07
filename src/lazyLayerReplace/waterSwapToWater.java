package lazyLayerReplace;

import java.util.ArrayList;
import java.util.List;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;

public class waterSwapToWater implements CommandExecutor {
    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
    	Player player = (Player) src;
    	Sponge.getCommandManager().process(player, "/replace " + "78:0" + " " + "8:7");
		Sponge.getCommandManager().process(player, "/replace " + "78:1" + " " + "8:6");
		Sponge.getCommandManager().process(player, "/replace " + "78:2" + " " + "8:5");
		Sponge.getCommandManager().process(player, "/replace " + "78:3" + " " + "8:4");
		Sponge.getCommandManager().process(player, "/replace " + "78:4" + " " + "8:3");
		Sponge.getCommandManager().process(player, "/replace " + "78:5" + " " + "8:2");
		Sponge.getCommandManager().process(player, "/replace " + "78:6" + " " + "8:1");
		Sponge.getCommandManager().process(player, "/replace " + "78:7" + " " + "8:0");
	    	
        return CommandResult.success();
    }
}   