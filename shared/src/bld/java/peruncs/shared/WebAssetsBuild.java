package peruncs.shared;

import static peruncs.platform.PerunPlatform.*;

class WebAssetsBuild extends AbstractBuild {
    WebAssetsBuild(Build parentBuild) {
        super(parentBuild,"webassets");
        pkg = PERUN_GROUP_ID;
        name = PERUN_WEB_ASSETS_ARTIFACT;
        version = version(PERUN_WEB_ASSETS_VERSION);
    }
}
