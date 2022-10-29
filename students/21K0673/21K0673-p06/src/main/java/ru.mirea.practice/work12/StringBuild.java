package ru.mirea.practice.work12;

import java.util.Stack;

class StringBuild {
    private StringBuilder builder;

    private interface Action {
        void undo();
    }

    private class DeleteAction implements Action {
        private int size;

        public DeleteAction(int size) {
            this.size = size;
        }

        public void undo() {
            builder.delete(builder.length() - size, builder.length());
        }
    }

    private Stack<Action> actions = new Stack<>();

    public StringBuild() {
        builder = new StringBuilder();
    }

    public StringBuild reverse() {
        builder.reverse();

        Action action = new Action() {
            public void undo() {
                builder.reverse();
            }
        };

        actions.add(action);

        return this;
    }


    public StringBuild append(String str) {
        builder.append(str);

        Action action = new Action() {
            public void undo() {
                builder.delete(
                        builder.length() - str.length() - 1,
                        builder.length());
            }
        };

        actions.add(action);
        return this;
    }

    public StringBuild appendCodePoint(int codePoint) {
        int lenghtBefore = builder.length();
        builder.appendCodePoint(codePoint);
        actions.add(new DeleteAction(builder.length() - lenghtBefore));
        return this;
    }

    public StringBuild delete(int start, int end) {
        String deleted = builder.substring(start, end);
        builder.delete(start, end);
        actions.add(() -> builder.insert(start, deleted));
        return this;
    }

    public StringBuild deleteCharAt(int index) {
        char deleted = builder.charAt(index);
        builder.deleteCharAt(index);
        actions.add(() -> builder.insert(index, deleted));
        return this;
    }

    public StringBuild replace(int start, int end, String str) {
        String deleted = builder.substring(start, end);
        builder.replace(start, end, str);
        actions.add(() -> builder.replace(start, end, deleted));
        return this;
    }

    public StringBuild insert(int index, char[] str, int offset, int len) {
        builder.insert(index, str, offset, len);
        actions.add(() -> builder.delete(index, len));
        return this;
    }

    public StringBuild insert(int offset, String str) {
        builder.insert(offset, str);
        actions.add(() -> builder.delete(offset, str.length()));
        return this;
    }

    public void undo() {
        if (!actions.isEmpty()) {
            actions.pop().undo();
        }
    }

    public String toString() {
        return builder.toString();
    }
}