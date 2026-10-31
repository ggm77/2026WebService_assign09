package com.seohamin.week9.repository;

import com.seohamin.week9.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
