package me.frawlah.bwplaycmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlayCommands implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("play")) {
                if (args.length > 0) {
                    String arg = args[0].toLowerCase();

                    if (arg.equalsIgnoreCase("bedwars_eight_one")) {
                        p.performCommand("bw join Solo");
                    }

                    else if (arg.equalsIgnoreCase("bedwars_eight_two")) {
                        p.performCommand("bw join Doubles");
                    }

                    else if (arg.equalsIgnoreCase("bedwars_four_three")) {
                        p.performCommand("bw join 3v3v3v3");
                    }

                    else if (arg.equalsIgnoreCase("bedwars_four_four")) {
                        p.performCommand("bw join 4v4v4v4");
                    }

                    else if (arg.equalsIgnoreCase("bedwars_two_four")) {
                        p.performCommand("bw join 4v4");
                    }
                }
            }
        } return true;
    }
}
