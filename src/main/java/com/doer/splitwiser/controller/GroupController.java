package com.doer.splitwiser.controller;

import com.doer.splitwiser.models.Group;
import com.doer.splitwiser.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @PostMapping
    public Group createGroup(@RequestBody Group group) {

        return groupService.createGroup(group);
    }

    @GetMapping
    public Iterable<Group> getAllGroups() {
        return groupService.getAllGroups();
    }

    @GetMapping("/{id}")
    public Group getGroupById(@PathVariable Long id) {

        return groupService.getGroupById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Group updateGroupById(@PathVariable Long id, @RequestBody Group updatedGroup) {
        Group group = groupService.getGroupById(id).orElse(null);

        if (group != null) {
            group.setName(updatedGroup.getName());
            return groupService.createGroup(group);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteGroupById(@PathVariable Long id) {

        groupService.deleteById(id);
    }
}