package dev.emmily.chuchina.api.version;

import org.bukkit.Bukkit;

public interface ServerVersion {
  String SERVER_VERSION = Bukkit
    .getServer()
    .getClass()
    .getName()
    .split("\\.")[3];
  String PROTOCOL_CLASS_PATTERN = "dev.emmily.chuchina.protocol.%s";
}

