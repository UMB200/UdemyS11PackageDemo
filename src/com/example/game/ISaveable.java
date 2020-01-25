package com.example.game;

import java.util.List;

public interface ISaveable {

    List<String> valuesToSave();
    void populateFields(List<String> fields);
}
