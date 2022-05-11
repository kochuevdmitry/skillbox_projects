package com.example.MyBookShopApp.data.google.api.books;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchInfo {
    String textSnippet;

    @JsonProperty("textSnippet")
    public String getTextSnippet() {
        return this.textSnippet;
    }

    public void setTextSnippet(String textSnippet) {
        this.textSnippet = textSnippet;
    }
}
