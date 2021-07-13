package io.github.kilian51147.manage;

import io.github.kilian51147.JDAConfiguration;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class QuitListener extends ListenerAdapter 
{
	private JDAConfiguration config = new JDAConfiguration();
	
	@Override
	public void onGuildMemberRemove(GuildMemberRemoveEvent e)
	{
		TextChannel tc = (TextChannel) e.getGuild().getTextChannelsByName(config.getQuitChannel(), true);
		
		tc.sendMessage(config.getQuitMessage());
	}
}
