package dev.dkvl.womutils.beans;

import lombok.Value;

@Value
public class PlayerInfo implements WomResult
{
    long exp;
    int id;
    String username;
    String displayName;
    String type;
    String build;
    boolean flagged;
    double ehp;
    double ehb;
    double ttm;
    double tt200m;
    String lastImportedAt;
    String lastChangedAt;
    String registeredAt;
    String updatedAt;
    int combatLevel;
    Snapshot latestSnapshot;
}