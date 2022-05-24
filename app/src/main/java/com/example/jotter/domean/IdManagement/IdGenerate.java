package com.example.jotter.domean.IdManagement;

public class IdGenerate {
    private static int LAST_ID;

    public static int GenerateId() {
        return ++LAST_ID;
    }
}
