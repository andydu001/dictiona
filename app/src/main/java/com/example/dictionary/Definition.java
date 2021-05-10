package com.example.dictionary;

// This class automatically get the definition of a word
public class Definition {

    private int id;
    private String definition;
    private String Word;
    Definition(String def, String W,  int id){

        this.definition = def;
        this.Word= W;
        this.id =id;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public void setWord(String word) {
        Word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public String getWord() {
        return Word;
    }

    public void setId( int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


}
