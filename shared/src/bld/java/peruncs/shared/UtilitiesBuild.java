package peruncs.shared;

import peruncs.platform.PerunPlatform;

import static peruncs.platform.PerunPlatform.PERUN_GROUP_ID;

class UtilitiesBuild extends AbstractBuild {
    UtilitiesBuild(Build parentBuild){
        super(parentBuild,"utilities");
        pkg = PERUN_GROUP_ID;
        name = PerunPlatform.PERUN_UTILITIES_ARTIFACT;
        version = version(PerunPlatform.PERUN_UTILITIES_VERSION);
    }
}
