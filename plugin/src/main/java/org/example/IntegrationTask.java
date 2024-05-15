package org.example;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import com.android.build.gradle.BaseExtension;
import org.example.PluginExtension;

public class IntegrationTask extends DefaultTask {
    PluginExtension extension = null;

    @TaskAction
    public void greet() {
    	System.out.println("greet called here");

    	if (extension == null) {
    		extension = getProject().getExtensions().findByType(PluginExtension.class);
            BaseExtension android = (BaseExtension) getProject().getExtensions().getByName("android");
            
            System.out.println("Task done...");
        }
    }    
}