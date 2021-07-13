package io.github.kilian51147.manage;

import io.github.kilian51147.JDAConfiguration;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class JoinListener extends ListenerAdapter 
{
	private JDAConfiguration config = new JDAConfiguration();
	
	@Override
	public void onGuildMemberJoin(GuildMemberJoinEvent e)
	{
		TextChannel tc = (TextChannel) e.getGuild().getTextChannelsByName(config.getJoinChannel(), true);
		
		tc.sendMessage(config.getJoinMessage());
	}
}
