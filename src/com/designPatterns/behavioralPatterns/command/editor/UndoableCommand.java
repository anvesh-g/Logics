package com.designPatterns.behavioralPatterns.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
