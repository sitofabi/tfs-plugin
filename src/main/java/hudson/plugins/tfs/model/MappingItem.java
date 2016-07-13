package hudson.plugins.tfs.model;

import java.io.Serializable;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * SCM for Microsoft Team Foundation Server.
 * 
 * @author Erik Ramfelt
 */

public class MappingItem  implements Serializable
{
	private final String serverName;
	private final String clientPath;

	@DataBoundConstructor
	public MappingItem(String serverName, String clientPath) {
		// TODO Auto-generated constructor stub
		
		this.serverName = serverName;
		this.clientPath = clientPath;
	}
	
	public String getServerName()
	{
		return serverName;
	}
	
	public String getClientPath()
	{
		return clientPath;
	}
	
   @Override
public String toString() {
	// TODO Auto-generated method stub
	return "ServerPath: " + serverName + " ClientPath: " + clientPath;
}
}