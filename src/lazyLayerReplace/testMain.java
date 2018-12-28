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
    	Sponge.getCommandManager().register(plugin, waterSwap, "WaterSwap", "ws");
    }
    CommandSpec waterSwap = CommandSpec.builder()
    	    .description(Text.of("LazyLayers for water"))
    	    .permission("lazylayers.use")
    	    .executor(new waterSwapC())
            .arguments(
            		GenericArguments.remainingJoinedStrings(Text.of("message")))
    	    .build();
    public class waterSwapC implements CommandExecutor {
	    @Override
	    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
	    	Player player = (Player) src;
	    	String message = args.<String>getOne("message").get();   	
	    	//get the blocks to replace
	    	String[] split1 = message.split(" ");
	    	String split2 = split1[0];

	    	//System.out.println(split1);
	    	//System.out.println(split2);
	    	//System.out.println(split3);
	    	
	    	List<String> layersToRep1 = new ArrayList<>();
	    	List<String> layersToRep2 = new ArrayList<>();
	    	List<String> layersToRep3 = new ArrayList<>();
	    	List<String> layersToRep4 = new ArrayList<>();
	    	List<String> layersToRep5 = new ArrayList<>();
	    	List<String> layersToRep6 = new ArrayList<>();
	    	List<String> layersToRep7 = new ArrayList<>();
	    	List<String> layersToRep8 = new ArrayList<>();
	    	
 	    	List<String> replaceWith1 = new ArrayList<>();
	    	List<String> replaceWith2 = new ArrayList<>();
	    	List<String> replaceWith3 = new ArrayList<>();
	    	List<String> replaceWith4 = new ArrayList<>();
	    	List<String> replaceWith5 = new ArrayList<>();
	    	List<String> replaceWith6 = new ArrayList<>();
	    	List<String> replaceWith7 = new ArrayList<>();
	    	List<String> replaceWith8 = new ArrayList<>();
	    	//get the blocks to replace         
	    	    	if (split2.toLowerCase().contains("water") || split2.contains("8") || split2.contains("9")){
	    	    		//do stuff for snow layers
	    	    		layersToRep1.add("8:7");
	    	    		layersToRep2.add("8:6");
	    	    		layersToRep3.add("8:5");
	    	    		layersToRep4.add("8:4");
	    	    		layersToRep5.add("8:3");
	    	    		layersToRep6.add("8:2");
	    	    		layersToRep7.add("8:1");
	    	    		layersToRep8.add("8:0");
	    	    		
	    	    		layersToRep1.add("9:7");
	    	    		layersToRep2.add("9:6");
	    	    		layersToRep3.add("9:5");
	    	    		layersToRep4.add("9:4");
	    	    		layersToRep5.add("9:3");
	    	    		layersToRep6.add("9:2");
	    	    		layersToRep7.add("9:1");
	    	    		layersToRep8.add("9:0");
	    	    		
	    	    		
	    	    		replaceWith1.add("78:0");
	    	    		replaceWith2.add("78:1");
	    	    		replaceWith3.add("78:2");
	    	    		replaceWith4.add("78:3");
	    	    		replaceWith5.add("78:4");
	    	    		replaceWith6.add("78:5");
	    	    		replaceWith7.add("78:6");
	    	    		replaceWith8.add("78:7");
	    	    	}
	    	    	if (split2.toLowerCase().contains("snow") || split2.contains("78")) {
	    	    		//do stuff for snow layers
	    	    		layersToRep1.add("78:0");
	    	    		layersToRep2.add("78:1");
	    	    		layersToRep3.add("78:2");
	    	    		layersToRep4.add("78:3");
	    	    		layersToRep5.add("78:4");
	    	    		layersToRep6.add("78:5");
	    	    		layersToRep7.add("78:6");
	    	    		layersToRep8.add("78:7");
    		
	    	    		replaceWith1.add("8:7");
	    	    		replaceWith2.add("8:6");
	    	    		replaceWith3.add("8:5");
	    	    		replaceWith4.add("8:4");
	    	    		replaceWith5.add("8:3");
	    	    		replaceWith6.add("8:2");
	    	    		replaceWith7.add("8:1");
	    	    		replaceWith8.add("8:0");
	    	    	}
	            int i;
	           
	            for (i = 1; i < 9; i++)
	            {
	            	String firsthalf = "";
	            	String secondhalf = "";
	            	if (i == 1) {
	            	for (String s: layersToRep1) {
	            			firsthalf += "," +  s;	
	            		}
	            	for (String s: replaceWith1) {
            				secondhalf = s;	
            		    }
	            	}
	            	if (i == 2) {
    	            	for (String s: layersToRep2) {   
    	            		firsthalf += "," +  s;
    	            	}
    	            	for (String s: replaceWith2) {
	            			secondhalf = s;	
	            		}
    	            }
	            	if (i == 3) {
    	            	for (String s: layersToRep3) {   
    	            		firsthalf += "," +  s;
    	            	}
    	            	for (String s: replaceWith3) {
	            			secondhalf=s;	
	            		}
    	            }
	            	if (i == 4) {
    	            	for (String s: layersToRep4) {   
    	            		firsthalf += "," +  s;
    	            	}
    	            	for (String s: replaceWith4) {
	            			secondhalf=s;	
	            		}
    	            }
	            	if (i == 5) {
    	            	for (String s: layersToRep5) {   
    	            		firsthalf += "," +  s;
    	            	}
    	            	for (String s: replaceWith5) {
	            			secondhalf=s;	
	            		}
    	            }
	            	if (i == 6) {
    	            	for (String s: layersToRep6) {   
    	            		firsthalf += "," +  s;
    	            	}
    	            	for (String s: replaceWith6) {
	            			secondhalf=s;	
	            		}
    	            }
	            	if (i == 7) {
    	            	for (String s: layersToRep7) {   
    	            		firsthalf += "," +  s;
    	            	}
    	            	for (String s: replaceWith7) {
	            			secondhalf=s;	
	            		}
    	            }
	            	if (i == 8) {
    	            	for (String s: layersToRep8) {   
    	            		firsthalf += "," +  s;
    	            	}
    	            	for (String s: replaceWith8) {
	            			secondhalf=s;	
	            		}
    	            }
	            	firsthalf = firsthalf.replaceFirst(",", "");
		            //System.out.println(firsthalf);
		            secondhalf = secondhalf.replaceFirst(",", "");
		            //System.out.println(secondhalf);
		            Sponge.getCommandManager().process(player, "/replace " + firsthalf + " " + secondhalf);
	            }

 	    	
	        return CommandResult.success();
	    }
	}   
    
    CommandSpec layerSwap = CommandSpec.builder()
    	    .description(Text.of("LazyLayers for layers"))
    	    .permission("lazylayers.use")
    	    .executor(new testCommand())
            .arguments(
            		GenericArguments.remainingJoinedStrings(Text.of("message")))
    	    .build();

    	public class testCommand implements CommandExecutor {
    	    @Override
    	    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
    	    	Player player = (Player) src;
    	    	String message = args.<String>getOne("message").get();   	
    	    	//get the blocks to replace
    	    	String[] split1 = message.split(" ");
    	    	String[] split2 = split1[0].split(",");
 
    	    	//get the blocks to replace with
    	    	String[] split3 = split1[1].split(",");
    	    	//System.out.println(split1);
    	    	//System.out.println(split2);
    	    	//System.out.println(split3);
    	    	
    	    	List<String> layersToRep1 = new ArrayList<>();
    	    	List<String> layersToRep2 = new ArrayList<>();
    	    	List<String> layersToRep3 = new ArrayList<>();
    	    	List<String> layersToRep4 = new ArrayList<>();
    	    	List<String> layersToRep5 = new ArrayList<>();
    	    	List<String> layersToRep6 = new ArrayList<>();
    	    	List<String> layersToRep7 = new ArrayList<>();
    	    	List<String> layersToRep8 = new ArrayList<>();
    	    	
     	    	List<String> replaceWith1 = new ArrayList<>();
    	    	List<String> replaceWith2 = new ArrayList<>();
    	    	List<String> replaceWith3 = new ArrayList<>();
    	    	List<String> replaceWith4 = new ArrayList<>();
    	    	List<String> replaceWith5 = new ArrayList<>();
    	    	List<String> replaceWith6 = new ArrayList<>();
    	    	List<String> replaceWith7 = new ArrayList<>();
    	    	List<String> replaceWith8 = new ArrayList<>();
    	    	Boolean meta = false;
    	    	//get the blocks to replace
    	    		for (String s: split2) {
    	    			if (!s.contains(":")) {
    	    				meta = true;
    	    				break;
    	    			}
    	    	    	if (s.toLowerCase().contains("snow") || s.contains("78")) {
    	    	    		//do stuff for snow layers
    	    	    		layersToRep1.add("78:0");
    	    	    		layersToRep2.add("78:1");
    	    	    		layersToRep3.add("78:2");
    	    	    		layersToRep4.add("78:3");
    	    	    		layersToRep5.add("78:4");
    	    	    		layersToRep6.add("78:5");
    	    	    		layersToRep7.add("78:6");
    	    	    		layersToRep8.add("78:7");
    	    	    	}
        	    		if (s.contains(":1") || s.contains(":3") || s.contains(":5") || s.contains(":7") || s.contains(":9") || s.contains(":11") || s.contains(":13") || s.contains(":15")) {
        	    			String[] layers = s.split(":");
        	    			layersToRep1.add(layers[0].replaceAll(",", "") + ":1");
        	    			layersToRep2.add(layers[0].replaceAll(",", "") + ":3");
        	    			layersToRep3.add(layers[0].replaceAll(",", "") + ":5");
        	    			layersToRep4.add(layers[0].replaceAll(",", "") + ":7");
        	    			layersToRep5.add(layers[0].replaceAll(",", "") + ":9");
        	    			layersToRep6.add(layers[0].replaceAll(",", "") + ":11");
        	    			layersToRep7.add(layers[0].replaceAll(",", "") + ":13");
        	    			layersToRep8.add(layers[0].replaceAll(",", "") + ":15");
        	    		}
           	    			
           	    		if (s.contains(":0") || s.contains(":2") || s.contains(":4") || s.contains(":6") || s.contains(":8") || s.contains(":10") || s.contains(":12") || s.contains(":14")) {
        	    			String[] layers = s.split(":");
        	    			layersToRep1.add(layers[0].replaceAll(",", "") + ":0");
        	    			layersToRep2.add(layers[0].replaceAll(",", "") + ":2");
        	    			layersToRep3.add(layers[0].replaceAll(",", "") + ":4");
        	    			layersToRep4.add(layers[0].replaceAll(",", "") + ":6");
        	    			layersToRep5.add(layers[0].replaceAll(",", "") + ":8");
        	    			layersToRep6.add(layers[0].replaceAll(",", "") + ":10");
        	    			layersToRep7.add(layers[0].replaceAll(",", "") + ":12");
        	    			layersToRep8.add(layers[0].replaceAll(",", "") + ":14");
        	    		}
           	    	}
    	    		
    	    		
    	    		//get the blocks to replace it with
    	    		for (String s: split3) {
    	    			if (!s.contains(":")) {
    	    				meta = true;
    	    				break;
    	    			}
    	  	    		if (s.contains(":1") || s.contains(":3") || s.contains(":5") || s.contains(":7") || s.contains(":9") || s.contains(":11") || s.contains(":13") || s.contains(":15")) {
        	    			String[] layers = s.split(":");
        	    			replaceWith1.add(layers[0].replaceAll(",", "") + ":1");
        	    			replaceWith2.add(layers[0].replaceAll(",", "") + ":3");
        	    			replaceWith3.add(layers[0].replaceAll(",", "") + ":5");
        	    			replaceWith4.add(layers[0].replaceAll(",", "") + ":7");
        	    			replaceWith5.add(layers[0].replaceAll(",", "") + ":9");
        	    			replaceWith6.add(layers[0].replaceAll(",", "") + ":11");
        	    			replaceWith7.add(layers[0].replaceAll(",", "") + ":13");
        	    			replaceWith8.add(layers[0].replaceAll(",", "") + ":15");
        	    		}
    	   	    		if (s.contains(":0") || s.contains(":2") || s.contains(":4") || s.contains(":6") || s.contains(":8") || s.contains(":10") || s.contains(":12") || s.contains(":14")) {
        	    			String[] layers = s.split(":");
        	    			replaceWith1.add(layers[0].replaceAll(",", "") + ":0");
        	    			replaceWith2.add(layers[0].replaceAll(",", "") + ":2");
        	    			replaceWith3.add(layers[0].replaceAll(",", "") + ":4");
        	    			replaceWith4.add(layers[0].replaceAll(",", "") + ":6");
        	    			replaceWith5.add(layers[0].replaceAll(",", "") + ":8");
        	    			replaceWith6.add(layers[0].replaceAll(",", "") + ":10");
        	    			replaceWith7.add(layers[0].replaceAll(",", "") + ":12");
        	    			replaceWith8.add(layers[0].replaceAll(",", "") + ":14");
        	    		}
    	    	    	if (s.toLowerCase().contains("snow") || s.contains("78")) {
    	    	    		//do stuff for snow layers
    	    	    		replaceWith1.add("78:0");
    	    	    		replaceWith2.add("78:1");
    	    	    		replaceWith3.add("78:2");
    	    	    		replaceWith4.add("78:3");
    	    	    		replaceWith5.add("78:4");
    	    	    		replaceWith6.add("78:5");
    	    	    		replaceWith7.add("78:6");
    	    	    		replaceWith8.add("78:7");
    	    	    	}
    	    		}
    	    		
    	    	//}
    	            int i;
    	           if (!meta) {
    	            for (i = 1; i < 9; i++)
    	            {
    	            	String firsthalf = "";
    	            	String secondhalf = "";
    	            	if (i == 1) {
    	            	for (String s: layersToRep1) {
    	            			firsthalf += "," + s;	
    	            		}
    	            	for (String s: replaceWith1) {
	            				secondhalf += "," + s;	
	            		    }
    	            	}
    	            	if (i == 2) {
        	            	for (String s: layersToRep2) {   
        	            		firsthalf += "," + s;
        	            	}
        	            	for (String s: replaceWith2) {
    	            			secondhalf += "," + s;	
    	            		}
        	            }
    	            	if (i == 3) {
        	            	for (String s: layersToRep3) {   
        	            		firsthalf += "," + s;
        	            	}
        	            	for (String s: replaceWith3) {
    	            			secondhalf += "," + s;	
    	            		}
        	            }
    	            	if (i == 4) {
        	            	for (String s: layersToRep4) {   
        	            		firsthalf += "," + s;
        	            	}
        	            	for (String s: replaceWith4) {
    	            			secondhalf += "," + s;	
    	            		}
        	            }
    	            	if (i == 5) {
        	            	for (String s: layersToRep5) {   
        	            		firsthalf += "," + s;
        	            	}
        	            	for (String s: replaceWith5) {
    	            			secondhalf += "," + s;	
    	            		}
        	            }
    	            	if (i == 6) {
        	            	for (String s: layersToRep6) {   
        	            		firsthalf += "," + s;
        	            	}
        	            	for (String s: replaceWith6) {
    	            			secondhalf += "," + s;	
    	            		}
        	            }
    	            	if (i == 7) {
        	            	for (String s: layersToRep7) {   
        	            		firsthalf += "," + s;
        	            	}
        	            	for (String s: replaceWith7) {
    	            			secondhalf += "," + s;	
    	            		}
        	            }
    	            	if (i == 8) {
        	            	for (String s: layersToRep8) {   
        	            		firsthalf += "," + s;
        	            	}
        	            	for (String s: replaceWith8) {
    	            			secondhalf += "," + s;	
    	            		}
        	            }
    	            	firsthalf = firsthalf.replaceFirst(",", "");
    		            //System.out.println(firsthalf);
    		            secondhalf = secondhalf.replaceFirst(",", "");
    		            //System.out.println(secondhalf);
    		            Sponge.getCommandManager().process(player, "/replace " + firsthalf + " " + secondhalf);
    	            }
    
    	           }
    	           else {
    	       		player.sendMessage(Text.of(TextColors.GRAY, "You must provide the meta, such as 259:5"));
    	    		String response = "&7To get the correct block ID do &3/info &7while holding a tool (like a stick or pickaxe). Then right-click any block to get the ID.";
    	    		response = response.replaceAll("&", "§");
    	    		player.sendMessage(Text.of(response));
    	           }
    	        return CommandResult.success();
    	    }
    	}   	
}
