<img align="center" src="https://raw.githubusercontent.com/arcticicestudio/northem-dark-java/develop/src/main/assets/media/northem-dark-java-banner.png" alt="Northem Dark Java"/> <a href="https://github.com/arcticicestudio/northem-dark"><img align="right" src="https://raw.githubusercontent.com/arcticicestudio/northem-dark-java/develop/src/main/assets/media/northem-logo.png"/></a>

<img src="https://cdn.travis-ci.org/images/favicon-c566132d45ab1a9bcae64d8d90e4378a.svg" width=24 height=24/> [![Travis CI](https://img.shields.io/travis/arcticicestudio/northem-dark-java/develop.svg)](https://travis-ci.org/arcticicestudio/northem-dark-java) <img src="https://assets-cdn.github.com/favicon.ico" width=24 height=24/> [![](https://img.shields.io/github/release/arcticicestudio/northem-dark-java.svg)](https://github.com/arcticicestudio/northem-dark-java/releases/latest) <img src="http://search.maven.org/favicon.ico" width=24 height=24/> [![](https://img.shields.io/maven-central/v/com.arcticicestudio/northem-dark-java.svg)](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.arcticicestudio%22%20AND%20a%3A%22northem-dark-java%22)

Java library implementation of the north-bluish dark color palette [Northem Dark](https://github.com/arcticicestudio/northem-dark).  
Optimized for syntax highlighting- and UI projects.  
This is a darker and more blue-tinged variation.

## Getting started
### Setup
To use northem-dark-java it must be available on your classpath.  
You can get it from the <img src="https://search.maven.org/favicon.ico" width=16 height=16/> <a href="https://search.maven.org">Central Repository</a> as a dependency for your favorite build tool or [download the latest version](https://github.com/arcticicestudio/northem-dark-java/releases/latest).

<img src="http://apache.org/favicons/favicon.ico" width=16 height=16/> <a href="https://maven.apache.org">Apache Maven</a>
```xml
<dependency>
  <groupId>com.arcticicestudio</groupId>
  <artifactId>northem-dark-java</artifactId>
  <version>0.1.0</version>
</dependency>
```

<img src="https://gradle.org/wp-content/uploads/fbrfg/favicon.ico" width=16 height=16/> <a href="https://gradle.org">Gradle</a>
```java
compile(group: 'com.arcticicestudio', name: 'northem-dark-java', version: '0.1.0')
```

<img src="http://apache.org/favicons/favicon.ico" width=16 height=16/> <a href="https://ant.apache.org/ivy">Apache Ivy</a>
```xml
<dependency org="com.arcticicestudio" name="northem-dark-java" rev="0.1.0" />
```

Development snapshots are available via [Sonatype's snapshot repository](https://oss.sonatype.org/content/repositories/snapshots).  

### Build
Build and install northem-dark-java into your local repository without GPG signing:  
```
mvn clean install
```

Signed artifacts may be build by using the `sign-gpg` profile with a provided `gpg.keyname` property:
```
mvn clean install -Dgpg.keyname=YourGPGKeyId
```

A continuous integration build is running at [Travis-CI](https://travis-ci.org/arcticicestudio/northem-dark-java).

## Variations
  - <a href="https://github.com/arcticicestudio/northem-dark-java"><img src="https://java.com/favicon.ico" alt="Java logo" width=16 height=16> Northem - Java</a> <img src="https://www.kernel.org/theme/images/logos/favicon.png" alt="Linux Logo" width=16 height=16 /> <img src="https://developer.apple.com/favicon.ico" alt="Apple Logo" width=16 height=16 /> <img src="https://www.microsoft.com/en-us/windows/favicon.ico" alt="Windows Logo" width=16 height=16 />
  - <a href="https://github.com/arcticicestudio/northem-light-java"><img src="https://java.com/favicon.ico" alt="Java logo" width=16 height=16> Northem Light - Java</a> <img src="https://www.kernel.org/theme/images/logos/favicon.png" alt="Linux Logo" width=16 height=16 /> <img src="https://developer.apple.com/favicon.ico" alt="Apple Logo" width=16 height=16 /> <img src="https://www.microsoft.com/en-us/windows/favicon.ico" alt="Windows Logo" width=16 height=16 />

## Other Projects
  - <a href="https://github.com/arcticicestudio/northem-dark-intellij-idea-syntax"><img src="https://www.jetbrains.com/_assets//shared/favicons/jetbrains.ico" alt="JetBrain logo" width=16 height=16> Northem Dark IntelliJ IDEA Syntax</a> <img src="https://www.kernel.org/theme/images/logos/favicon.png" alt="Linux Logo" width=16 height=16 /> <img src="https://developer.apple.com/favicon.ico" alt="Apple Logo" width=16 height=16 /> <img src="https://www.microsoft.com/en-us/windows/favicon.ico" alt="Windows Logo" width=16 height=16 />
  - <a href="https://github.com/arcticicestudio/northem-dark-atom-syntax"><img src="https://atom.io/favicon.ico" alt="Atom logo" width=16 height=16> Northem Dark Atom Syntax</a> <img src="https://www.kernel.org/theme/images/logos/favicon.png" alt="Linux Logo" width=16 height=16 /> <img src="https://developer.apple.com/favicon.ico" alt="Apple Logo" width=16 height=16 /> <img src="https://www.microsoft.com/en-us/windows/favicon.ico" alt="Windows Logo" width=16 height=16 />
  - <a href="https://github.com/arcticicestudio/northem-dark-atom-ui"><img src="https://atom.io/favicon.ico" alt="Atom logo" width=16 height=16> Northem Dark Atom UI</a> <img src="https://www.kernel.org/theme/images/logos/favicon.png" alt="Linux Logo" width=16 height=16 /> <img src="https://developer.apple.com/favicon.ico" alt="Apple Logo" width=16 height=16 /> <img src="https://www.microsoft.com/en-us/windows/favicon.ico" alt="Windows Logo" width=16 height=16 />
  - <a href="https://github.com/arcticicestudio/northem-dark-eclipse-syntax"><img src="https://eclipse.org/favicon.ico" alt="Eclipse Logo" width=16 height=16> Northem Dark Eclipse Syntax</a> <img src="https://www.kernel.org/theme/images/logos/favicon.png" alt="Linux Logo" width=16 height=16 /> <img src="https://developer.apple.com/favicon.ico" alt="Apple Logo" width=16 height=16 /> <img src="https://www.microsoft.com/en-us/windows/favicon.ico" alt="Windows Logo" width=16 height=16 />
  - <a href="https://github.com/arcticicestudio/northem-dark-gedit"><img src="https://static.gnome.org/wiki.gnome.org/gnome/css/favicon.png" alt="gedit Logo" width=16 height=16> Northem Dark gedit</a> <img src="https://www.kernel.org/theme/images/logos/favicon.png" alt="Linux Logo" width=16 height=16 />
  - <a href="#"><img src="http://www.gtk.org/images/gtk-logo.ico" alt="GTK Logo" width=16 height=16> Northem Dark GTK (in drafting)</a> <img src="https://www.kernel.org/theme/images/logos/favicon.png" alt="Linux Logo" width=16 height=16 />
  - <a href="https://github.com/arcticicestudio/northem-dark-notepadplusplus"><img src="http://notepad-plus-plus.org/assets/images/favicon.ico" alt="Notepadd++ Logo" width=16 height=16> Northem Dark Notepad++</a> <img src="https://www.microsoft.com/en-us/windows/favicon.ico" alt="Windows Logo" width=16 height=16 />

Visit the [official website](http://arcticicestudio.com/northem) for more information.

## Development
[![](https://img.shields.io/badge/Changelog-v0.1.0-blue.svg)](https://github.com/arcticicestudio/northem-dark-java/blob/v0.1.0/CHANGELOG.md)

### Workflow
This project follows the [gitflow](http://nvie.com/posts/a-successful-git-branching-model) branching model.

### Specifications
This project follows the [Arctic Versioning Specification (ArcVer)](https://github.com/arcticicestudio/arcver).

### Contribution
Please report issues/bugs, suggestions for improvements and feature requests to the [issuetracker](https://github.com/arcticicestudio/northem-dark-java/issues).

---

<img src="http://arcticicestudio.com/favicon.ico" width=16 height=16/> Copyright &copy; 2016 Arctic Ice Studio

[![GPL-3.0](http://www.gnu.org/graphics/gplv3-88x31.png)](http://www.gnu.org/licenses/gpl.txt) [![CC BY-SA-4.0](http://mirrors.creativecommons.org/presskit/buttons/88x31/svg/by-sa.svg)](http://creativecommons.org/licenses/by-sa/4.0/)
