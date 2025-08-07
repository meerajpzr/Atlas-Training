import bookfactory.BookFactory;
import bookfactory.TextBook;

public class NoteBookFactory implements BookFactory {
    @Override
    public LongNoteBook createLongBook() {
        return new LongNoteBook();
    }

    @Override
    public ShortNoteBook createShortBook() {
        return new ShortNoteBook();
    }

    @Override
    public TextBook createLongTextBook() {
        return null; // Not handled
    }

    @Override
    public TextBook createShortTextBook() {
        return null; // Not handled
    }
}
