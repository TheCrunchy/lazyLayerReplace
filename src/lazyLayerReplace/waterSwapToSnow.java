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

public class waterSwapToSnow implements CommandExecutor {
	@Override
	public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
		Player player = (Player) src;
		Sponge.getCommandManager().process(player, "/replace " + "8:7,9:7" + " " + "78:0");
		Sponge.getCommandManager().process(player, "/replace " + "8:6,9:6" + " " + "78:1");
		Sponge.getCommandManager().process(player, "/replace " + "8:5,9:5" + " " + "78:2");
		Sponge.getCommandManager().process(player, "/replace " + "8:4,9:4" + " " + "78:3");
		Sponge.getCommandManager().process(player, "/replace " + "8:3,9:3" + " " + "78:4");
		Sponge.getCommandManager().process(player, "/replace " + "8:2,9:2" + " " + "78:5");
		Sponge.getCommandManager().process(player, "/replace " + "8:1,9:1" + " " + "78:6");
		Sponge.getCommandManager().process(player, "/replace " + "8:0,9:0" + " " + "78:7");
		return CommandResult.success();
	}
}   