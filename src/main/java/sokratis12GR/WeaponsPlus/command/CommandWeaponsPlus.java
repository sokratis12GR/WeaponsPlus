package sokratis12GR.WeaponsPlus.command;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import sokratis12GR.WeaponsPlus.WeaponsPlus;

import java.util.Collections;
import java.util.List;

import static sokratis12GR.WeaponsPlus.WeaponsPlus.configDir;

public class CommandWeaponsPlus implements ICommand {
    private boolean aBoolean;

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "weaponsplus";
    }

    @Override
    public List<String> getCommandAliases() {
        return Collections.emptyList();
    }

    /**
     * Check if the given ICommandSender has permission to execute this command
     *
     * @param server The Minecraft server instance
     * @param sender The command sender who we are checking permission on
     */
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    /**
     * Gets the name of the command
     */
    public String getCommandName() {
        return "weaponsplus";
    }

    @Override
    public List<String> getTabCompletionOptions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos pos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_) {
        return false;
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public int compareTo(ICommand o) {
        return 0;
    }

    /**
     * Callback for when the command is executed
     *
     * @param server The Minecraft server instance
     * @param sender The source of the command invocation
     * @param args   The arguments that were passed
     */
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        sender.addChatMessage(new TextComponentString(TextFormatting.DARK_RED + "[" + WeaponsPlus.MODNAME + " (" + WeaponsPlus.VERSION + ") " + "by" + TextFormatting.GOLD + " sokratis12GR]"));
        sender.addChatMessage(new TextComponentString(TextFormatting.RED + "[Thank You " + sender.getName() + " For Using " + WeaponsPlus.MODNAME + "]"));
        sender.addChatMessage(new TextComponentString(TextFormatting.GREEN + "[" + "modid: " + WeaponsPlus.MODID + "]"));
        sender.addChatMessage(new TextComponentString(TextFormatting.DARK_RED + "[This Mod is on BETA so expect many Bugs and Errors]"));
    }
}