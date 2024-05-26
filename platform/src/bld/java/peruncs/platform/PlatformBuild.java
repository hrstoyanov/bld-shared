package peruncs.platform;

import rife.bld.Project;

import java.util.List;

import static rife.bld.dependencies.Repository.*;
import static rife.bld.dependencies.Scope.*;

public class PlatformBuild extends Project {
    public PlatformBuild() {
        pkg = "peruncs";
        name = "peruncs-platform";
        version = version(0,0,1);
        javaRelease = 22;
        compileOperation().compileOptions().enablePreview();
        downloadSources = true;
        autoDownloadPurge = true;
        repositories = List.of(MAVEN_LOCAL,MAVEN_CENTRAL);
        scope(compile).include(dependency("com.uwyn.rife2", "bld", "1.9.1"));
    }

    public static void main(String[] args) {
        new PlatformBuild().start(args);
    }
}
