package peruncs.shared;

import peruncs.platform.PerunPlatform;

import java.io.File;

import static peruncs.platform.PerunPlatform.*;
import static rife.bld.dependencies.Scope.compile;

class HelidonBuild extends AbstractBuild {
    HelidonBuild(Build build){
        super(build,"helidon");
        pkg = PERUN_GROUP_ID;
        name = PERUN_HELIDON_ARTIFACT;
        version = version(PERUN_HELIDON_VERSION);
        scope(compile).include(dependency("io.helidon.http", "helidon-http", PerunPlatform.HELIDON_VERSION));
        configurePerunUtilities(this);

        runOperation()
                 .javaOptions()
                 .modulePath(compileMainClasspath().stream().map(File::new).toList());

        compileOperation()
                .compileOptions()
                .modulePath(compileMainClasspath().stream().map(File::new).toList());

        testOperation()
                .javaOptions()
                .modulePath(testClasspath().stream().map(File::new).toList())
                .modulePath(compileMainClasspath().stream().map(File::new).toList());

    }
}
