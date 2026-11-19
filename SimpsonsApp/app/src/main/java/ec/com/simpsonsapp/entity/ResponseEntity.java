package ec.com.simpsonsapp.entity;

import java.util.List;

public class ResponseEntity {
    private int count;
    private String next;
    private String prev;
    private int pages;
    private List<CharacterEntity> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<CharacterEntity> getResults() {
        return results;
    }

    public void setResults(List<CharacterEntity> results) {
        this.results = results;
    }
}
