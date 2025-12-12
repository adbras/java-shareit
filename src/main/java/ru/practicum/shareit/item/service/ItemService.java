package ru.practicum.shareit.item.service;

import ru.practicum.shareit.item.comment.CommentDto;
import ru.practicum.shareit.item.dto.ItemDto;
import ru.practicum.shareit.item.dto.ItemWithBookingDto;
import ru.practicum.shareit.item.dto.UpdateItemDto;

import java.util.List;

public interface ItemService {
    ItemDto addItem(Long ownerId, ItemDto itemDto);

    ItemDto updateItem(Long ownerId, Long itemId, UpdateItemDto itemDto);

    ItemWithBookingDto getItemById(Long itemId);

    List<ItemWithBookingDto> getAllItemsByOwnerId(Long ownerId);

    List<ItemDto> getAvailableItemsByText(String text);

    CommentDto addComment(Long ownerId, Long itemId, CommentDto commentDto);
}