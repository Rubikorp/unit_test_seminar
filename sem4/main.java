import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    @Test
    public void testGetBook() {
        // Arrange
        Book book = new Book("title", "author", 10);
        when(bookRepository.getBook(10)).thenReturn(book);

        // Act
        Book result = bookService.getBook(10);

        // Assert
        assertEquals(book, result);
        verify(bookRepository, times(1)).getBook(10);
    }
    
    @Test
    public void testAddBook() {
        // Arrange
        Book book = new Book("title", "author");
        when(bookRepository.addBook(book)).thenReturn(true);

        // Act
        boolean result = bookService.addBook(book);

        // Assert
        assertTrue(result);
        verify(bookRepository, times(1)).
        addBook(book);
    }   
}

