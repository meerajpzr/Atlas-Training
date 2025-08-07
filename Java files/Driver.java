import bookfactory.BookFactory;
import bookfactory.NoteBook;
import bookfactory.TextBook;

public class Driver {
    public static void main(String[] args) {

        // Create notebooks using NoteBookFactory
        BookFactory noteFactory = new NoteBookFactory();
        NoteBook longNote = noteFactory.createLongBook();
        ShortNoteBook shortNote = noteFactory.createShortBook();

        if (longNote != null) longNote.writing();
        if (shortNote != null) shortNote.writing();

        System.out.println();

        // Create textbooks using TextBookFactory
        BookFactory textFactory = new TextBookFactory();
        TextBook longText = textFactory.createLongTextBook();
        TextBook shortText = textFactory.createShortTextBook();

        if (longText != null) longText.reading();
        if (shortText != null) shortText.reading();
    }
}
