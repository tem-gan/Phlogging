package edu.miami.cs.temuulen.phlogging;

import androidx.room.RoomDatabase;

public abstract class PhloggingDB extends RoomDatabase {
    public abstract PhloggingAccess daoAccess();
}