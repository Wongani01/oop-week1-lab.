package com.zut;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class ContactManagerTest {

    @Test
    void addingContactIncreasesSize() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ben", "093"));
        assertEquals(1, contacts.size());
    }

    @Test
    void hashSetRejectsDuplicateNumber() {
        Set<String> numbers = new HashSet<>();
        numbers.add("097");
        numbers.add("097");
        assertEquals(1, numbers.size());
    }

    @Test
    void mapReturnsNullForMissingKey() {
        Map<String, Contact> phoneBook = new HashMap<>();
        phoneBook.put("097", new Contact("Jacob", "097"));
        assertNull(phoneBook.get("000"));
    }

    @Test
    void hashSetDoesNotDetectDuplicateContactsWithoutEqualsOverride() {
        Set<Contact> uniqueContacts = new HashSet<>();
        uniqueContacts.add(new Contact("Jacob", "091"));
        uniqueContacts.add(new Contact("Jacob", "091"));
        assertEquals(2, uniqueContacts.size());
    }
}