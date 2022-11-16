package edu.miami.cs.temuulen.phlogging;

import java.util.List;

public interface PhloggingAccess {
    void addPhlog(PhloggingEntity phloggingEntity);

    void deletePhlog(PhloggingEntity phloggingEntity);

    List<PhloggingEntity> fetchAllPhlogs();

    PhloggingEntity getPhlogByTimestamp(String str);

    void updatePhlog(PhloggingEntity phloggingEntity);
}