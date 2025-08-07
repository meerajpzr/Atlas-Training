package bookfactory;

public interface BookFactory {
    NoteBook createLongBook();
    ShortNoteBook createShortBook();
    TextBook createLongTextBook();
    TextBook createShortTextBook();
}
