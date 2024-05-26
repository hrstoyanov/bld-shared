package peruncs.shared;

import rife.bld.BaseProject;
import rife.bld.BuildCommand;

import java.util.List;

import static rife.bld.dependencies.Repository.MAVEN_CENTRAL;
import static rife.bld.dependencies.Repository.MAVEN_LOCAL;

public class Build extends BaseProject {

    private final WebAssetsBuild webAssetsBuild;
    private final UtilitiesBuild utilitiesBuild;
    private final HelidonBuild helidonBuild;

    public Build() {
        repositories = List.of(MAVEN_LOCAL, MAVEN_CENTRAL);
        webAssetsBuild = new WebAssetsBuild(this);
        utilitiesBuild = new UtilitiesBuild(this);
        helidonBuild = new HelidonBuild(this);
    }

    public static void main(String[] args) {
        new Build().start(args);
    }

    @BuildCommand(value = "all-rebuild",summary = "Rebuild all")
    public void rebuildAll() throws Exception {
        cleanWebAssets();
        compileWebAssets();
        publishLocalWebAssets();
        cleanUtilities();
        compileUtilities();
        publishLocalUtilities();
        cleanHelidon();
        downloadHelidon();
        compileHelidon();
        publishLocalHelidon();
    }

    @BuildCommand(value = "all-build",summary = "Build all")
    public void buildAll() throws Exception {
        compileWebAssets();
        publishLocalWebAssets();
        compileUtilities();
        publishLocalUtilities();
        updateHelidon();
        compileHelidon();
        publishLocalHelidon();
    }

    @BuildCommand(value = "all-compile",summary = "Compile all")
    public void compileAll() throws Exception {
        compileWebAssets();
        compileUtilities();
        compileHelidon();
    }

    @BuildCommand(value = "all-update",summary = "Update all")
    public void updateAll() throws Exception {
        updateWebAssets();
        updateUtilities();
        updateHelidon();
    }

    @BuildCommand(value = "all-purge",summary = "Purge all")
    public void purgeAll() throws Exception {
        purgeWebAssets();
        purgeUtilities();
        purgeHelidon();
    }

    @BuildCommand(value = "all-jar",summary = "Jar all")
    public void jarAll() throws Exception {
        jarWebAssets();
        jarUtilities();
        jarHelidon();
    }

    @BuildCommand(value = "all-clean",summary = "Clean all")
    public void cleanAll() throws Exception {
        cleanWebAssets();
        cleanUtilities();
        cleanHelidon();
    }

    @BuildCommand(value = "all-download",summary = "Download all")
    public void downloadAll() throws Exception {
        downloadWebAssets();
        downloadUtilities();
        downloadHelidon();
    }

    @BuildCommand(value = "all-publish-local",summary = "Publish local all")
    public void publishLocalAll() throws Exception {
        publishLocalWebAssets();
        publishLocalUtilities();
        publishLocalHelidon();
    }

    // WEBASSETS
    @BuildCommand(value = "helidon-compile",summary = "Compile helidon")
    public void compileHelidon() throws Exception {
        helidonBuild.compile();
    }

    @BuildCommand(value = "helidon-update",summary = "Update helidon")
    public void updateHelidon() throws Exception {
        helidonBuild.updates();
    }

    @BuildCommand(value = "helidon-clean",summary = "Clean he")
    public void cleanHelidon() throws Exception {
        helidonBuild.clean();
    }

    @BuildCommand(value = "helidon-jar",summary = "Jar helidon")
    public void jarHelidon() throws Exception {
        helidonBuild.jar();
    }

    @BuildCommand(value = "helidon-download",summary = "Download helidon")
    public void downloadHelidon() throws Exception {
        helidonBuild.download();
    }

    @BuildCommand(value = "helidon-publish-local",summary = "Publish local helidon")
    public void publishLocalHelidon() throws Exception {
        helidonBuild.publishLocal();
    }

    @BuildCommand(value = "helidon-purge",summary = "Purge helidon")
    public void purgeHelidon() throws Exception {
        helidonBuild.purge();
    }

    // WEBASSETS
    @BuildCommand(value = "webassets-compile",summary = "Compile web assets")
    public void compileWebAssets() throws Exception {
        webAssetsBuild.compile();
    }

    @BuildCommand(value = "webassets-update",summary = "Update web assets")
    public void updateWebAssets() throws Exception {
        webAssetsBuild.updates();
    }

    @BuildCommand(value = "webassets-clean",summary = "Clean web assets")
    public void cleanWebAssets() throws Exception {
        webAssetsBuild.clean();
    }

    @BuildCommand(value = "webassets-jar",summary = "Jar web assets")
    public void jarWebAssets() throws Exception {
        webAssetsBuild.jar();
    }

    @BuildCommand(value = "webassets-download",summary = "Download web assets")
    public void downloadWebAssets() throws Exception {
        webAssetsBuild.download();
    }

    @BuildCommand(value = "webassets-publish-local",summary = "Publish local web assets")
    public void publishLocalWebAssets() throws Exception {
        webAssetsBuild.publishLocal();
    }

    @BuildCommand(value = "webassets-purge",summary = "Purge web assets")
    public void purgeWebAssets() throws Exception {
        webAssetsBuild.purge();
    }

    //UTILITIES
    @BuildCommand(value = "util-compile",summary = "Compile utilities")
    public void compileUtilities() throws Exception {
        utilitiesBuild.compile();
    }

    @BuildCommand(value = "util-update",summary = "Update utilities")
    public void updateUtilities() throws Exception {
        utilitiesBuild.updates();
    }

    @BuildCommand(value = "util-clean",summary = "Clean utilities")
    public void cleanUtilities() throws Exception {
        utilitiesBuild.clean();
    }

    @BuildCommand(value = "util-jar",summary = "Jar utilities")
    public void jarUtilities() throws Exception {
        utilitiesBuild.jar();
    }

    @BuildCommand(value = "util-download",summary = "Download utilities dependencies")
    public void downloadUtilities() throws Exception {
        utilitiesBuild.download();
    }

    @BuildCommand(value = "util-publish-local",summary = "Publish local utilities")
    public void publishLocalUtilities() throws Exception {
        utilitiesBuild.publishLocal();
    }

    @BuildCommand(value = "util-purge",summary = "Purge utilities")
    public void purgeUtilities() throws Exception {
        utilitiesBuild.purge();
    }

}
