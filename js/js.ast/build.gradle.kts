
apply { plugin("kotlin") }

jvmTarget = "1.6"

dependencies {
    compile(project(":compiler:util"))
    compile(project(":compiler:frontend"))
    if (!isClionBuild()) {
        compile(ideaSdkCoreDeps("trove4j", "intellij-core"))
    } else {
        compile(clionSdkDeps("trove4j", "clion"))
    }
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}

