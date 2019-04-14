package pl.sda.patterns.behavioral.memento;


//TODO implement csv reader based on https://www.callicoder.com/java-read-write-csv-file-apache-commons-csv/
//TODO generate test data using https://www.mockaroo.com/
public class CsvReader {

    private String fileName;
    private StringBuilder content;

    public CsvReader(String file) {
        this.fileName = file;
        this.content = new StringBuilder();
    }

    @Override
    public String toString(){
        return this.content.toString();
    }

    //TODO read from relativePath
    //TODO save content to the field
    public void read() {
    }

    //TODO
    public Memento save() {
        return null;
    }

    //TODO
    public void undoToLastSave(Object obj) {
    }

    private class Memento {
        private String fileName;
        private StringBuilder content;

        public Memento(String file, StringBuilder content) {
            this.fileName = file;
            this.content = new StringBuilder(content);
        }
    }
}
