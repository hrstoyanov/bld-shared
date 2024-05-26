package peruncs.shared;

import peruncs.platform.PerunPlatform;
import rife.bld.Project;

import java.io.File;

import static java.util.Objects.requireNonNull;

class AbstractBuild extends Project {
    private Build parentBuild;
    AbstractBuild(Build build, String root) {
        this.parentBuild = requireNonNull(build);
        downloadSources = true;
        autoDownloadPurge = true;
        workDirectory = new File(build.workDirectory(), requireNonNull(root, "root"));
        repositories = build.repositories();
        buildBldDirectory = build.buildBldDirectory();
        srcBldDirectory = build.srcBldDirectory();
        javaRelease = PerunPlatform.JAVA_VERSION;
        compileOperation().compileOptions().enablePreview();
        runOperation().javaOptions().enablePreview();
        javadocOperation().javadocOptions().enablePreview();
    }
}
