package ru.mirea.practice.task13;

public class StringBuilderPublisher {
    private final StringBuilder stringBuilder;
    private OnStringBuilderChangeListener listener;

    public StringBuilderPublisher() {
        this.stringBuilder = new StringBuilder();
    }

    public void setListener(OnStringBuilderChangeListener listener) {
        this.listener = listener;
    }

    public void notifyListener() {
        if (listener != null) {
            listener.onChange(this);
        }
    }

    public StringBuilderPublisher append(String str) {
        stringBuilder.append(str);
        notifyListener();
        return this;
    }

    public StringBuilderPublisher delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyListener();
        return this;
    }

    public StringBuilderPublisher deleteCharAt(int idx) {
        stringBuilder.deleteCharAt(idx);
        notifyListener();
        return this;
    }

    public StringBuilderPublisher insert(int idx, String str) {
        stringBuilder.insert(idx, str);
        notifyListener();
        return this;
    }

    public int lastIndexOf(String str) {
        return stringBuilder.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int idx) {
        return stringBuilder.lastIndexOf(str, idx);
    }

    public int indexOf(String str) {
        return stringBuilder.indexOf(str);
    }

    public StringBuilderPublisher replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        notifyListener();
        return this;
    }

    public StringBuilderPublisher reverse() {
        stringBuilder.reverse();
        notifyListener();
        return this;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    public int length() {
        return stringBuilder.length();
    }
}
