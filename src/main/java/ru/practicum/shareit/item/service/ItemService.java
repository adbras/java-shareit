package ru.practicum.shareit.item.service;

import ru.practicum.shareit.item.dto.ItemDto;
import ru.practicum.shareit.item.dto.UpdateItemDto;

import java.util.List;

public interface ItemService {
    ItemDto addItem(Long ownerId, ItemDto itemDto);

    ItemDto updateItem(Long ownerId, Long itemId, UpdateItemDto itemDto);

    ItemDto getItemById(Long itemId);

    List<ItemDto> getAllItemsByOwnerId(Long ownerId);

    List<ItemDto> getAvailableItemsByText(String text);
}