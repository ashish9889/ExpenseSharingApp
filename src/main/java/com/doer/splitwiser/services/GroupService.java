package com.doer.splitwiser.services;

import com.doer.splitwiser.models.Group;
import com.doer.splitwiser.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

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
