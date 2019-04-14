package pl.sda.patterns.behavioral.memento;

public class CsvReaderCaretaker {

    private Object obj;

    public void save(CsvReader csvReader) {
        this.obj = csvReader.save();
    }

    public void undo(CsvReader csvReader) {
        csvReader.undoToLastSave(obj);
    }
}
