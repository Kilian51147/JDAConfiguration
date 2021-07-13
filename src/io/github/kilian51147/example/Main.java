package io.github.kilian51147;

import javax.security.auth.login.LoginException;

import io.github.kilian51147.CommandListener;
import io.github.kilian51147.JoinListener;
import io.github.kilian51147.QuitListener;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;

public class Main 
{
	private static JDAConfiguration config = new JDAConfiguration();

	public static void main(String[] args)
	{
		try 
		{
			DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(config.getToken());
			
			builder.addEventListeners(new CommandListener());
			builder.addEventListeners(new JoinListener());
			builder.addEventListeners(new QuitListener());
			
			System.out.println("Bot Online");
			
			builder.build();
		}
		catch (LoginException e) 
		{
			e.printStackTrace();
		}
	}
}
