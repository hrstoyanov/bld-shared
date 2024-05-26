This repository hosts a few shared Java modules:
- shared/utilities: this module depends on nothing else
- shared/helidon: this module depends on utilities
- shared/websaasets: this depends on nothing, and is juts web assets


The Platform bld extension defines common artifacts and dependencies, pretty much like Maven BOM or Gradle Cstalaog.

The code requires Java 22, but it can we switch to lower versions

Build sequence:
```
$ ./platform/bld clean publish local
$ ./shared/bld all-rebuild
or
$ ./shared/bld all-build
```

There are other aggregate commands to act upon all modules:
```
$ ./shared/bld help
```
