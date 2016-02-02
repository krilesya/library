package ua.npu.project.library;

public class Newspaper extends Publication{
    public int pages;
    public String name;
    public String Redaction;

    public Newspaper(int pages, String name, String redaction) {
        this.pages = pages;
        this.name = name;
        Redaction = redaction;    }

    public Newspaper()
     {this.pages=0;
    }

    public Newspaper (int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRedaction() {
        return Redaction;
    }

    public void setRedaction(String redaction) {
        Redaction = redaction;
    }
}
