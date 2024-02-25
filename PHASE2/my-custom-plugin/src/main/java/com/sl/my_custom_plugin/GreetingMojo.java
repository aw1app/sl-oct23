package com.sl.my_custom_plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "sayhi")
public class GreetingMojo extends AbstractMojo {

    @Parameter(property = "sayhi.greeting", defaultValue = "Hello from Custom Maven Plugin!")
    private String greeting;

    public void execute() throws MojoExecutionException {
        getLog().info(greeting);
    }
}
