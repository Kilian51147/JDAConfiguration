package io.github.kilian51147.manage;

import io.github.kilian51147.JDAConfiguration;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CommandListener extends ListenerAdapter
{
	private JDAConfiguration config = new JDAConfiguration();

	@Override
	public void onMessageReceived(MessageReceivedEvent e)
	{
		String message = e.getMessage().getContentDisplay();

		if (message.startsWith(config.getPrefix()))
		{
			String command = message.substring(config.getPrefix().length());
			String[] args = command.split(" ");

			if (args.length == 1)
			{
				if (args[0].equalsIgnoreCase("hello"))
				{
					e.getChannel().sendMessage("Hello " + e.getAuthor().getAsMention() + ".").queue();
				}
			}
		}
	}
}
