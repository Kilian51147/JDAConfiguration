package io.github.kilian51147;

import java.io.File;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class JDAConfiguration 
{
	private Scanner scanner;
	
	public JDAConfiguration()
	{
		try
		{
			scanner = new Scanner(new File("config.jda"));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String getToken()
	{
		while (scanner.hasNext())
		{
			String line = scanner.nextLine();
		
			if (line.startsWith("token=\""))
			{
				String token = StringUtils.substringBetween(line, "\"", "\"");
				return token;
			}
		}
		return null;
	}
	
	public String getPrefix()
	{
		while (scanner.hasNext())
		{
			String line = scanner.nextLine();
			
			if (line.startsWith("prefix=\""))
			{
				String prefix = StringUtils.substringBetween(line, "\"", "\"");
				return prefix;
			}
		}
		return null;
	}
	
	public String getJoinMessage()
	{
		while (scanner.hasNext())
		{
			String line = scanner.nextLine();
			
			if (line.startsWith("join-message=\""))
			{
				String message = StringUtils.substringBetween(line, "\"", "\"");
				return message;
			}
		}
		return null;
	}
	
	public String getQuitMessage()
	{
		while (scanner.hasNext())
		{
			String line = scanner.nextLine();
			
			if (line.startsWith("quit-message=\""))
			{
				String message = StringUtils.substringBetween(line, "\"", "\"");
				return message;
			}
		}
		return null;
	}
}
