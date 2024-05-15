package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PluginExtension {
	
	public String authURL = "http://10.20.0.59:5077/rum/auth?op=accountAuth";
    public String startActivity = "";

    public List<String> variation = new ArrayList<String>(Arrays.asList("debug")); 
    
    public String authToken  = null;
    public boolean enableInstr = false;
	public List<String> variationInstr = new ArrayList<String>(Arrays.asList("debug")); 
	public List<String> profilesConfig  = new ArrayList<String>();
}

