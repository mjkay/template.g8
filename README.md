# template.g8

Template for Scala projects using Martin's utilities library

## Usage

This repository contains a Giter8 template that allows the creation of Scala project using Martin's library –declared as a dependency in the build configuration.

In order to create a project using this template, you need to have the library available. The next section describes how to create the library and publish it locally. The following sections describe how to create a project using the deployed library and this template.

## Library

The library can be created by cloning the library project in a desired location. For the purposes of this document, I will consider that the default root location for the library and other projects is `/Users/mjkay/research`. To clone the repository,

```
cd /Users/mjkay/research

git clone http://github.com/mjkay/library

cd library
```

This creates the `library` project, which is a regular Scala project that will host the utilities in the package `edu.mjkay.Library`. You can add your code there, and publish it locally so it can be used in other projects. Once the code is in place, you can publish it by issuing

`sbt publish-local`

This sbt command compiles the project, packages it, and publish it in a local repository (typically rooted in `~/.ivy2`). The library is then available to other local projects.

### Changing the library version
In the normal development cycle of the library you will need to change, at some point, the version of the library. To do this, change `version` in `library/project/LibraryBuild.scala`. For example, to increment the version from `0.1-SNAPSHOT` we can change it to be

`version := "0.2-SNAPSHOT",`

and then `sbt publish-local`. This will publish the new version of the library in the local ivy repository, maintaining previous versions –so older projects can still use other versions than the current one.

## Creating Scala projects that use the library
To create a Scala project that use the library you only need to issue the following command

```
cd /Users/mjkay/research/

g8 mjkay/template
```

Then you only need to enter the information you want –or accept the defaults. The following is the output of a typical execution that creates a project named `test project`

```
A basic template that uses Martin's utilities library 

organization [edu.mjkay]: 
name [Scala base project]: test project

Template applied in ./test-project
```

Then, simply go to `test-project`, code and use sbt as usual. This template includes both `scala-test` and `scalastyle`, so there are some stubs for testing and maintaining coherent style in the code –although their use is completely optional.


------

Ignacio Cases and Martin Kay - 2014
