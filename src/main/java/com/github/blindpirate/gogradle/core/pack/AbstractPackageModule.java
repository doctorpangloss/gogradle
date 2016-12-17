package com.github.blindpirate.gogradle.core.pack;

import com.github.blindpirate.gogradle.core.GolangPackageModule;
import com.github.blindpirate.gogradle.core.dependency.AbstractGolangDependency;
import org.gradle.api.artifacts.Dependency;

public abstract class AbstractPackageModule extends AbstractGolangDependency implements GolangPackageModule {

    public AbstractPackageModule(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public GolangPackageModule getPackage() {
        return this;
    }

    @Override
    public String getVersion() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Dependency copy() {
        throw new UnsupportedOperationException();
    }

}
