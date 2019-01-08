package org.demo;

import org.gradle.api.Plugin;
import org.gradle.api.initialization.Settings;

public class SettingsPlugin implements Plugin<Settings> {
    public void apply(Settings settings) {
        settings.getExtensions().add("versions-plugin-version", "0.20.0");
    }
}