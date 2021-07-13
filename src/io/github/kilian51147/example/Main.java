package io.github.kilian51147;

import javax.security.auth.login.LoginException;

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
			
			System.out.println("Bot Online");
			
			builder.build();
		}
		catch (LoginException e) 
		{
			e.printStackTrace();
		}
	}
}
