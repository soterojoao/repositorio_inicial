package com.rodrigopeleias.bookstoremanager.books.builder;

import com.rodrigopeleias.bookstoremanager.author.builder.AuthorDTOBuilder;
import com.rodrigopeleias.bookstoremanager.author.dto.AuthorDTO;
import com.rodrigopeleias.bookstoremanager.books.dto.BookResponseDTO;
import com.rodrigopeleias.bookstoremanager.publishers.builder.PublisherDTOBuilder;
import com.rodrigopeleias.bookstoremanager.publishers.dto.PublisherDTO;
import com.rodrigopeleias.bookstoremanager.users.builder.UserDTOBuilder;
import com.rodrigopeleias.bookstoremanager.users.dto.UserDTO;
import lombok.Builder;

@Builder
public class BookResponseDTOBuilder {

    @Builder.Default
    private final Long id = 1L;

    @Builder.Default
    private final String name = "Spring Boot Pro";

    @Builder.Default
    private final String isbn = "978-3-16-148410-0";

    @Builder.Default
    private final PublisherDTO publisher = PublisherDTOBuilder.builder().build().buildPublisherDTO();

    @Builder.Default
    private final AuthorDTO author = AuthorDTOBuilder.builder().build().buildAuthorDTO();

    @Builder.Default
    private final Integer pages = 200;

    @Builder.Default
    private final Integer chapters = 10;

    private final UserDTO userDTO = UserDTOBuilder.builder().build().buildUserDTO();

    public BookResponseDTO buildBookResponse() {
        return new BookResponseDTO(id,
                name,
                isbn,
                pages,
                chapters,
                author,
                publisher);
    }

}
