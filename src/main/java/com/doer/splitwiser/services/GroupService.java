package com.doer.splitwiser.services;

import com.doer.splitwiser.models.Group;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GroupService {
    public Group createGroup(Group group) {
        return group;
    }

    public Iterable<Group> getAllGroups() {
        return null;
    }

    public Optional<Group> getGroupById(Long id) {
        return null;
    }

    public void deleteById(Long id) {
    }
}
