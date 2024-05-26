This repository hosts a few shared Java modules:
- shared/utilities: this module depends on nothing else
- shared/helidon: this module depends on utilities
- shared/websaasets: this depends on nothing, and is juts web assets

BLD is has its usual components:
- src: builder code
- lib: wrapper, etc

The Platform bld extension defines common artifacts and dependencies, pretty much like Maven BOM or Gradle Cstalaog.
