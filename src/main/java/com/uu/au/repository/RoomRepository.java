package com.uu.au.repository;

import com.uu.au.models.Room;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository
        extends JpaRepository<Room, Long> {
        Optional<Room> findByName(String name);
}