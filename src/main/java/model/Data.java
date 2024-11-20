package model;

public class Data {
    private int id;
    private String fileName;

    public String getPath() {
        return path;
    }

    public Data(int id, String fileName, String path) {
        this.id = id;
        this.fileName = fileName;
        this.path = path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String path;

    public Data(int id, String fileName, String path, String email) {
        this.id = id;
        this.fileName = fileName;
        this.path = path;
        this.email = email;
    }

    private String email;

}
