package org.example;

import org.gradle.api.Project;
import org.gradle.api.Plugin;
import org.gradle.api.Task;
import org.example.IntegrationTask;

public class LearngradlepluginPlugin implements Plugin<Project> {
    public void apply(Project project) {
        // // Register a task
        // project.getTasks().register("greeting", task -> {
        //     task.doLast(s -> System.out.println("Hello from plugin 'org.example.greeting'"));
        // });


        // PluginExtension extension = project.getExtensions().create("nvconfig", PluginExtension.class);
        Task compileTask = project.getTasks().getByName("preBuild");
        compileTask.dependsOn(project.getTasks().getByName("IntegrationTask"));


    }
}
