package ru.mirea.practice.task12;

import java.util.Stack;

public class UndoableStringBuilder {
    private final StringBuilder stringBuilder;
    private final Stack<Action> actions = new Stack<>();

    public UndoableStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public UndoableStringBuilder append(String str) {
        stringBuilder.append(str);
        actions.add(() -> stringBuilder.delete(stringBuilder.length() - str.length() - 1,
            stringBuilder.length()));
        return this;
    }

    public int compareTo(UndoableStringBuilder otherUndoStringBuilder) {
        return stringBuilder.compareTo(otherUndoStringBuilder.getStringBuilder());
    }

    public UndoableStringBuilder delete(int start, int end) {
        String str = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        actions.add(() -> stringBuilder.insert(start, str));
        return this;
    }

    public UndoableStringBuilder deleteCharAt(int idx) {
        char deleteChar = stringBuilder.charAt(idx);
        stringBuilder.deleteCharAt(idx);
        actions.add(() -> stringBuilder.insert(idx, deleteChar));
        return this;
    }

    public int indexOf(String str) {
        return stringBuilder.indexOf(str);
    }

    public UndoableStringBuilder insert(int idx, String str) {
        stringBuilder.insert(idx, str);
        actions.add(() -> stringBuilder.delete(idx, idx + str.length()));
        return this;
    }

    public int lastIndexOf(String str) {
        return stringBuilder.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int idx) {
        return stringBuilder.lastIndexOf(str, idx);
    }

    public UndoableStringBuilder replace(int start, int end, String str) {
        String replaceString = stringBuilder.substring(start, end);
        stringBuilder.replace(start, end, str);
        actions.add(() -> stringBuilder.replace(start, end, replaceString));
        return this;
    }

    public UndoableStringBuilder reverse() {
        stringBuilder.reverse();
        actions.add(stringBuilder::reverse);
        return this;
    }

    public void undo() {
        if (!actions.isEmpty()) {
            actions.pop().undo();
        }
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    private interface Action {
        void undo();
    }
}